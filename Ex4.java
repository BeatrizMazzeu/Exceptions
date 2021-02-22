package exceptions;

public class Ex4 {
	public static void main (String [] args) {
		int [] numeros = {4, 8, 16, 32, 64, 128};
		int [] demon = {2, 0, 4, 8, 0};

		for (int b = 0; b <numeros.length; b ++) {
		try{
		System.out.println (numeros [b] + "/" + demon [b] + "=" + (numeros [b] / demon [b]));
		}
		catch (Exception e) {
		System.out.println ("e.getMessage ()");
		e.printStackTrace ();
		}
		}
		}
}
