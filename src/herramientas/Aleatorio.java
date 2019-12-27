package herramientas;

import java.util.Random;

public class Aleatorio {
	
	public static char caracter() {
		return (char)((int) (Math.random() * 26 + 65));
	}
	public static int numeros() {
		return ((int) (Math.random() * 9));
	}
	public static String ramdom(int tamanoRamdom) {
		String characters="abcdefghijklmnñopqrstuvwxyz0123456789";
		
		Random rng=new Random();
		 
		 char[] text = new char[tamanoRamdom];
		    for (int i = 0; i < tamanoRamdom; i++)
		    {
		        text[i] = characters.charAt(rng.nextInt(characters.length()));
		    }
		    System.out.println("aleatorio "+String.valueOf(text));
		
	return String.valueOf(text);
	}
	public static void main(String args[]) {
		String characters="abcdefghijklmnñopqrstuvwxyz0123456789";
		 Random rng=new Random();
		 
		 char[] text = new char[8];
		    for (int i = 0; i < 8; i++)
		    {
		        text[i] = characters.charAt(rng.nextInt(characters.length()));
		    }
		    System.out.println("aleatorio "+String.valueOf(text));
		}
	

}
