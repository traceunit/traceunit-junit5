# TraceUnit extension for Junit5

TraceUnit is a library that helps with Opentelemetry tracing mocking/testing



## How to:

Add dependency to your project

For maven: 
```
<dependency>
  <groupId>io.github.traceunit</groupId>
  <artifactId>traceunit-junit5</artifactId>
  <version>0.0.4</version>
  <scope>test</scope>
</dependency>
```
For Gradle:
```
testImplementation 'io.github.traceunit:traceunit-junit5:0.0.4'
```

1. Extend your test class with `TraceUnitExtension`:
```java
@ExtendWith({TraceUnitExtension.class})
```

`Span.current()` will be automatically mocked after this step

2. Annotate Tracer mock with `@MockTracer`
```java
@MockTracer
Tracer tracer;
```

4. Inject mocked item into any test class:
```
    @BeforeEach
    void setUp() {
        testService = new TestService();
        testService.tracer = tracer;
```