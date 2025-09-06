# ServerLess Architecture 

Developing an app without having to manage servers and physical machines. <br>
This is also called cloud serverless architecture or serverless computing. 
In this model, a cloud service provider manages, scales and maintains the servers without any help from the developer.
<br>A very common example is - AWS Lambda.
<br>In a serverless model, the developers they focus on writing and deploying code, 
and businesses hire or invest in a cloud provider to run servers, databases and storage systems. This helps in flexibility and makes the development more cost effective and reduces overhead.<br>

### Real World Example 
- Netflix
- Slack
- Uber, 
and perhaps more. 

Serverless architecture is said to be relatively new, but a lot of companies have started to move to wards this approach and implementing it. <br>

A serverless architecture is not completely serverless, it is just that the servers are not responsibility of the  business or the devs.
Instead third party cloud providers help manage, maintain and scale those servers. <br>
These 3rd party providers can either be a FAAS(Function as a service) or PAAS(Platform as a service).
Difference being PAAS offers a more comprehensive environment while FAAS focuses on a particular function.
<br>

Within a serverless computing, the function code executes based on events and triggers. 
These events can be use user actions, system events or messages fro other services.  

### Benefits 
- Reduced Costs : optimizes server space / can provide affordable pay-as-you-go plans.
/ Zero server management costs as cloud service providers handle infra for you
- Faster Updates : since server side maintanence is not done by devs then can dedicatemore time building high quality apps. 
/ Businesses are not responsible for scaling or resourcing, that allows them to write do updates without additoinal tasks 
- More time for innovation : Removing the burden of server management through serverless architecture empowers businesses to redirect their focus toward innovation. 
/ Organizations can allocate more resources to areas that drive innovation, such as improving user experience (UX) or developing new offerings.

### Drawbacks 
- Reliance on a third party : Businesses then have a limited control over the infrastructure provided by cloud vendors. / 
Things like configuration and maintainence would not be managed internally, 
leaving the org vulnerable to risks, like server disruptions and performance issues, etc. 
- Testing Difficulties : Testing code using serverless architecture requires you to test each individual function and validate its integration and interaction with other serverless functions. 
- Not ideal for long-running processes : not suited for long-running processes because they may surpass time limits resulting in timeouts and data loss. 


## AWS Lambda

This is a serverless computing service provided by AWS. Users of AWS Lambda create functions, self contained applications written in one of the supported languages and upload them to AWS Lambda.
These can then be executed in a flexible and efficient manner.<br>
These functions can perform any kind o computing tasks from serving webpages, and processing streams of data to calling APIs and integrating with other services.
<br>
AWS Lambda is a fully managed service that takes care of all the infrastructure for you.

###  Why is AWS Lambda an essential part of the Serverless architecture?

When building Serverless applications, AWS Lambda is one of the main candidates for running the application code. 
Typically, to complete a Serverless stack you’ll need:

- a computing service;
- a database service; and
- an HTTP gateway service.


Lambda fills the primary role of the compute service on AWS. 
It also integrates with many other AWS services 
and, together with API Gateway, DynamoDB and RDS, forms the basis for Serverless solutions for those using AWS. 
Lambda supports many of the most popular languages and runtimes. 
So it’s a good fit for a wide range of Serverless developers.

### Benefits of AWS Lambda

- Pay per use
- Fully Managed infrastructure
- Automatic Scaling 

### Limitations 

- Cold start time : When a function is started in response to an event, there maybe a small latency b/w event and when function runs. 
This can make it hard to rely on AWS Lambda for latency critical applications. Work around are however available. 
-  Function Limits : Execution time 



