package metod;
import java.io.BufferedReader;
import java.io.FileReader;
import interfaces.DiccionarioSimpleTDA;
import dinamicImplementation.DiccionarioSimple;
public class UtilMetod {
	public static void readFile(DiccionarioSimpleTDA dataBase, String file) {
		try {
			FileReader fr=new FileReader(file);
			BufferedReader buffer=new BufferedReader(fr);
			int kg;
			int cost;
			String linea;
			String[]lista;
			linea=buffer.readLine();
			linea=buffer.readLine();
			while(linea!=null) {
				lista=linea.split(";");
				kg=Integer.valueOf(lista[0]);
				cost=Integer.valueOf(lista[1]);
				dataBase.agregar(kg,cost);
				linea=buffer.readLine();
			}
			fr.close();
		}catch(Exception e){
			System.out.println("Excepcion leyendo el archivo");
		}
	}
	/*public static int costFromShipping{
		System.out.println("Ingrese el valor de ");\
		
		
	}*/

}
