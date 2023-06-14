# hello-api
Simple API to use to test Docker and Kubernetes

==================================================================

Docker

===================================================================


Build image:

docker build ./ -t repo name/image name:tag

Push image to Docker Hub:

docker login

docker push repo name/image name:tag

Run container (it contains docker pull, docker create and docker start commands):

docker run -d -p 8080:8080 --name hello-container repo name/image name

======================================================================

Kubernetes

=======================================================================

Apply deployment:

kubectl apply -f deployment_version1.yaml

Upgrade application: 

kubectl apply -f deployment_version2.yaml

Rollback application to previous version:

kubectl rollout undo deployment/hello
test
