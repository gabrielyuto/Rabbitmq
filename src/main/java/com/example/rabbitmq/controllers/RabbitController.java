package com.example.rabbitmq.controllers;

import com.example.rabbitmq.domain.NotaFiscalRequest;
import com.example.rabbitmq.service.NotaFiscalService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/rabbit")
public class RabbitController {
  private final NotaFiscalService service;

  @PostMapping
  public void sendMessage(@RequestBody NotaFiscalRequest request){
    log.info("Nota fiscal: {}", request);
    service.sendMessage(request);
  }
}
