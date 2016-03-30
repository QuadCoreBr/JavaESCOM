package proyectobanco;

public class Cuenta{
	private double saldo;
        
	public Cuenta(double saldo){
		this.saldo=saldo;
	}
	
	public double consultar(){
		return saldo;
	}
	public void depositar(double cantidad){
		saldo += cantidad;
	}
	public void retirar(double cantidad){
		if(cantidad <=0)
			System.out.println("Ingrese una cantidad mayor a cero");
		if(saldo >= cantidad)
			saldo-=cantidad;
		else{
			System.out.println("No tiene fondos suficientes para retirar \n" +
								"Su saldo es:" + consultar());
		}								
	}
        @Override
        public String toString(){
            return Double.toString(saldo);
        }
}