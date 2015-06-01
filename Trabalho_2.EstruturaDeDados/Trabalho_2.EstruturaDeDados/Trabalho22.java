public class Trabalho22{
	static int G = 4;
	static int[] Ni = {24, 2, 14, 17};
	static int[] Ci = {15, 17, 20, 5};
	static int head = 100;
	static int golpes = 0;
	
	public static void main(String[] args){
		System.out.println("Trabaloh 2 Estrutura de Dados");
		System.out.println();
		System.out.println("Variacao do Golpes: "+G);
		//System.out.println("Variacao do Golpes: "+Ni);
		System.out.println(verificaGolpe());
		System.out.println("Numero de cabecaas: "+head);
		System.out.println(verificaGolpe());
	}
	public static int verificaGolpe(){
		int maior = maiorGolpe();
		int melhor = 0;
		int indice = 0;
		int golpes = 0;
		int[] R = new int[G];
		for(int i=0; i<G; i++)
			R[i] = Ci[i] - Ni[i];
		for(int i=0; i<=R.length; i++){
			if(melhor < R[i]){
				melhor = R[i];
				indice = i;
			}
		}
		golpes += numeroDeGolpes(Ci[indice], melhor);
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
		for(int i=0; i<=Ci.length;i++)
			if(aux < Ci[i])
				aux = Ci[i];
		return aux;
	}
}