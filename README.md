<h1 align="center">
Spring Boot Application with Kotlin and mongodb crud
</h1>
<img src="https://miro.medium.com/max/1000/0*J88jEbJzlZ7pKKOP." width="500px" height="400px"/>

# ***Deploy MongoDB as a Container***

As the first step, let’s pull the mongo image from the Docker Hub registry:
```
docker pull mongo
```
After the image is pulled, let’s deploy it in a detached mode ( -d flag):
```
docker run -d -p 27017-27019:27017-27019 --name mongodb mongo
```
Besides deploying in a detached mode, the above command publishes the container’s ports to the host- in simple terms, we will be able to connect to the MongoDB using localhost.

To validate, if everything is OK, let’s run the following command:
```
docker ps

#command output

CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS              PORTS                                  NAMES
26bd5c8dcc79        mongo               "docker-entrypoint.s…"   6 seconds ago       Up 5 seconds        0.0.0.0:27017-27019->27017-27019/tcp   mongodb
```
