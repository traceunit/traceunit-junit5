package traceunit.junit5

import io.opentelemetry.api.trace.Span
import io.opentelemetry.api.trace.Tracer

class OtherClassToInject(private val tracer: Tracer) {
    fun trace() {

    }
}