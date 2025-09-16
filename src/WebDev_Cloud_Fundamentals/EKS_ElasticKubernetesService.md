# Elastic Kubernetes Service

Amazon Elastic Kubernetes Service(EKS) is a fully managed service that you can use to run Kubernetes on Amazon Web Service. 
Kubernetes is open-source software that enables you to install and manage applications at a high scale. 

## What is Amazon EKS

Amazon Elastic Kubernetes Service (EKS) is a fully managed service that simplifies the process of running Kubernetes on AWS. 
With EKS you can easily deploy manage and scale containerized applications using Kubernetes without the need to install and operate your own control plane or nodes

## Benefits of EKS

- Seameless integration with other AWS services
- manages the Kubernetes control plane which is automatically distributed across multiple availability zones.
- AutoScaling and scalability features
- Multi region support

## How Amazon EKS Works

- Amazon Elastic Kubernetes Service (EKS) simplifies running Kubernetes clusters on AWS by managing the control plane while allowing you to focus on application deployment and scaling.
- <u>Control Plane (AWS Managed)</u>: The control plane is managed by AWS and is responsible for handling the core management tasks of the Kubernetes cluster. 
Since this is handled by AWS it ensures high availability acorss multiple zones.
- <u>Worker nodes (Customer Managed)</u>: Runs the actual application workloads. Each worker node runs multiple pods.
Worker nodes are deployed across different Availability Zones ensuring fault tolerance and scalability. You can scale the number of worker nodes depending on the application load making it flexible to meet changing requirements. 
- <u>DaemonSets</u>: A DaemonSet ensures that a copy of a pod runs on all worker nodes or a selected group of them. In EKS DaemonSets are often used for tasks like
    - Log collection
    - Monitoring
    - Running essential services like networking or security agents on each node.

## Amazon EKS Workflow
1. Provision an EKS Cluster (Masters) : When you create a cluster --> EKS automatically deploys Kubernetes master nodes
--> These master nodes are managed by AWS handling Kubernetes tasks such as scheduling pods maintaining cluster state and managing API requests.                                        
2. Provision Worker Nodes : After the EKS cluster (control plane) is up and running, you can provision worker nodes that will run your application workloads.
--> Worker nodes are instances that run in your AWS account and communicate with the master nodes
--> These nodes can automatically scale based on the workload ensuring that you have the resources needed to handle dynamic demand.
3. Connect to EKS : Once the EKS cluster is running with worker nodes: You can connect to the EKS cluster using Kubernetes command-line tools such as kubectl.
--> By pointing your Kubernetes tooling at the EKS cluster, you can start deploying applications.
4. Deploy and Run Kubernetes Applications : With the cluster set up and connected: You can deploy your containerized applications onto the worker nodes.
--> Kubernetes orchestrates these deployments, ensuring containers are distributed across the nodes and scaling them as needed.
--> Applications can be updated, scaled, and monitored using Kubernetes-native features such as deployments, services, and DaemonSets.
                                            

## Summary 

Amazon EKS offers a robust, fully managed Kubernetes service that:  
- simplifies container orchestration and allows organizations to focus on building and scaling their applications
- rather than managing Kubernetes infrastructure. 

With features like automatic control plane management, deep integration with AWS services, and high availability across multiple Availability Zones: 
- EKS provides a reliable, scalable, and secure platform for running containerized workloads.