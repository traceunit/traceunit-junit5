package traceunit.junit5.span

import io.opentelemetry.api.common.AttributeKey
import io.opentelemetry.api.common.Attributes
import io.opentelemetry.api.trace.Span
import io.opentelemetry.api.trace.SpanBuilder
import io.opentelemetry.api.trace.SpanContext
import io.opentelemetry.api.trace.SpanKind
import io.opentelemetry.context.Context
import java.util.concurrent.TimeUnit

class MockedSpanBuilder: SpanBuilder {
    override fun setParent(context: Context): SpanBuilder {
        TODO("Not yet implemented")
    }

    override fun setNoParent(): SpanBuilder {
        TODO("Not yet implemented")
    }

    override fun addLink(spanContext: SpanContext): SpanBuilder {
        TODO("Not yet implemented")
    }

    override fun addLink(spanContext: SpanContext, attributes: Attributes): SpanBuilder {
        TODO("Not yet implemented")
    }

    override fun setAttribute(key: String, value: String): SpanBuilder {
        TODO("Not yet implemented")
    }

    override fun setAttribute(key: String, value: Long): SpanBuilder {
        TODO("Not yet implemented")
    }

    override fun setAttribute(key: String, value: Double): SpanBuilder {
        TODO("Not yet implemented")
    }

    override fun setAttribute(key: String, value: Boolean): SpanBuilder {
        TODO("Not yet implemented")
    }

    override fun <T : Any?> setAttribute(key: AttributeKey<T>, value: T): SpanBuilder {
        TODO("Not yet implemented")
    }

    override fun setSpanKind(spanKind: SpanKind): SpanBuilder {
        TODO("Not yet implemented")
    }

    override fun setStartTimestamp(startTimestamp: Long, unit: TimeUnit): SpanBuilder {
        TODO("Not yet implemented")
    }

    override fun startSpan(): Span {
        return SpanMock()
    }
}