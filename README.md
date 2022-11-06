# EnterprisePatterns
Enterprise Integration Patterns:
There patterns provide technology-independent design guidance for developers and architects to describe and develop robust integration solutions

- Messaging
- REST



**Keywords:**

DSL - Domain Specific Language
RouteBuilder
```
import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder extends RouteBuilder {

public void configure() {
  // Define routing rules here:
  from("file:src/data?noop=true").to("file:target/messages");

  // More rules can be included, in you like.
  // ...
}
}
```


**Reference Links:**

[Spring Integration](https://spring.io/projects/spring-integration/)

[Apache Camel](https://camel.apache.org/)

[Mule](https://developer.mulesoft.com/)

[Martin Flower](https://www.oreilly.com/library/view/enterprise-integration-patterns/0321200683/pref03.html)

[Link1](https://access.redhat.com/documentation/en-us/red_hat_fuse/7.7/html/apache_camel_development_guide/fusemrstartedblocks)
