### Spring boot Server-Sent Events

An example on how to create server-sent events using the Spring Framework. The Angular frontend is consuming the message through the `EventSource` javascript API.

![Screenshot](imgs/screenshot.png "Screenshot")

### Run the application
The Spring Boot is running in port `666` with the available endpoints:
- GET `/api/v1/messages/stream` - Endpoint for the messages stream.
- POST `/api/v1/messsages` - Posts a new message which is then relayed by the above endpoint (messages are not persisted). This endpoint is expecting a body of the type `{"from": "The name you want", "content": "The message you want"}`.

You can run the frontend through Angular's CLI command `ng serve`.
