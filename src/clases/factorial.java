package clases;


public class factorial {

	public static void main(String[] args) throws Exception {
		int numero = 5;
		System.out.println(calcularFactorial(numero));
	}
	
	public static int calcularFactorial(int numero) throws Exception{
		int factorial = numero;
		
		if(numero < 0) {
			throw new Exception("El numero tiene que ser 0 o superior");
		}else {
		for (int i = numero-1; 0 < i; i--) {
			factorial *= i;
		}
		}
		return factorial;
	}

}
