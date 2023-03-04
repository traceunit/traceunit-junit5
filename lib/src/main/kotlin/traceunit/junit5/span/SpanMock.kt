package traceunit.junit5.span

import io.opentelemetry.api.common.AttributeKey
import io.opentelemetry.api.common.Attributes
import io.opentelemetry.api.trace.Span
import io.opentelemetry.api.trace.SpanContext
import io.opentelemetry.api.trace.StatusCode
import traceunit.junit5.context.SpanContextMock
import java.util.concurrent.TimeUnit

class SpanMock : Span {
    override fun <T : Any?> setAttribute(key: AttributeKey<T>, value: T): Span {
        return this
    }

    override fun addEvent(name: String, attributes: Attributes): Span {
        return this
    }

    override fun addEvent(name: String, attributes: Attributes, timestamp: Long, unit: TimeUnit): Span {
        return this
    }

    override fun setStatus(statusCode: StatusCode, description: String): Span {
        return this
    }

    override fun recordException(exception: Throwable, additionalAttributes: Attributes): Span {
        return this
    }

    override fun updateName(name: String): Span {
        return this
    }

    override fun end() {

    }

    override fun end(timestamp: Long, unit: TimeUnit) {

    }

    override fun getSpanContext(): SpanContext {
        return SpanContextMock()
    }

    override fun isRecording(): Boolean {
        return true
    }
}