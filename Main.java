package simulacion;
import simulacion.SimularPi;
import java.util.*;

public class Main {
	
	public static int lado, puntos;
	public static void main(String [] args)
	{
		Scanner dato = new Scanner(System.in);

		do
		{
			System.out.println("Ingrese el tama�o del lado");
			lado = dato.nextInt();
			
		}while(lado<0);
		
		System.out.println("Ingrese la cantidad de puntos");
		puntos = dato.nextInt();
		
		SimularPi S = new SimularPi(lado, puntos); 
		Informaci�n(S);
	}
	public static void Informaci�n(SimularPi p)
	{
		System.out.println(p);
	}
}
