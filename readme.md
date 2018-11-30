## before exec in local with docker

* config-service must be started, before other services start up

# Micro Service Architecture Example

spring boot zuul을 이용한 마이크로 서비스 아키텍쳐  

## Environment

* java 1.8
* spring boot 2.0.5
* docker

## 실행 순서

1. docker(mysql)
2. config
3. discovery, gateway
4. others

#### 실행 시 주의사항

config서버로부터 설정을 가져올 경우, 가져올 설정 환경에 따라 profile을 설정해서 실행해야 한다.

### discovery-service

Eureka 서버, 다른 어플리케이션 서비스들을 등록하고 갱신해주는 역활을 한다.  
실행 후 http://127.0.0.1:8761 에서 대시보드를 볼 수 있다.

### gateway-service

라우팅의 역활을 한다. 각각의 서비스를 등록하면 설정해놓은 endpoint로 보내주게 된다.

### config-service

Config 서버, 각종 설정파일들을 관리하는 어플리케이션이다. 각각 다른 서비스들에서 (설정을 가져오도록 한다면) 처음 실행시 이 서비스에로부터 `프로파일에 맞는 설정`을 획득하여 사용한다.  

설정파일이 저장되는 위치는 config-service의 classpath://config로 설정되어 있으며 git을 이용하여 저장소처럼 사용하는것도 가능하다.  

역활의 특성 때문에 gateway를 사용하지 않아도 되기 때문에 zuul서버에 등록하지 않아도 되고 따라서 eureka에 필수로 등록하지는 않아도 된다.

### auth-service

인증서버, 서비스로서 등록되며 가입 부분이 포함되어 있다. jwt를 기반으로 하며 다른 서비스에서는 jwt에 대한 검증을 한 후 여기에 있는 권한을 확인한다.
