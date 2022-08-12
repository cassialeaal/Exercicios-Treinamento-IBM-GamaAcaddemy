import java.util.ArrayList;

public class Loja {

	public static void main(String[] args) {
		/*Produto lista[];
		lista = new Produto[5];
		
		lista[0] = new Produto(1, "Computador", 1500.00);
		lista[1] = new Produto(2, "Mouse", 30.00);
		lista[2] = new Produto(3, "Teclado", 80.00);
		lista[3] = new Produto(4, "Monitor", 400.00);
		lista[4] = new Produto(5, "Impressora", 650.00);
		
		for(int i=0;i < lista.length;i++) {
			System.out.println(lista[i]);
		}*/
		
		ArrayList<Produto> lista;
		lista = new ArrayList<Produto>();
		
		lista.add(new Produto(1, "Computador", 1500.00));
		lista.add(new Produto(2, "Mouse", 30.00));
		lista.add(new Produto(3, "Teclado", 80.00));
		
		lista.remove(2); 
		/*for(Produto p : lista) {
			System.out.println(p);
		}*/
		
		// Ou
		
		for(int i=0; i < lista.size();i++) {
			System.out.println(lista.get(i));
		}
	}

}
