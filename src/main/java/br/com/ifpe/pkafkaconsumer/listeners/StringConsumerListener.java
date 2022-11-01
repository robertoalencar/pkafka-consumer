package br.com.ifpe.pkafkaconsumer.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class StringConsumerListener {

    public static final String TOPICO_TESTE = "teste-topico";

    @KafkaListener(groupId = "group-1", topics = TOPICO_TESTE, containerFactory = "strContainerFactory")
    public void listener(String message) {
	log.info("Recebendo a mensagem {}", message);
    }

}