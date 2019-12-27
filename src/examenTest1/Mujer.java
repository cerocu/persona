package examenTest1;

public class Mujer extends Persona {

	
	
	public Mujer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mujer(String nombre, Numero edad, char sexo) {
		super(nombre, edad, sexo);
		// TODO Auto-generated constructor stub
	}

	public Mujer(String nombre, Numero edad, char sexo, Numero peso, Numero altura) {
		super(nombre, edad, sexo, peso, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcularIMC() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean sobrepeso() {
		// TODO Auto-generated method stub
		return calcularDato()>24;
	}

	@Override
	public boolean pesoNormal() {
		// TODO Auto-generated method stub
		int resultado=calcularDato();
		
		return  resultado>=19&resultado<=24;
	}

	@Override
	public boolean faltaPeso() {
		// TODO Auto-generated method stub
		return  calcularDato()<19;
	}

	
	
}
