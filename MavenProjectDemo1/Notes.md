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

## he lifecycle of a Spring bean consists of the following phases, which are listed below
   
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

