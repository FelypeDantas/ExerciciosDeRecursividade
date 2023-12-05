package NovasRecursividades;

// uma recursividade que conte de um até 3;

public class Exercicio1 {
	public static void main(String[] args) {
		int n = 3;
		
		System.out.println(Conta(n));
	}

	private static int Conta(int n) {
		if(n > 1) {
			System.out.println(Conta(n -1));
		}
		return n;
	}
   
}
