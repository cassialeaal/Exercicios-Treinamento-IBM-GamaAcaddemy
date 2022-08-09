import java.util.HashMap;

public class CamposRegistros {

	public static void main(String[] args) {
		HashMap<String,String> nomeEmail = new HashMap<String,String>();
		nomeEmail.put("Cassia","cassialeaal@gmail.com");
		nomeEmail.put("Gustavo","gustavo.soares.gsb@gmail.com");

		System.out.println(nomeEmail);
		
		System.out.println(nomeEmail.get("Gustavo"));
	}

}
