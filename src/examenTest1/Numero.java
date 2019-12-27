package examenTest1;

public class Numero {
	private double numero;
	
	public Numero(Object d){
		try {
		  this.numero=Integer.parseInt((String) d);
		}
		catch(ClassCastException e) {
			this.numero=Double.parseDouble((String)d) ;
		}
		catch(NumberFormatException e) {
			this.numero=Double.parseDouble((String)d) ;
		}
	}
	public Numero(Integer d){
		  this.numero= d;
		
	}
	public Numero(Double d){
		  this.numero= d;
		
	}	
	public double getNumero() {
		return numero;
	}
	public double numeroCuadrado( ) {
		return getNumero()*getNumero();
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public void setNumero(Object numero) {
		try {
			this.numero=Double.parseDouble(numero.toString());
			
		}
		catch(NumberFormatException exception) {
			this.numero=0;
		}
		
	}

	public boolean isValido() {
		return true;
	}
	public boolean esMayorA(Numero numero) {
		return true;
	}
	
	

}
