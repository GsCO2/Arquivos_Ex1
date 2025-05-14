package view;

import java.io.IOException;

import controller.*;

public class Main {

	public static void main(String[] args) {
		String path = "C:\\TEMP";
		String nome = "generic_food.csv";
		IArquivosController ic = new ArquivosController();
		try {
			ic.readFile(path,nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
