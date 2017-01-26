# RabbitMQExample
# RabbitMQExample
This is an example on how to publish and consume simple text messages using RabbitMQ. Please go through the instructions if you are the new user and never worked on Rabbit MQ.

For the first time: Installing Rabbit MQ in Windows
----------------------------------------------------


1) Install Erlang/OTP 19.2 Windows 32/64-bit Binary File for Erlang/OTP from http://www.erlang.org/downloads. This is the pre-requisite to install Rabbit MQ in your system. It will take around 5 minutes. Once download complete install the Erlang/OTP


2) Download rabbit mq from https://www.rabbitmq.com/install-windows.html. Install the software.

Now the setup is done. You can run the application. First you need to run the Receiver.java application. The receiver application will wait to receive any messages that is sent by the sender.

Once Receiver.java is run, now you need to run Sender.java which will send the message. You can see that as soon as Sender.java sends messages, the Receiver.java will receive those messages.
