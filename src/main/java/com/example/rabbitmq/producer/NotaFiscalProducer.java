package com.example.rabbitmq.producer;

import com.example.rabbitmq.domain.NotaFiscalRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import static com.example.rabbitmq.config.NotaFiscalExchangeConfig.EXCHANGE_NAME;
import static com.example.rabbitmq.config.NotaFiscalRabbitConfig.ROUTING_KEY_NAME;

@Component
@RequiredArgsConstructor
public class NotaFiscalProducer {
  private final RabbitTemplate template;

  public void sendMessage(NotaFiscalRequest request) {
    template.convertAndSend(EXCHANGE_NAME, ROUTING_KEY_NAME, request);
  }
}
