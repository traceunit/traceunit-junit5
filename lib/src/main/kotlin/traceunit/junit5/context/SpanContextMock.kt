package traceunit.junit5.context

import io.opentelemetry.api.trace.SpanContext
import io.opentelemetry.api.trace.TraceFlags
import io.opentelemetry.api.trace.TraceState

class SpanContextMock : SpanContext {
    override fun getTraceId(): String {
        return "00000000000000000000000000000000"
    }

    override fun getSpanId(): String {
        return "000000000000"
    }

    override fun getTraceFlags(): TraceFlags {
        return TraceFlags.getDefault()
    }

    override fun getTraceState(): TraceState {
        return TraceState.getDefault()
    }

    override fun isRemote(): Boolean {
        return false
    }
}