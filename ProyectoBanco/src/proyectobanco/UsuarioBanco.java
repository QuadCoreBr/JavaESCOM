/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author alumno
 */
public class UsuarioBanco extends JFrame implements ActionListener{
    //GUI CODE
    private static final int WIDTH =800;
    private static final int HEIGHT = 600;
    private String nameSelection;
    
    private JComboBox selectClient;
    private JLabel selection,bankUser, userBalance, userAccount;
    private JTextField JTextbankUser, JTextuserBalance, JTextuserAccount;
    private JButton detailsB, exitB;
    private JFrame details;
    private ComboBoxHandler selectClicClient;
    private DetailsButtonHandler detailsButton;
    private ExitButtonHandler exitButton;
    
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Cuenta> cuentas;
    Banco miBanco;
   /* private DetailsButtonHandler detailsButton;
    private ExitButtonHandler exitButton; */
    
    public UsuarioBanco(){
        super("Bank of JCourse");
        //Código del programa
        String [] nombres={"Seleccionar","Sherlock H","Basil","Dorian","Wattson","Tadeo S","Merrypit H","Galileo G","Platon","Socrates","Asus"};
        String [] noCuentas={" ","SH","BS","DG","WS","TS","MH","GG","PL","SC","AS"};
        clientes = new ArrayList<>(10);
        cuentas = new ArrayList<>(10);
        miBanco = new Banco();
        for (int i=1;i<11;i++) {
            clientes.add(new Cliente(nombres[i],noCuentas[i]+(i+1)));
            cuentas.add(new Cuenta(10*i+100));
            miBanco.agregarCliente(clientes.get(i-1));
            miBanco.agregarClienteCuenta(clientes.get(i-1), cuentas.get(i-1));
        }

        //Código de la GUI
        selectClient = new JComboBox(nombres);
        selectClicClient = new ComboBoxHandler();
        selectClient.addActionListener(selectClicClient);
        
        selection = new JLabel("Selecciona un cliente",SwingConstants.LEFT);
        bankUser= new JLabel("Usuario",SwingConstants.LEFT);
        userBalance= new JLabel("Saldo",SwingConstants.LEFT);
        userAccount= new JLabel("Cuenta",SwingConstants.LEFT);
        
        JTextbankUser = new JTextField(10);     JTextbankUser.setEditable(false);
        JTextuserBalance = new JTextField(10);  JTextuserBalance.setEditable(false);
        JTextuserAccount = new JTextField(10);  JTextuserAccount.setEditable(false);
        //Boton para mostrar el panel de detalles
        detailsB = new JButton("Detalles de operaciones");
        detailsButton = new DetailsButtonHandler();
        detailsB.addActionListener(detailsButton);
        //Boton para la salida
        exitB = new JButton("Salir");
        exitButton = new ExitButtonHandler();
        exitB.addActionListener(exitButton);
        //Llenar los campos de texto del cliente
 
        //JTextuserBalance.setText(Double.toString(getBalanceSelection(clientes)));
        //Boton para conocer mas detalles
        

        Container pane = getContentPane();
        pane.setLayout(new GridLayout(5,2));
        pane.add(selection); pane.add(selectClient);
        pane.add(bankUser); pane.add(JTextbankUser);
        pane.add(userBalance); pane.add(JTextuserBalance);
        pane.add(userAccount); pane.add(JTextuserAccount);
        
        pane.add(detailsB); pane.add(exitB);
        
        
        setSize(WIDTH,HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
    }
    public double getBalanceSelection(String searchClient){
            int i =0;
            while(!(searchClient.equals((clientes.get(i).getNombre())))){
            i++;
            }
        System.out.println("Seleccionaste a " + clientes.get(i).getNombre() + " con un saldo de " + clientes.get(i).getCuenta().consultar());
        return clientes.get(i).getCuenta().consultar();
    }
    public String getAccountSelection(String searchClient){
            int i =0;
            while(!(searchClient.equals((clientes.get(i).getNombre())))){
            i++;
            }
        return clientes.get(i).getNumCuenta();
    }
    
    
    private class DetailsButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
          details = new JFrame();
            details.setSize(800,400);
            
            

        }
    }
    private class ExitButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    private class ComboBoxHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JComboBox combo = (JComboBox)e.getSource();
            nameSelection = (String)combo.getSelectedItem();
            if(nameSelection.equals("Seleccionar")){
                JOptionPane.showMessageDialog(null,"Selecciona un cliente");
            }else{
            JTextbankUser.setText(nameSelection);
            JTextuserBalance.setText(Double.toString(getBalanceSelection(nameSelection)));
            JTextuserAccount.setText(getAccountSelection(nameSelection));
            }
        }
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        UsuarioBanco us = new UsuarioBanco();

    }


    
}
