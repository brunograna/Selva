package br.com.controller;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import br.com.selva.model.usuario;
import br.com.selva.rede.EnvioDeDados;
import br.com.selva.view.app;

public class Mapeamento {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		/*
		String Json = "{'nome'='Anderson','resposta'='1'}";
		
		ObjectMapper objectMapper = new ObjectMapper();
        usuario usuarioresposta = objectMapper.readValue(Json,usuario.class);
        
        System.out.println(usuarioresposta);
        
        new EnvioDeDados(usuarioresposta);*/
		//app a = new app();
		
		new app().main(args);
		
	}

}
