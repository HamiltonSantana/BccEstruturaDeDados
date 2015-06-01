import java.util.Scanner;

public class Trabalho2{
	static Scanner s;
	static int G;
	static int[] Ni;
	static int[] Ci;
	static int head = 100;
	static int golpes = 0;
	
	public static void main(String[] args){
		s = new Scanner(System.in);
		System.out.println("Trabaloh 2 Estrutura de Dados");
		System.out.println();
		System.out.print("Digite a variacao do Golpes: ");
		G = s.nextInt();
		System.out.println();
		Ni = new int[G];
		Ci = new int[G];
		System.out.print("Digite o numero de cabecas cortadas: ");
		for(int i=0; i < G; i++)
			Ni[i] = s.nextInt();
		System.out.println("Digite o numero de cabecas que nasceram: ");
		for(int i=0; i < G; i++)
			Ci[i] = s.nextInt();
		System.out.println(verificaGolpe());
		System.out.println("Numero de cabecaas: "+head);
		//System.out.println(verificaGolpe());
	}
	public static int verificaGolpe(){
		int maior = maiorGolpe();
		int R[] = new int[G];
		int aux = 0;
		for(int i=0; i<G; i++)
			R[i] = Ci[i] - Ni[i];
		if(head > maior){
			System.out.println("Verificando...");
			System.out.print("R");
			for(int i=0; i<G; i++)
				if(aux < R[i])
					aux = R[i];
		}
		else{
			System.out.println("Verificando...");
			System.out.println("R1 e R2"+R1+" "+R2);
			golpes += numeroDeGolpes(Ci[0], R1);
		}
		return golpes;
	}
	public static int numeroDeGolpes(int Ci, int gp){
		int count = 0;
		while(head >= Ci){
			head = head - gp;
			count += 1;
		}
		return count;
	}
	public static int maiorGolpe(){
		int aux = 0;
		for(int i=0; i<G; i++)
			if(aux < Ci[i] && head > Ci[i])
				aux = Ci[i];
		return aux;
	}
}