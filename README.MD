## Description

Two different projects in order to reproduce a problem with Spring Rabbit when using RabbitAdmin to creat the queues the recovery mechanism does not work after a restart of the RabbitMQ server.

## Requirements
In order to run the projects a running instance of RabbitMQ is needed.

# Running the app
1. Run the Application of one of the projects.
1. Restart the RabbitMQ server.

## Expected Results
In the spring-rabbitmq-recovery-rabbit-admin application, after the RabbitMQ server completes the restart an entry in the log will appear:

`Caused by: com.rabbitmq.client.ShutdownSignalException: channel error; protocol method: #method<channel.close>(reply-code=404, reply-text=NOT_FOUND - no queue 'demo.queue' in vhost '/', class-id=50, method-id=10)`

The spring-rabbitmq-recovery-rabbit-admin application will be unable to reconnect.

In the spring-rabbitmq-recovery-bean-queue application, after the RabbitMQ server completes the restart the application will be able to reconnect without problems.
