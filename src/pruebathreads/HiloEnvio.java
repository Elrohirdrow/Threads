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
public class HiloEnvio extends Thread{
    Bolsa bolsa;
    public HiloEnvio(Bolsa b){
        bolsa=b;
    }
    /*public void run() {
        while(true){
            synchronized(bolsa){
                if(bolsa.estaLLena()){
                    bolsa.enviar();
                    bolsa.vaciar();
                }
                else{
                    
                        bolsa.notify();
                    
                }
            }
        }
    }*/
    
    public void run()
    {
    	while(true)
    	{
    		bolsa.enviar();
    	}
    }
}
