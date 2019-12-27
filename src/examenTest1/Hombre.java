package examenTest1;

public class Hombre extends Persona {

    
	
	public Hombre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hombre(String nombre, Numero edad, char sexo) {
		super(nombre, edad, sexo);
		// TODO Auto-generated constructor stub
	}

	public Hombre(String nombre, Numero edad, char sexo, Numero peso, Numero altura) {
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
		//(peso en kg/(Estatura^2 en m))
		// TODO Auto-generated method stub
	    return calcularDato()>25;
	}

	@Override
	public boolean pesoNormal() {
		// TODO Auto-generated method stub
		int resultado=calcularDato();
		return resultado>=20&resultado<=25;
		
	}

	@Override
	public boolean faltaPeso() {
		// TODO Auto-generated method stub
		return calcularDato()<20;
	}
	

}
