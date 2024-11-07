package controller;

import java.io.*;
import java.util.*;

public class ArquivosController {
	
	public void listar(String path) throws IOException {
		File dir = new File(path);
		
		if(dir.exists() && dir.isDirectory()) {
			ArrayList<File> listaArquivos = new ArrayList<File>();  
			File[] vet = dir.listFiles(); //Vetor com os arquivos existentes no diretório
			
			for(File file : vet) {
				if(file.isFile())
					listaArquivos.add(file);
			}
			
			listaArquivos.sort((f1,f2) -> Double.compare(f1.length(), f2.length()));
			
			for(File file : listaArquivos) {
				double tamanho = file.length() / Math.pow(2, 20);
				System.out.println("Arquivo: " + file.getName() + " | Tamanho: " + tamanho + " MB");
			}
		} else {
			throw new IOException("Diretório inválido");
		}
	}
}