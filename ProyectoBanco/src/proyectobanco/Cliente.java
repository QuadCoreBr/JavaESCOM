package proyectobanco;


import proyectobanco.Cuenta;

public class Cliente{
	private String nombre;
	private Cuenta cuenta;
	private String numCuenta;
	
	public Cliente (String nombre, String numCuenta){
		this.nombre = nombre;
		this.numCuenta = numCuenta;
	}
	public void setCuenta(Cuenta cta){ //cta apunta al objeto anonimo y después desaparece
		cuenta = cta;
	}
        public void setNombre(String nombre){
            this.nombre=nombre;
        }
	public String getNombre(){
		return nombre;
	}
	public Cuenta getCuenta(){ //devuelve un dato tipo Cuenta 
		return cuenta;
	}

	public String getNumCuenta(){
		return numCuenta;
	}
        @Override
        public String toString(){
            return "|Nombre: "+nombre + "|Cuenta: "+cuenta+"|No.Cuenta: "+numCuenta;
        }
}