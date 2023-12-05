package NovasRecursividades;

//Crie uma recursiva que conte de 3 até 0;

public class Exercicio2 {
  public static void main(String[] args) {
	  int n = 0;
	  
	  System.out.println(Conta(n));
  }

private static int Conta(int n) {
	if(n == 3) {
		return n;
	}
	System.out.println(Conta(n + 1));
	return n;
}
}
