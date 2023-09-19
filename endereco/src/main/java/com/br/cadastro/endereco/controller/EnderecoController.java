package com.br.cadastro.endereco.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.cadastro.endereco.model.EnderecoRequest;
import com.br.cadastro.endereco.service.EnderecoService;

import lombok.RequiredArgsConstructor;


@RequestMapping("/endereco")
@RestController
public class EnderecoController {


	private final EnderecoService enderecoService;
	
	
	
	public EnderecoController(EnderecoService enderecoService) {
		super();
		this.enderecoService = enderecoService;
	}



	@GetMapping("/consulta")
	public ResponseEntity consultaCep(@RequestBody EnderecoRequest enderecoRequest) {
		
	return ResponseEntity.ok(enderecoService.executa(enderecoRequest));
	}
}
