import java.util.Scanner;

class exerciciocenso
{
	public static void main (String[] args)
	{
        Scanner ler = new Scanner(System.in);
        int a[]={0,0,0,0,0};
        // Declarado variavel inteira a vetor com 5 valores e atribuido valor de 0,0,0,0,0
        int b[]={0,0,0,0,0};
        // Declarado variavel inteira b vetor com 5 valores e atribuido valor de 0,0,0,0,0
        int x=0;
        // Declarado variavel x e atribuido valor de 0
        int c=0;
        // Declarado variavel c e atribuido valor de 0
        do 
        // Comando faca
        {
            System.out.print ("\nDigite o valor de A:");
            // Exibe "Digite o valor de A:" \n para realizar a quebra de linha
            a[x] = ler.nextInt();
            // Realiza a leitura de variavel a[variavel x]
            System.out.print ("Digite o valor de B:");
            // Exibe "Digite o valor de B:"
            b[x] = ler.nextInt();
            // Realiza a leitura da variavel b[variavel x]
            x++;
            // Soma + 1 na variavel x
        }while (x<5);
        // Comando enquanto (variavel x for menor que 5)
        x=0;  
        // Atribuido valor de 0 para variavel x
        c=0;
        // Atribuido valor de 0 para variavel c
        do{
        // Comando faca
            c = c + (a[x] * b[x]);
            // Atribuido para a variavel c, o valor de variavel c + variavel a[variavel x] multiplicado por variavel b[variavel x], parenteses para realizar primeiro a multiplicacao
            x++;
            // Soma + 1 na variavel x
        }while (x<5);
        // Enquanto (variavel x for menor que 5)
        System.out.printf("\n\nO valor de c e igual a: "+c+"\n\n");
        // Exibe "O valor de c e igual a:" concatenacao de variavel c
    }
}     0
