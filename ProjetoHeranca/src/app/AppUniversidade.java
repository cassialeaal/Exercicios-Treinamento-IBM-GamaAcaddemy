package app;

import core.Estudante;
import core.Pessoa;

public class AppUniversidade {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Cassia");
		p.setEmail("crml@poli.br");
		p.setTelefone("81988104600");
		
		System.out.println(p.exibirInfo());
		
		Estudante e = new Estudante();
		e.setNome("Gustavo");
		e.setEmail("gsb@gmail.com");
		e.setTelefone("81982572554");
		e.setNumeroMatricula(12345678);
		e.setCurso("Engenharia Mecânica");
		
		System.out.println(e.exibirInfo());
	}

}
