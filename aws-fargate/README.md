# AWS-Fargate

Simple setup to toy with blue/green deployments on AWS

Includes terraform plan that creates the following (with some ancillary resources to tie things up);
- An ECR for storing the app image
- CodeDeploy application with two deployment targets (blue & green)
  - setup to manage deployments on ECR push
- An ECS cluster backed by fargate for hosting the app 
- Load balancer on top to provide access to the ECS over the two deployment targets
- VPC for providing access between resources


## Known gaps
- no SSL on web servers
