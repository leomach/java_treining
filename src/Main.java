import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
			
		sc.close();
	}

}
