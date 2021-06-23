package PKtProjectoCombinatoria;
import java.util.Scanner;

public class Projecto3Combinatoria {
	static double factorial=0;
	static int i=0;

	public double calc_factorial(double numero) {
		factorial=1;
		for(i=1;i<=numero;i++) {
			factorial*=i;
		}
		return factorial;
	}
	
	public static void main(String[] args) {
		double V=0,VR=0,C=0,CR=0,P=0,operacion=0,operacion2=0,aux=0,aux2=0;
		int i=0,opcion=0,n=0,r=0,a=0,b=0,c=0,expa=0,expb=0,expc=0;
		Scanner ObjLeer=new Scanner(System.in);
		Projecto3Combinatoria ObjLlamar=new Projecto3Combinatoria();
		do {
			System.out.println("Escoge la opcion a utilizar:\n1. No importa el orden,no se puede repetir.\n2. No importa el orden,se puede repetir."
					+ "\n3. Importa el orden,no usamos todos los elementos y no se repiten.\n4. No importa el orden,no usamos todos los elementos y se repiten."
					+ "\n5. Importa el orden, usamos todos los elementos y no se repiten.\n6. Importa el orden,usamos todos los elementos y se repiten."
					+ "\n7. Salir de la aplicacion.");
			opcion=ObjLeer.nextInt();
			switch(opcion) {
			case 1:
				System.out.print("Ingrese el valor de n ");n=ObjLeer.nextInt();System.out.print("Ingrese el valor de r ");r=ObjLeer.nextInt();
				operacion=n-r;
				aux=ObjLlamar.calc_factorial(n);aux2=ObjLlamar.calc_factorial(r);
				C=aux/(aux2*(ObjLlamar.calc_factorial(operacion)));
				System.out.println("El resulta de la operacion es " +C);break;
			case 2:
				System.out.print("Ingrese el valor de n ");n=ObjLeer.nextInt();System.out.print("Ingrese el valor de r ");r=ObjLeer.nextInt();
				operacion=(n+r-1);
				operacion2=(n-1);
				CR=ObjLlamar.calc_factorial(operacion)/(ObjLlamar.calc_factorial(r)*ObjLlamar.calc_factorial(operacion2));
				System.out.println("El resultado de la operacion es:" +CR);break;
			case 3:
				System.out.print("Ingrese el valor de n ");n=ObjLeer.nextInt();System.out.print("Ingrese el valor de r ");r=ObjLeer.nextInt();
				operacion=n-r;
				V=ObjLlamar.calc_factorial(n)/ObjLlamar.calc_factorial(operacion);
				System.out.println("El resultado de la operacion es:" +V);break;
			case 4:
				System.out.print("Ingrese el valor de n ");n=ObjLeer.nextInt();System.out.print("Ingrese el valor de r ");r=ObjLeer.nextInt();
				VR=Math.pow(n, r);
				System.out.println("El resultado de la operacion es:" +VR);break;
			case 5: 
				System.out.print("Ingrese el valor de n ");n=ObjLeer.nextInt();
				P=ObjLlamar.calc_factorial(n);
				System.out.println("El resultado de la operacion es:" +P);break;
			case 6:
				System.out.print("Ingrese la cantidad de cifras ");n=ObjLeer.nextInt();System.out.print("Ingrese el valor de a ");a=ObjLeer.nextInt();
				System.out.print("Ingrese el valor de b ");b=ObjLeer.nextInt();System.out.print("Ingrese el valor de c ");c=ObjLeer.nextInt();
				System.out.print("Ingrese el exponente de a ");expa=ObjLeer.nextInt();System.out.print("Ingrese el exponente de b ");expb=ObjLeer.nextInt();
				System.out.print("Ingrese el exponente de c ");expc=ObjLeer.nextInt();
				if(a==0)
					{a=1;}
				if (b==0)
					{b=1;}
				if(c==0)
					{c=1;}
				P=Math.pow(a, expa)*Math.pow(b, expb)*Math.pow(c, expc);
				System.out.println("El resultado de la operacion es:" +P);break;
			case 7:
				System.out.println("Gracias por utilizar esta aplicacion.");break;
			}
		}while(opcion!=7);
	}
}
