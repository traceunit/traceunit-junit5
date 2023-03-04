package traceunit.junit5

import io.opentelemetry.api.trace.Span
import io.opentelemetry.api.trace.Tracer

class ClassToMock(private val tracer: Tracer, private val otherClassToInject: OtherClassToInject) {
    fun trace() {
        val current = Span.current()
        val span1 = tracer.spanBuilder("span1").startSpan()
        span1.addEvent("Logged something")
        span1.end()
    }
}