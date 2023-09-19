package com.br.cadastro.endereco.service;

import org.springframework.stereotype.Service;

import com.br.cadastro.endereco.feign.EnderecoFeign;
import com.br.cadastro.endereco.model.EnderecoRequest;
import com.br.cadastro.endereco.model.EnderecoResponse;

@Service
public class EnderecoService {

	
	private final EnderecoFeign enderecoFeign;
	
	
	public EnderecoService(EnderecoFeign enderecoFeign) {
		super();
		this.enderecoFeign = enderecoFeign;
	}


	public EnderecoResponse executa(EnderecoRequest request) {
		
		return enderecoFeign.buscaEnderecoCep(request.getCep());
	};
}
