import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		//sequência de Fibonacci
		//0,1,1,2,3,5,8,13,21,34
		System.out.println("Digite um número para vêlo na sequência de Fibonacci: ");
		int posicao = entrada.nextInt();
		int atual = 1, antescessor = -1,suscessor = 0;
		int cont = 0;
		while(cont < posicao){
			suscessor = antescessor + atual;
			antescessor = atual;
			atual = suscessor;
			cont++;
		}
		System.out.println(suscessor);
	}
}