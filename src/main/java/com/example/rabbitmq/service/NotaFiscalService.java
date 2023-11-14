package com.example.rabbitmq.service;

import com.example.rabbitmq.domain.NotaFiscalRequest;
import com.example.rabbitmq.producer.NotaFiscalProducer;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotaFiscalService {
  private final NotaFiscalProducer producer;

  public void sendMessage(NotaFiscalRequest request){
    producer.sendMessage(request);
  }
}
