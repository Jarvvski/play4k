app_name             = "hello-world"
environment          = "dev"
container_image      = "nginx:latest"
container_port       = 80
health_check_path    = "/"
vpc_cidr             = "10.0.0.0/16"
availability_zones   = ["eu-west-2a", "eu-west-2b"]
