package br.com.jsnsoftware.jsnsoftware.controle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.jsnsoftware.jsnsoftware.service.ContaProdutor;



@RestController
@RequestMapping(value = "/service_kafka/")
public class KafkaControle {
	
	@Autowired
	ContaProdutor kafkaSender;
	
	
	@GetMapping(value = "/produtos")
	public String producer(@RequestParam("message") String message) {
		kafkaSender.send(message);

		return "Mensagem enviada para o Kfka topics com sucesso";
	}

}
