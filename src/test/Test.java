package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import examenTest1.Hombre;
import examenTest1.Mujer;
import examenTest1.Numero;
import examenTest1.Persona;
import herramientas.Console;

public class Test {

	
	public static void  main(String args[]) {
//		public Persona(String nombre, Numero edad, String nss, char sexo, Numero peso, Numero altura) {
//			super();
//			this.nombre = nombre;
//			this.edad = edad;
//			this.nss = nss;
//			this.sexo = sexo;
//			this.peso = peso;
//			this.altura = altura;
//			generaNSS();
//		}
		Console.println("Lectura de datos.....");
		String nombre  =    leerTeclado();
		Numero edad    =    new Numero(leerTeclado());
		char sexo	   =    leerTeclado().charAt(0);
		Numero peso	   =    new Numero(leerTeclado());
		Numero altura  =    new Numero(leerTeclado());
		
		Persona persona1=new Persona(nombre, edad,sexo,
									peso,altura);
		
		
		Persona persona2=new Persona(nombre, edad,sexo);
		
		Persona persona3=new Persona();
		persona3.setAltura(new Numero(1.6));
		persona3.setEdad(new Numero(23));
		persona3.setNombre("ricardo");
		persona3.setPeso(new Numero(23));
		persona3.setSexo('h');
		
		
//		Persona persona1=new Persona(leerTeclado(), new Numero(leerTeclado()),"",leerTeclado().charAt(0),
//									new Numero(leerTeclado()),new Numero(leerTeclado()));
//		
		//Persona persona2=new Persona("juan", new Numero(23),"",'h',new Numero("12"),new Numero("1.3"));
		//Persona persona3=new Persona("maria", new Numero(23),"",'m',new Numero(12),new Numero(1.3));
		
		System.out.println("persona1 " + persona1.isMujer());
		persona1.estadoPeso();
		Console.println("persona1 mayor de edad? "+persona1.esMayorDeEdad());
		Console.println(persona1);
		Console.println("//////////////////////");
		
		System.out.println("persona2 "+persona2.isMujer());
		persona2.estadoPeso();
		Console.println("persona2 mayor de edad? "+persona1.esMayorDeEdad());
		Console.println(persona2);
		
		Console.println("//////////////////////");
		System.out.println("persona3 "+persona3.isMujer());
		persona3.estadoPeso();
		Console.println("persona3 mayor de edad? "+persona1.esMayorDeEdad());
		Console.println(persona3);
		
	}
	public static String leerTeclado() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		String entrada="";
		try {
			entrada= br.readLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entrada;
	}
	public static Persona gestionPersona(Persona persona) {
		//Console.println("es mujer??/ "+persona.isMujer());
		if(persona.isMujer())
			return (Mujer)persona;
		return (Hombre)persona;
	}
	
}
