
package servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.selva.model.Questoes;


public class ServidorThread extends Thread{
    private Socket ConexaoCliente;
    
    public ServidorThread(Socket ConexaoCliente){
        this.ConexaoCliente = ConexaoCliente;
    }
    
    public void run(){
        ObjectInputStream in = null;
        //Questoes json = null;
        
        try {
            in = new ObjectInputStream(ConexaoCliente.getInputStream());
        } catch (IOException ex) {
            System.out.println("IOException");
        }        
        
        try {
           // json = (Questoes)in.readObject();
        	  System.out.print("[" + ConexaoCliente.getInetAddress().getCanonicalHostName() + "] ");
        	  java.util.Date dataUtil = new java.util.Date();
        	  java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
        	  /*dataHora*/ System.out.println(dataSql);
        	  /*insert do banco parte do Caio*/ 
        	 
        	  
        	  
        	  
        } catch (IOException ex) {
            System.out.println("IOException");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException");
        }       
      // System.out.println(json);
        
        try {
            ConexaoCliente.close();
        } catch (IOException ex) {
            Logger.getLogger(ServidorThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
