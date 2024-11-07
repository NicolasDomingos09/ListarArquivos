package view;
import controller.ArquivosController;

public class Main {
	public static void main(String[] args) {
		try {
			ArquivosController cont = new ArquivosController();
			cont.listar("C:\\temp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}