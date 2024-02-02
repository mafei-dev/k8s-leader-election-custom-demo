./mvnw clean install
docker build -t mafeidev/k8s-leader-election-custom-demo:1.0.3 .
docker push mafeidev/k8s-leader-election-custom-demo:1.0.3