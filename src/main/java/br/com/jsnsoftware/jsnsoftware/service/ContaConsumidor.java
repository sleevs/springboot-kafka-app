package br.com.jsnsoftware.jsnsoftware.service;

import java.io.IOException;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import br.com.jsnsoftware.jsnsoftware.modelo.Conta;


@Service
public class ContaConsumidor {

	/*
	 * 
	 * @KafkaListener(topics = "Kafka_Exeamplo", groupId = "group_id") public void
	 * consume(String message) { System.out.println("Consumed message: " + message);
	 * }
	 * 
	 * 
	 * @KafkaListener(topics = "Kafka_Exemplo_json", groupId = "group_json",
	 * containerFactory = "userKafkaListenerFactory") public void consumeJson(String
	 * conta) { System.out.println("Consumido Mensagem JSON : " + conta); }
	 */

   
	
	 @KafkaListener(topics = "JSNSOFTWARE_KAFKA_TOPIC", groupId = "group_id")
	    public void consume(String message) throws IOException {
	        System.out.println("MENSAGEM CONSUMIDA :" + message );
	    }
}
