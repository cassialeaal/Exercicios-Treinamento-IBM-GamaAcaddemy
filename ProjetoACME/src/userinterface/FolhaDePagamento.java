package userinterface;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FolhaDePagamento {

	public static void main(String[] args) {
		Funcionario f1,f2,f3,f4;
		
		f1 = new Chefe(1234, "Gustavo Chefe",5000.0,15.0,500.0);
		f2 = new Comissionado(1235, "Cassia Comissionada",4000.0,35.0);
		f3 = new Horista(1236, "Ana Designer",80,150.0);
		f4 = new Empreiteiro(1237, "Joao Construtor",5832.65);
		
		System.out.println(f1.getNumRegistro() +" - "+f1.getNome()+" R$"+f1.calcularSalario());
		System.out.println(f2.getNumRegistro() +" - "+f2.getNome()+" R$"+f2.calcularSalario());
		System.out.println(f3.getNumRegistro() +" - "+f3.getNome()+" R$"+f3.calcularSalario());
		System.out.println(f4.getNumRegistro() +" - "+f4.getNome()+" R$"+f4.calcularSalario());

	}

}
