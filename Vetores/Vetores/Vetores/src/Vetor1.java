import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int a[] = new int [20];
		int b[] = new int [20];
		
		System.out.println("Insira os valores");
		for(int i=0; i<20; i++) {
			a[i] = in.nextInt();
		}
		for(int j=0; j<20; j++) {
			if(a[j] % 2 == 0); {
			b[j] = a[j];
			}
		}
		System.out.println("Os números ímpares são ");
		for(int k=0; k<20; k++) {
			if(a[k] % 2 != 0) {
				System.out.println(a[k]);
			}
		}
		System.out.println("Os números pares são ");
		for(int l=0; l<20; l++) {
			if(a[l] % 2 == 0) {
				System.out.println(a[l]);
			}
		}

	} 

}
