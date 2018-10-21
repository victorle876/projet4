package projet4;

import java.util.Scanner;


public class Factorielle {

    private static Scanner scanner = new Scanner(System.in);

	public static int Factorielle (int n)
	{
		if (n > 1)
		{
			return n * Factorielle(n-1);
		
		}	
		else 
		{
			 return 1;
		}
		
	}
	
	 public static void main(String[] args) {
		 int n =0;
		 System.out.println("Voulez-vous saisir la valeur n ?");
		 n = scanner.nextInt();
		 System.out.println("Le resultat final 2 est " + Factorielle(n));
	         
	 }     
	

}
