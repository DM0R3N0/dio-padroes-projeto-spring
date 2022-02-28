package br.com.dannes.cursoSB.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	@RequestMapping(path = "/home")
	public String ola() {
		return "Home page";
	}
	
}
