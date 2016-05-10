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
			System.out.println("Ingrese el tamaño del lado");
			lado = dato.nextInt();
			
		}while(lado<0);
		
		System.out.println("Ingrese la cantidad de puntos");
		puntos = dato.nextInt();
		
		SimularPi S = new SimularPi(lado, puntos); 
		Información(S);
	}
	public static void Información(SimularPi p)
	{
		System.out.println(p);
	}
}
