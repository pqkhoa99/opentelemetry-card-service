java -javaagent:opentelemetry-javaagent.jar -Dotel.traces.exporter=logging -Dotel.metrics.exporter=logging -Dotel.logs.exporter=logging -jar build/libs/cardservice-0.0.1-SNAPSHOT.jar
$ gradle jibDockerBuild -Djib.dockerClient.executable=/usr/local/bin/docker
