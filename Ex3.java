package exceptions;

public class Ex3 {

	public static void main (String [] args) {


		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};
		
		for(int b = 0; b <numeros.length; b ++) {
		try{
		System.out.println (numeros [b] + "/" + demon [b] + "=" + (numeros [b] / demon [b]));
		}
		catch (ArithmeticException e) {
		System.out.println ("Erro ao dividir por zero");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		System.out.println ("Posição do array inválido");
		}
		finally{
		System.out.println ("Essa linha é impressa sempre depois do try or catch");
		}
		}
		}
}
