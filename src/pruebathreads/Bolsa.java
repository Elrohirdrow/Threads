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
public class Bolsa {
    int elementos;
    public Bolsa(){
        elementos=0;
    }
    public synchronized void addElemento()
    {
        elementos=elementos+1;
        System.out.println("Elemento añadido "+elementos);
        
        //Si la bolsa esta llena, llama a notify
        if (estaLLena()==true) 
        {
			notify();
		}
    }
    public boolean estaLLena(){
        boolean estaLlena;
        if(elementos==5){
            estaLlena=true;
        }
        else{
            estaLlena=false;
        }
        return estaLlena;
    }
    
    public synchronized void enviar()
    {
    	System.out.println("Lo que sea");
    	
    	if (estaLLena()==true) 
    	{
    		System.out.println("Bolsa enviada");
            System.out.println("Se ha vaciado la bolsa");
            elementos=0;
		}
    	else
    	{
    		try 
			{
				wait();
			} catch (InterruptedException e) 
			{
				//e.printStackTrace();
			}
    	}
        
    }
    /*public void vaciar(){
        elementos=0;
        System.out.println("Se ha vaciado la bolsa");
    }*/
}
