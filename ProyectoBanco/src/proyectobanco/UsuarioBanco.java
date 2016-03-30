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
public class UsuarioBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] nombres={"Sherlock H","Basil","Dorian","Wattson","Tadeo S"};
        String [] noCuentas={"SH","BS","DG","WS","TS"};
        ArrayList<Cliente> clientes = new ArrayList<>(20);
        ArrayList<Cuenta> cuentas = new ArrayList<>(20);
        Banco miBanco = new Banco();
        Banco tuBanco = new Banco(10);
        for (int i=0;i<20;i++) {
            clientes.add(new Cliente(nombres[i%5],noCuentas[i%5]+(i+1)));
            cuentas.add(new Cuenta(10*i+100));
            miBanco.agregarCliente(clientes.get(i));
            miBanco.agregarClienteCuenta(clientes.get(i), cuentas.get(i));
        }
        for(Cliente cliente : clientes)
            System.out.println(cliente);
        
        System.out.println("El cliente: "+clientes.get(0).getNombre()+" tiene un saldo: "+clientes.get(0).getCuenta().consultar());
      
    }
    
}
