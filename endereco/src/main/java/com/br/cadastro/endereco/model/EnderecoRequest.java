package com.br.cadastro.endereco.model;

import lombok.Getter;

@Getter
public class EnderecoRequest {

	private String cep;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}
