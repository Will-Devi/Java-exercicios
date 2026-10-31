import java.util.Scanner;

public class AvaliacaoDeMedia{

    // metodo boleano experimental 
    public static boolean notaV(double nota){
        return (nota >= 0 && nota <= 10);
    }

    public static void main(String[] args){
        //inicia o scannner como sc, para permiti a criação de variavel
        Scanner sc= new Scanner(System.in);

        System.out.printf("Welcome teachet, deseja verificar a ser seus alunos estão?" + "\n" 
        + " Please informe as notas\n");
        System.out.printf("nome do aluno\n");
        String nome = sc.next();
        System.out.printf("Português\n");
        double port = sc.nextDouble();
        System.out.printf("Matemética\n");
        double mate = sc.nextDouble();
        System.out.printf("Historia\n");
        double hist = sc.nextDouble();
        System.out.printf("Geografia\n");
        double geog = sc.nextDouble();
        System.out.printf("inglês\n");
        double ingle = sc.nextDouble();
        System.out.printf("Ciência\n");
        double cien = sc.nextDouble();
        // VALIDAÇÃO USANDO O MÉTODO BOOLEANO
        // Se QUALQUER UMA das notas for inválida 
        // atravez do metodo de inverção !! 
        // dentro do valor booleano (maior que 10 ou menor que 0)
        //

   if (!notaV(port) ||!notaV(mate) || !notaV(hist) || !notaV(geog) || !notaV(ingle) || !notaV(cien)){

        System.out.printf("ERRO, uma das notas informadas é invalida, sendo maior que DEZ ou menor que ZERO\n" );
   } else {

    double media = (port + mate + hist + geog + ingle + cien )/ 6;

        if (media >= 7 ){
            System.out.printf("Parabens " + nome + "\n foi aprovado com sucesso nota: ");
            System.out.printf("media %.2f%n", media );

        }else if (media >= 5){
            System.out.printf("Muito bem," + nome + "\n esta em recupera, nada muito preocupante a com nota:");
            System.out.printf("media %.2f%n", media );

        } else {
            System.out.printf("Infelizmente a nota não é suficiente ");
            System.out.printf("media: %.2f%n", media, nome + " esta reprovado\n");
        }

   }
        sc.close();
    }
}