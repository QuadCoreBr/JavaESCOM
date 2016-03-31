/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;
import java.util.*;
/**
 *
 * @author alumno
 */
public class Banco {
    
    private ArrayList<Cliente> clientes;
    private int numClientes;
   
    public Banco(){
        clientes= new ArrayList<>();
    }
    public Banco (int numClientes){
        this.numClientes=numClientes;
        clientes = new ArrayList<>(numClientes);
        for(int i=0;i<clientes.size();i++){
            clientes.add(new Cliente("",""));
        }
    }
    public void agregarCliente(Cliente nuevo){
        clientes.add(nuevo);
    }
    public void agregarClienteCuenta(Cliente existente, Cuenta asignada){
        existente.setCuenta(asignada);
    }
    public Cliente getCliente(int indice){
        return clientes.get(indice);
    }
    
    //@Override
   // public String toString(){
        
        
    //}
    
}
