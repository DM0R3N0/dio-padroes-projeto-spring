package br.com.dannes.cursoSB.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.dannes.cursoSB.model.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {	
	
	@RequestMapping("/cadastro")
	public Cliente obterCliente() {
		return new Cliente(37, "Simone", "220.567.982-45");
		
	}

}
