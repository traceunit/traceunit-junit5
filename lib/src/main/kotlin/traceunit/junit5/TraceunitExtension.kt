package traceunit.junit5

import org.junit.jupiter.api.extension.*

class TraceunitExtension : TestInstancePostProcessor, BeforeEachCallback, AfterEachCallback, ParameterResolver {
    override fun postProcessTestInstance(testInstance: Any?, context: ExtensionContext?) {
        TODO("Not yet implemented")
    }

    override fun beforeEach(context: ExtensionContext?) {
        TODO("Not yet implemented")
    }

    override fun afterEach(context: ExtensionContext?) {
        TODO("Not yet implemented")
    }

    override fun supportsParameter(parameterContext: ParameterContext?, extensionContext: ExtensionContext?): Boolean {
        TODO("Not yet implemented")
    }

    override fun resolveParameter(parameterContext: ParameterContext?, extensionContext: ExtensionContext?): Any {
        TODO("Not yet implemented")
    }
}