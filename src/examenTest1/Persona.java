package examenTest1;

import herramientas.Aleatorio;
import herramientas.Console;

public  class Persona {
	
	private String nombre;
	private Numero edad;
	private String nss;
	private char sexo;
	private Numero peso;
	private Numero altura;
	final   int SOBREPESO=1;
	final   int PESONORMAL=0;
	final   int BAJOPESO=-1;
	final    char SEXOMUJER='M';
	final    char SEXOHOMBRE='H';
	
	
	public Persona() {
		super();
		generaNSS();
	}

	public Persona(String nombre, Numero edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.altura= new Numero(0);
		this.peso= new Numero(0);
		generaNSS();
	}
	

	public Persona(String nombre, Numero edad,  char sexo, Numero peso, Numero altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		generaNSS();
	}

	public  int calcularIMC() {
		if(sobrepeso())
			return SOBREPESO;
		if(pesoNormal())
			return PESONORMAL;
		
		return BAJOPESO;
	}
	public void estadoPeso() {
		if(calcularIMC()==SOBREPESO);
		   Console.println("Sobrepeso");
		if(calcularIMC()==PESONORMAL);
		   Console.println("Peso normal");
		if(calcularIMC()==BAJOPESO);
			   Console.println("Bajo Peso ");
	}
	public  boolean sobrepeso() {
		if(!isMujer())
		   return calcularDato()>25;
	     return  calcularDato()>24;
	}
	public  boolean pesoNormal() {
		int resultado=calcularDato();
		if(isMujer())
			return  resultado>=19&resultado<=24;
		return resultado>=20&resultado<=25;
	}
	public  boolean faltaPeso() {
		if(isMujer())
			return calcularDato()<20;
		return  calcularDato()<19;
	}
	
	
	public boolean esMayorDeEdad() {
		return (getEdad().getNumero()>=18);

	}
	public Integer calcularDato() {
		return (int) ((getPeso().getNumero()/getAltura().numeroCuadrado()));
		
	}

	private boolean comprobarSexo(char sexo) {
		
		return  sexo==SEXOMUJER|sexo==SEXOHOMBRE;
	}
	public boolean isMujer() {
		//  Console.println("sexo "+sexo);
		  //Console.println("SEXOMUJER "+SEXOMUJER);
		   return Character.toUpperCase(sexo)==SEXOMUJER;
	   }

	private void generaNSS() {
		 this.nss=Aleatorio.ramdom(8);
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Numero getEdad() {
		return edad;
	}
	public void setEdad(Numero edad) {
		this.edad = edad;
	}
	public String getNss() {
		return nss;
	}
	
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		
		this.sexo = Character.toUpperCase(sexo);
	}
	public Numero getPeso() {
		return peso;
	}
	public void setPeso(Numero peso) {
		this.peso = peso;
	}
	public Numero getAltura() {
		return altura;
	}
	public void setAltura(Numero altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad.getNumero() + ", nss=" + nss + ", sexo=" + sexo + ", peso=" + peso.getNumero()
				+ ", altura=" + altura.getNumero() + "]";
	}
	
	
	
	

}
