package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArquivosController implements IArquivosController{

	public ArquivosController() {
		super();
	}

	@Override
	public void readFile(String path, String name) throws IOException {
		File arq = new File(path, name);
		if(arq.exists() && arq.isFile()) {
			FileInputStream flow = new FileInputStream(arq);
			InputStreamReader read = new InputStreamReader(flow);
			BufferedReader buffer = new BufferedReader(read);
			String linha;
			while((linha = buffer.readLine()) != null) {
				if(linha.contains("Fruits")) {
					String[] v = linha.split(";");
					System.out.println(v[0] + "\t" + v[1] + "\t" + v[2]);
				}
			}
			buffer.close();
			read.close();
			flow.close();
		} else {
			throw new IOException("Arquivo Inválido");
		}
		
	}
}
