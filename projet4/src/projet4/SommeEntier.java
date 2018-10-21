package projet4;

import java.util.Scanner;

public class SommeEntier {
	 private static Scanner scanner = new Scanner(System.in);

		public static int SommeEntier (int n)
		{
			if (n > 1)
			{
				return n + SommeEntier(n-1);
			
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
			 System.out.println("Le resultat final 2 est " + SommeEntier(n));
		        // 
		 }     

}
