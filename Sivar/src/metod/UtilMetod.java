package metod;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import interfaces.ConjuntoTDA;
import interfaces.DiccionarioSimpleTDA;
import dinamicImplementation.Conjunto;
import dinamicImplementation.DiccionarioSimple;
public class UtilMetod {
	public void readFile(DiccionarioSimpleTDA dataBase, String file) {
		try {
			FileReader fr=new FileReader(file);
			BufferedReader buffer=new BufferedReader(fr);
			int kg;
			double cost;
			String linea;
			String[]lista;
			linea=buffer.readLine();
			linea=buffer.readLine();
			while(linea!=null) {
				lista=linea.split(";");
				kg=Integer.valueOf(lista[0]);
				System.out.println(lista[1]);
				cost=Double.valueOf(lista[1]);
				dataBase.agregar(kg, cost);
				linea=buffer.readLine();
			}
			fr.close();
		}catch(Exception e){
			System.out.println("Excepcion leyendo el archivo");
		}
	}
	public int costFromShipping(DiccionarioSimpleTDA dataBase){
		ConjuntoTDA kilajes=new Conjunto();
		kilajes.inicializarConjunto();
		kilajes=dataBase.claves();
		int kilaje=0;
		float m3=0;
		System.out.println("Ingrese el Kilaje del envio ");
		String inputKilaje = "";
		String inputM3="";
        Scanner scanner = new Scanner (System.in); 
        inputKilaje = scanner.nextLine ();
        System.out.println("Ingrese el m3 del envio ");
        inputM3=scanner.nextLine ();
        kilaje=Integer.valueOf(inputKilaje);
        m3=Integer.valueOf(inputM3);
		
		return 0;
		
	}

}
