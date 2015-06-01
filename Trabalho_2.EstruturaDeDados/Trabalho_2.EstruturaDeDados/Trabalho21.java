public class Trabalho21{
	static int G = 1;
	static int Ni = 10;
	static int Ci = 20;
	static int head = 100;
	static int golpes = 0;
	
	public static void main(String[] args){
		System.out.println("Trabaloh 2 Estrutura de Dados");
		System.out.println();
		System.out.println("Variacao do Golpes: "+G);
		System.out.println("Variacao do Golpes: "+Ni);
		
		System.out.println(verificaGolpe());
		System.out.println("Numero de cabecaas: "+head);
		System.out.println(verificaGolpe());
	}
	public static int verificaGolpe(){
		//int maior = maiorGolpe();
		int R1 = Ci - Ni;
		golpes += numeroDeGolpes(Ci, R1);
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
	// public static int maiorGolpe(){
		// int aux = 0;
		// if(Ci[0] > Ci[1]){
			// if(Ci[0] > Ci[2]){
				// System.out.println("Aux recebe: "+Ci[0]);	
				// aux = Ci[0];
			// }
			// else
				// System.out.println("Aux recebe: "+ Ci[2]);
				// aux = Ci[2];
		// }
		// else if(Ci[1] > Ci[2]){
			// System.out.println("Aux recebe: "+ Ci[1]);
			// aux = Ci[1];
		// }else{
			// System.out.println("Aux recebe: "+ Ci[2]);
			// aux = Ci[2];
		// }
		// return aux;
	// }
}