public class Trabalho2{
	static int G = 3;
	static int[] Ni = {10, 16, 11};
	static int[] Ci = {7, 11, 15};
	static int head = 100;
	static int golpes = 0;
	
	public static void main(String[] args){
		System.out.println("Trabaloh 2 Estrutura de Dados");
		System.out.println();
		System.out.println("Variacao do Golpes: "+G);
		System.out.println("Numero de cabecas cortadas: "+Ci[0]+" "+Ci[1]+" "+Ci[2]);
		System.out.println("Numero de cabecas que nasceram: "+Ni[0]+" "+Ni[1]+" "+Ni[2]);
		System.out.println(verificaGolpe());
		System.out.println("Numero de cabecaas: "+head);
		System.out.println(verificaGolpe());
	}
	public static int verificaGolpe(){
		int maior = maiorGolpe();
		int R1 = Ci[0] - Ni[0];
		int R2 = Ci[1] - Ni[1];
		int R3 = Ci[2] - Ni[2];
		if(head > maior){
			System.out.println("Verificando...");
			System.out.println("R1 e R2 e R3: "+R1+" "+R2+" "+R3);
			if(R2 > R1){
				if(R2 > R3)
					golpes = numeroDeGolpes(Ci[1], R2);
				else
					golpes = numeroDeGolpes(Ci[2], R3);
			}else if(R1 > R3)
					golpes = numeroDeGolpes(Ci[0], R1);
			else
					golpes = numeroDeGolpes(Ci[2], R3);
		}
		else{
			System.out.println("Verificando...");
			System.out.println("R1 e R2"+R1+" "+R2);
			if(R2 > R1){
				R2 = R2 * -1;
				golpes += numeroDeGolpes(Ci[1], R2);
			}else
				R1 = R1 * -1;
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
		if(Ci[0] > Ci[1]){
			if(Ci[0] > Ci[2]){
				System.out.println("Aux recebe: "+Ci[0]);	
				aux = Ci[0];
			}
			else
				System.out.println("Aux recebe: "+ Ci[2]);
				aux = Ci[2];
		}
		else if(Ci[1] > Ci[2]){
			System.out.println("Aux recebe: "+ Ci[1]);
			aux = Ci[1];
		}else{
			System.out.println("Aux recebe: "+ Ci[2]);
			aux = Ci[2];
		}
		return aux;
	}
}