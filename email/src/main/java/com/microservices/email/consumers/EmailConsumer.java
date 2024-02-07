package com.microservices.email.consumers;

import com.microservices.email.dtos.EmailDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {
    //Metodo ouvinte, que vai consumir as mensagens da fila
    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailDto emailDto){
        System.out.println(emailDto.emailTo());

    }
}
