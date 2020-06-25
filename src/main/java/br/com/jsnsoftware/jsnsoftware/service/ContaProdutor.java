package br.com.jsnsoftware.jsnsoftware.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import br.com.jsnsoftware.jsnsoftware.modelo.Conta;

@Service
public class ContaProdutor {

	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	String TOPIC = "JSNSOFTWARE_KAFKA_TOPIC";
	
	public void send(String message) {
	    
		
		//Conta c = new Conta();
	//	c.setContaTipo(message);
	    kafkaTemplate.send(TOPIC, message );
	}
	
}
