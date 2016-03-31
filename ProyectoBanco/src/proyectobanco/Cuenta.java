package proyectobanco;
import java.util.*;

public class Cuenta{
	private double saldo;
        private ArrayList<String> details = new ArrayList<>(30); //alamacena los datos de fecha de las ultimas 30 transacciones
        Calendar calendar;
        Date actualTime;
	public Cuenta(double saldo){
		this.saldo=saldo;
                details.add("La cuenta fue creada en: "+transactionDetails() + " Con un saldo de: "+ saldo);
	}
	
	public double consultar(){
                details.add("Consulta en: " + transactionDetails());
                return saldo;
                
	}
	public void depositar(double cantidad){
                details.add("Deposito de: "+ cantidad + " en: "+ transactionDetails());
		saldo += cantidad;
	}
	public void retirar(double cantidad){
		if(cantidad <=0)
			System.out.println("Ingrese una cantidad mayor a cero");
		if(saldo >= cantidad){
			saldo-=cantidad;
                        details.add("Retiro de: "+ cantidad +"en: "+ transactionDetails());
                }else{
			System.out.println("No tiene fondos suficientes para retirar \n" +
								"Su saldo es:" + consultar());
		}								
	}
        private String transactionDetails(){
            calendar = new GregorianCalendar();
            actualTime = new Date();
            calendar.setTime(actualTime);
            
            return "Dia: "+Integer.toString(calendar.get(Calendar.DAY_OF_MONTH)) + " " +
                    "Month: "+ calendar.get(Calendar.MONTH) + " " +
                    "Year: " + calendar.get(Calendar.YEAR)+ " " +
                    "Hour: " + calendar.get(Calendar.HOUR_OF_DAY)+ " " +
                    "Minute: " + calendar.get(Calendar.MINUTE)+ " " +
                    "Second: "+ calendar.get(Calendar.SECOND)+ " " +
                    "MiliSecond " + calendar.get(Calendar.MILLISECOND);

        }
        public void showTransactionDetails(){
            for(String details1 : details ){
                System.out.println(details1);
            }
        }   
        @Override
        public String toString(){
            return Double.toString(saldo);
        }
}