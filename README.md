# Deployment Setup

1. Spring Boot
    - maven clean install

2. Docker
    build image
    - docker build -t martijnbenjamin/myapp:latest .

    test image
    - docker run -p 8080:8080 martijnbenjamin/myapp:latest

3. Push to registry

   docker push martijnbenjamin/myap





    start minikube
    - minikube start

    run helm
    - helm install rest-service-complete ./rest-service-complete-chart


https://www.youtube.com/watch?v=M6ZavWvKlcc&ab_channel=kodEdge


ArgoCD Password:
gmAK1ttZIHebFyAQ

https://www.youtube.com/watch?v=MeU5_k9ssrs&ab_channel=TechWorldwithNana