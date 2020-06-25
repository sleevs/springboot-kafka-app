package br.com.jsnsoftware.jsnsoftware.modelo;

public class KafkaMensagem {
	
	
	private String topico ;
	private String mensagem ;
	
	
		

	public KafkaMensagem(String topico, String mensagem) {
		super();
		this.topico = topico;
		this.mensagem = mensagem;
	}



	public String getTopico() {
		return topico;
	}


	public void setTopico(String topico) {
		this.topico = topico;
	}


	public String getMensagem() {
		return mensagem;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	
	

}
