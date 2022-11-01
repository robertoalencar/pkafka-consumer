package br.com.ifpe.pkafkaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class PkafkaConsumerApplication {

    public static void main(String[] args) {
	SpringApplication.run(PkafkaConsumerApplication.class, args);
    }

}