package traceunit.junit5

import io.opentelemetry.api.trace.Span
import org.junit.jupiter.api.extension.*
import traceunit.junit5.annotations.MockTracer

class TraceunitExtension : TestInstancePostProcessor, BeforeEachCallback, AfterEachCallback, ParameterResolver {
    lateinit var tracerMock: TracerMock
    lateinit var rootSpan: Span
    override fun postProcessTestInstance(testInstance: Any?, context: ExtensionContext?) {
        tracerMock = TracerMock()
    }

    override fun beforeEach(context: ExtensionContext?) {
        rootSpan = tracerMock.spanBuilder("root").startSpan()
        rootSpan.makeCurrent()
        var testInstance = context?.testInstance?.get() ?: return
        testInstance.javaClass.declaredFields.forEach {
            it.isAccessible = true
            if (it.isAnnotationPresent(MockTracer::class.java)) {
                it.set(testInstance, tracerMock)
            }
        }
    }

    override fun afterEach(context: ExtensionContext?) {
        rootSpan.end()
    }

    override fun supportsParameter(parameterContext: ParameterContext?, extensionContext: ExtensionContext?): Boolean {
        return false
    }

    override fun resolveParameter(parameterContext: ParameterContext?, extensionContext: ExtensionContext?): Any {
        return false
    }
}