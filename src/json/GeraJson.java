package json;

import java.io.FileWriter;

import com.google.gson.Gson;

public class GeraJson {
	public static void main(String[] args) {
		
		Principal skol = new Principal();
		skol.setAno(2019);
		skol.setMalte("Puro Malte");
		skol.setMarca("Skol");
		skol.setNome("Skol Ice Blue Red");
		
		Gson g = new Gson();
		String json = g.toJson(skol);
		
		System.out.println(json);
		
		try {
			FileWriter fw = new FileWriter("/home/neto/Área de trabalho/cerveja1.json");
			fw.write(json);
			fw.close();
		} catch (Exception e) {
			
		}
		
		
	}
}
