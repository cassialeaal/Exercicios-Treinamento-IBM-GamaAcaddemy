package app;

import model.Conta;
import model.ContaEspecial;

public class PIBank {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Cassia","11602932441", 1235, 100);
		Conta c2 = new ContaEspecial ("Gustavo","10556534492", 1234, 100, 500);
		
		System.out.println(c1);
		System.out.println(c2);

		c1.debitar(80);
		c2.debitar(500);
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
