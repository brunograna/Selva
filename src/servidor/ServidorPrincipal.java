package servidor;

import java.io.IOException;

public class ServidorPrincipal {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Servidor Ligado...");
        (new ServidorModelo(5500)).ligar();
    }
    
}
