# Notes 

## Ways to control beans 

- XML based config
- Annotation Configuration 
- Component Scan 

## Bean Life Cycle 
- Refers to when & how the bean is instantiated, what action it performs until it lives, and when & how it is destroyed.
- When a Spring Container creates a bean, it provides two methods to every bean by default. These are ... 
  - public void init() : If we want to initialize anything such as loading some configurations, creating database connections, we can write that code in init() method.
  - public void destroy() : If we want to cleanup something such as closing database connections, we can write that code in destroy() method.

## The lifecycle of a Spring bean consists of the following phases, which are listed below
   
1. Container Started: The Spring IoC container is initialized.
2. Bean Instantiated: The container creates an instance of the bean.
3. Dependencies Injected: The container injects the dependencies into the bean.
4. Custom init() method: If the bean implements InitializingBean or has a custom initialization method specified via @PostConstruct or init-method.
5. Bean is Ready: The bean is now fully initialized and ready to be used.
6. Custom utility method: This could be any custom method you have defined in your bean.
7. Custom destroy() method: If the bean implements DisposableBean or has a custom destruction method specified via @PreDestroy or destroy-method, it is called when the container is shutting down.
  
## Bean - Scope 

- Singleton : A single bean definition to a single object instance for each Spring IoC container.
- Prototype : a single bean definition to any number of object instances
- Session : Scopes a single bean definition to the lifecycle of an HTTP Session.
- Request : Scopes a single bean definition to the lifecycle of a single HTTP request. That is, each HTTP request has its own instance of a bean created off the back of a single bean definition.

## Lets talk about IOC 

Inversion of Control : 
Inversion of control is a design principle, where the framework handles the creation and configuration of the objects(beans) or their entire lifecycle. 

In Spring, Inversion of Control (IoC) is achieved through the Spring IoC container, which manages the lifecycle of Java objects (beans) and their dependencies. 
This management can be configured using various approaches
- <u><b>XML</b></u> : You load the XML configuration into an ApplicationContext implementation (e.g., ClassPathXmlApplicationContext) to initialize the Spring IoC container.
- <u><b>Configuration class</b></u>   : You define a @Configuration class to enable component scanning and potentially define @Bean methods for more complex bean creation.
  - Instantiating the Container: Use AnnotationConfigApplicationContext to load the annotation-based configuration.
  - 
- <u><b>Annotation Component Based</b></u>    : Spring can automatically detect and register beans marked with specific annotations.
  - @Component and its Stereotypes:
      - @Component: A generic stereotype for any Spring-managed component.
      - @Service: Indicates a service layer component.
      - @Repository: Indicates a data access layer component.
      - @Controller: Indicates a web layer component (in Spring MVC).
- Dependency Injection with @Autowired: You use @Autowired to automatically inject dependencies into fields, constructors, or setter methods.

## Dependency Injection 

### @Autowired 

@Autowired is an annotation provided by Spring to automatically inject dependencies into a Spring-managed bean (also known as dependency injection or DI). 
It tells Spring where and how to inject the required dependency.

Spring supports three types of DI:

- Constructor Injection
- Setter Injection
- Field Injection

You can use @Autowired with all of them.





 

