/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebathreads;

/**
 *
 * @author loderain
 */
public class PruebaThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bolsa bolsa = new Bolsa();
        HiloCliente hc=new HiloCliente(bolsa);
        HiloEnvio he=new HiloEnvio(bolsa);
        hc.start();
        he.start();
        

    }

}
