package dad.maven.prueba;
import org.apache.commons.lang.StringUtils;
public class Combinar {
	public static String combinar(Object[] array) {
	
		//return StringUtils.join(array, " "); //con libreria
		
		
		String str = "";
	    
	    for (int i = 0; i < array.length; i++)
	      str += array[i] + " ";
	    
	    return str.substring(0, str.length() - 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object [] array = {"hola", 3.1416, "adios", 4, true};
		String resultado = combinar (array); // "hola  3.1416 adios true"
		System.out.println(resultado);
	}	

}
