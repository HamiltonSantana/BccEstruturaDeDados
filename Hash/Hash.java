import java.util.Scanner;

public class Hash{
	static No hash[] = new No[10];
	static int vetor[] = new int[10];
	static Scanner scx;
	public static void main(String[] args){
		scx = new Scanner(System.in);
		for(int i=0; i<10; i++)
			vetor[i] = scx.nextInt();
		iniciaHash();
		for(int i=0; i<10; i++)
			calculaHash(vetor[i]);
		imprimeHash();
	}

	public static void iniciaHash(){
		for(int i=0; i<10; i++)
			hash[i] = new No(i);
	}
	public static void calculaHash(int x){
		int aux;
		aux = x % 5;
		if(hash[aux].prox == null)
			hash[aux].prox = No(x);
		else{
			No p = hash[aux];
			while(p.prox != null)
				p=p.prox;
			No novo = No(x);
			p.prox = novo;
		}
	}
	public static void imprimeHash(){
		for(int i=0; i<10; i++){
			System.out.print(hash[i].valor);
			No p = hash[i];
			while(p != null)
				System.out.print(p.valor+" ");
			System.out.println();
		}
	}
}
