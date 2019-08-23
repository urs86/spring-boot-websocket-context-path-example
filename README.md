# WebSockets in a Spring Boot Application

- `/app/user` - Message Mapping URL
- `/topic/user` - Message Broker topic for pushing messages to the UI back.


### Running through a gateway (gravitee in my case) with a context path

- configure a new API in gravitee UI manager (with context path /websocket - in my case)
- at gateway, put http://YOUR_PUBLIC_IP:8092/
- you can access it on http://YOUR_GATEWAY_IP:GATEWAY_PORT/websocket/ws/
