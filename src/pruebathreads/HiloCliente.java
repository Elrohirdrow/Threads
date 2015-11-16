/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebathreads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author loderain
 */
public class HiloCliente extends Thread {

    Bolsa bolsa;

    public HiloCliente(Bolsa b) {
        bolsa = b;
    }

    /*public void run() {
        while (true) {
            synchronized (bolsa) {
                bolsa.addElemento();
                 try {
                Thread.sleep(1000);
                if (bolsa.estaLLena()) {
                   
                        bolsa.wait();
                   
                }
                 } catch (InterruptedException ex) {
                        Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        }
    }*/
    
    public void run()
    {
    	while(true)
    	{
    		bolsa.addElemento();
    		try 
    		{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
    		{
				//e.printStackTrace();
			}
    	}
    }

}
