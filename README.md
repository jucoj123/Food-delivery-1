# 

## Model
www.msaez.io/#/storming/B9uQPTdu5XOzlajMoUvUuxH3ZHz1/0419ebac2b147f9e26013317f34c1e1f

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic 
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- front
- store
- delivery
- customer


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- front
```
 http :8088/orders orderid="orderid" foodid="foodid" customerid="customerid" options="options" address="address" status="status" preference="preference" 
 http :8088/payments payid="payid" orderid="orderid" 
```
- store
```
 http :8088/stores sotreid="sotreid" foodid="foodid" orderid="orderid" status="status" prefernece="prefernece" 
```
- delivery
```
 http :8088/deliveries deliveryid="deliveryid" address="address" orderid="orderid" customerid="customerid" status="status" 
```
- customer
```
 http :8088/notifications id="id" customerid="customerid" message="message" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

