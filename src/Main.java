/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/RNO_DOD/
 */

import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		Scanner liczba = new Scanner(System.in);
		int t = liczba.nextInt();
		for(int i=0;i<t;i++)
		{
			int n = liczba.nextInt();
			int suma=0;
			for(int j=0;j<n;j++)
			{
				int LiczbyDoZsumowania = liczba.nextInt();
				suma = LiczbyDoZsumowania + suma;
			}
			System.out.println(suma);
		}
	}

}
