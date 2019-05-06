package json;

import java.io.BufferedReader;
import java.io.FileReader;

import com.google.gson.Gson;

public class LerJson {
	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("/home/neto/Área de trabalho/cerveja.json");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			Gson gson = new Gson();
			Object json = gson.fromJson(bufferedReader, Object.class);
			
			System.out.println(json.getClass());
			System.out.println(json.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}

		
	}

}
