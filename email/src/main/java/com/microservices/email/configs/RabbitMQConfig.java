package com.microservices.email.configs;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

@Configuration
public class RabbitMQConfig {
    @Value("${broker.queue.email.name}")
    private String queue;

    // Este método cria um bean do tipo Queue, que representa uma fila do RabbitMQ
    @Bean // Esta anotação indica que este método é um método fábrica que retorna um objeto que será registrado como um bean no contexto do Spring
    public Queue queue() {
        return new Queue(queue, true); //
        // O construtor da classe Queue recebe dois parâmetros: o nome da fila e um booleano que indica se a fila
        // é durável, ou seja se o broker caí e voltar essa fila vai ser preservada
    }

    // O objetivo principal desse metodo é configurar um conversor de mensagens para JSON.
    @Bean
    public Jackson2JsonMessageConverter messageConverter() {
        // Cria uma nova instância de ObjectMapper para configurar a conversão de JSON
        var objectMapper = new ObjectMapper();
        // Retorna uma nova instância de Jackson2JsonMessageConverter,
        // configurando-o para usar o ObjectMapper definido acima para a conversão de mensagens
        return new Jackson2JsonMessageConverter(objectMapper);
    }
}
