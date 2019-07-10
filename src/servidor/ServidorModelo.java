package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import servidor.ServidorThread;

public class ServidorModelo {
    private int PortaServidor;

    public int getPortaServidor() {
        return PortaServidor;
    }

    public void setPortaServidor(int PortaServidor) {
        this.PortaServidor = PortaServidor;
    }

    public ServidorModelo(int PortaServidor) {
        this.PortaServidor = PortaServidor;
    }
    
    public void ligar() throws IOException, ClassNotFoundException{
        @SuppressWarnings("resource")
		ServerSocket servidor = new ServerSocket(PortaServidor);
        
        while(true){
            Socket ConexaoCliente = servidor.accept();
          
            
            (new ServidorThread(ConexaoCliente)).start();
            
        }
    }
}
