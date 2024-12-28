import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// estrutura while
		int x = sc.nextInt();
		
		while (x != 0) {
			System.out.println("Você digitou: "+x);
			x = sc.nextInt();
		}
		
		// estrutura for
		int soma = 0;
		int n = sc.nextInt();
		
		for (int i=0; i < n; i++) {
			int p = sc.nextInt();
			soma = soma + p;
		}
		System.out.println("Você somou: "+soma);
		
		// estrutura do-while
		int inc = 0;
		
		do {
			inc = inc + 1;
			System.out.println("Incremento: "+inc);
		} while (inc < 3);
			
		sc.close();
	}

}
