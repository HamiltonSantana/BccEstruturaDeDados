import java.util.Scanner;

public class Trabalho_2{
	static Scanner scx;
	static int G;
	static int Ci[];
	static int Ni[];
	static int head = 100;
	static int count = 0;
	static int player = 0;
//-----------------------------------------
	public static void main(String[] args){
		int j = -1;
		int R[];
		int x = 0;
		scx = new Scanner(System.in);
		G = scx.nextInt();
		inicializa();
//-----------------------------------------		
		R = new int[G];
		for(int i=0; i<G; i++)
			R[i] = Ci[i] - Ni[i];
		while(head > 0 && player != -1){
			System.out.println("Numero de Cabecas: "+ head);
			
			if(head >= 1000 && head < 0){
				player = -1;
				System.out.println("Cavaleiro Morreu !");
			}
			x = verificaMelhor(R, j);
			if(head > Ci[x]){	
				System.out.println("Inicio do Jogo");
				System.out.println("1 - Melhor ataque: "+Ci[x]);
				while(head > Ci[x] && head >  0){
					if(head == Ci[x]){
						System.out.println("Golpe Final");
						head = head - Ci[x];
					}
					else{
						head = head - R[x];
						count ++;
					}
				}
			}else{	
				j = x;
				x = verificaMelhor(R, j);
				System.out.println("2 - Melhor ataque: "+Ci[x]);
				while(head > Ci[x] && head >  0){
					if(head == Ci[x])
						head = head - Ci[x];
					head = head - R[x];
					count ++;
				}
			}
	}
		System.out.println("Numero de golpes: "+count);
		System.out.println("Cabecas restantes: "+head);
	}
//==================================================
	public static void inicializa(){
		Ci = new int[G];
		Ni = new int[G];
//-----------------------------------------		
		for(int i=0; i<G; i++)
			Ci[i] = scx.nextInt();
		for(int i=0; i<G; i++)
			Ni[i] = scx.nextInt();
	}
	public static int verificaMelhor(int[] r, int x){
		int aux = 0;
		int index = 0;
		if(x == -1){
			for(int i=0; i<G; i++){
				if(aux < r[i]){
					aux = r[i];
					index = i;
				}
			}
		}else{
			for(int i=0; i<G; i++){
				if(aux < r[i] && i != x){
					aux = r[i];
					index = i;
				}
			}
		}
		System.out.println("Melhor golpe: "+r[index]);
		return index;
	}
}