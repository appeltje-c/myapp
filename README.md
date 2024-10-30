# Deployment Setup

1. Spring Boot
    - maven clean install
    - maven release [version]

2. Docker
    build image
    - docker build -t martijnbenjamin/myapp:[version] .

    test image
    - docker run -p 8080:8080 martijnbenjamin/myapp:[version]

3. Push to registry

   docker push martijnbenjamin/myap[version]





    start minikube
    - minikube start

    run helm
    - helm install rest-service-complete ./rest-service-complete-chart


https://www.youtube.com/watch?v=M6ZavWvKlcc&ab_channel=kodEdge


https://www.youtube.com/watch?v=MeU5_k9ssrs&ab_channel=TechWorldwithNana
