package br.com.selva.rede;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import br.com.selva.model.usuario;


public class EnvioDeDados {
	
	public EnvioDeDados(usuario json) {
			
			
	        try {
	        	String EnderecoServidor="localhost";
	            int PortaServidor=5500;
				@SuppressWarnings("resource")
				Socket s = new Socket(EnderecoServidor, PortaServidor);
				ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
				out.writeObject(json);
				out.flush();
				out.close();
				
			} catch (UnknownHostException e) {
				System.out.println(e);
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			
		}

}
