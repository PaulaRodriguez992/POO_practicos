import java.util.Arrays;

public class Ejerc4 {
	
	private int []numeros = {4,2,3,8,1};
	
	//esto siempre va a ser necesario para el atributo numeros (el set y get)
	public void setNumeros(int[]numeros) {this.numeros=numeros;}
	public int [] getNumeros() {return this.numeros;}
	
	public int getCantidad() {return this.numeros.length;}
	
	//a get le agregamos cualquier otra palabra y no importa cual, solo necesitamos get?
	public int getMayor() {
		int mayor=numeros[0];
		//en el for esta haciendo varias conciones a la vez en una misma linea?
		for (int i = 0 ; i < numeros.length ; i++) {
			
			if(numeros[i]> mayor) {
				mayor= numeros[i];
			}
		}
		return mayor;
	}
	
	public double getPromedio (int[]numeros) {
		int suma=0;
		for (int i=0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		return (double)suma/numeros.length;
	}
	
	//no entiendo qeu seria getSortedAsc 
	public int []getSortedAsc (int[]numeros){
		
		//copyof es algo del programa?
		int []copiaProfunda = Arrays.copyOf(numeros, numeros.length);
		Arrays.sort(copiaProfunda);
		
		return copiaProfunda;
	}

}