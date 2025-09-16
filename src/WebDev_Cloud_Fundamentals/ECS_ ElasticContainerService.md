# ECS - Elastic Container service

A fully managed service that enables users to run Docker-based applications in containers across a cluster of EC2 instances. 
ECS simplifies container orchestration, allowing you to deploy, manage, and scale containerized applications efficiently.

## How Elastic Container Service Works?

A fully managed service provided by AWS. 
mainly used to deploy containers that are docker based by which you scale up and down depending on the traffic you're going to get. 
The containers will run inside the Amazon elastic cloud (EC2) instance.

- Container: A container is a package that holds an application and everything (dependencies, libraries, etc.) the application requires to run. 
Containers are independent of the underlying operating system and hence container applications are fairly portable, flexible, and scalable. 
This ensures the application will run always as expected irrespective of the system and environment in which a container is run.
- Docker: Docker is software that facilitates and automates the installation and deployment of applications inside Linux containers.
- Cluster: A logic group of EC2 instances running as a single application.
- Container Instance: Each EC2 in an ECS Cluster is called a container instance

## Amazon ECS Terminologies and Components

1. Provisioning : Provisioning tools help set up and manage ECS resources:
    - AWS CLI: Command-line interface for direct control.
    - Copilot: Simplifies ECS workflows.
    - Management Console: Graphical interface for ECS management.
    - AWS CDK & SDK: Enables infrastructure as code and custom integrations.
2. Controller : The ECS Scheduler manages and distributes tasks, balancing workloads and ensuring availability across clusters.
3. Capacity Options : Amazon ECS supports different capacity options
    - Amazon EC2 Instances: Customizable virtual machine hosting.
    - Fargate: Serverless container hosting without infrastructure management.
    - On-Premises Compute: Extends ECS to on-premises servers for hybrid solutions.

## Features of ECS

- Removes the need for users to manage their CPU types
- Allows seamless deployment of container-based applications.
- AWS ECS takes care of the management and monitoring of the application cluster.
- Amazon ECS is region specific. This means that a cluster can only scale up/down in a single region.
- Clusters are dynamically scalable.

## Advantages of ECS

- Scalability: ECS automatically scales your applications based on demand, allowing you to easily handle changes in traffic or workload.
- High availability: ECS provides built-in availability and fault tolerance
- Cost-effective: ECS enables you to optimize your infrastructure costs by scaling resources based on demand and only paying for what you use.
- Integration: ECS integrates with other AWS services such as Amazon ECR, AWS Fargate, Amazon CloudWatch, and AWS IAM.
- Security: ECS provides a secure environment to run your applications, with features such as IAM roles for tasks, VPC isolation, and encryption at rest.

## Summary 

ECS is a robust, fully managed container orchestration service that empowers businesses to build, deploy, and scale containerized applications with ease.
ECS is particularly well-suited for companies looking to optimize infrastructure, from small startups leveraging microservices architecture to large enterprises handling high traffic or complex data workflows.