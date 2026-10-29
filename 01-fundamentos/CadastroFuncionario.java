import java.util.Scanner;

/*A empresa precisa de um programa simples para cadastrar funcionários durante um teste interno.

O sistema deverá solicitar informações ao usuário e, no final, apresentar um pequeno resumo do cadastro.

Dados necessários

O programa deverá receber:

Nome
Cargo
Idade
Salário
Cidade

Depois deverá apresentar os dados cadastrados. */

public class CadastroFuncionario {
    
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome, a empresa HelloWorld, sua chegada é muito Gratificate!!!");

        System.out. println("Vou precisa de alguns dados seu, para confirmação de usuário, right? ");
        
        System.out.println(" Please enter your name?");
        String name = sc.nextLine();

        System.out.println("Please enter your position?");
        String position = sc.nextLine();

        System.out.println("Please enter your age?");
        int age = sc.nextInt();

        System.out.println("Please enter your salary ?");
        double salary = sc.nextDouble();
        
        sc.nextLine();

        System.out.println("Please enter your city?");
        String city = sc.nextLine();

        System.out.println("===================================" +"\n"
        +"CADASTRO CONCLUÍDO" +"\n"
        +"===================================" +"\n"
            + name + "\n"
            + position + "\n"
            + age + " \n "
            + salary + "\n"
            + city + "\n"

            +"===================================" +"\n"

        );


        System.out.println("Certo !!!, todas as informação foram verificadas e confirmadas");
        System.out.println("Welcome " + name + " de " + age + " A HelloWorld o parabenizar por conquista a position " + position + " com o maravilhoso " + salary + "\n" +
            "Espero que sesja o suficiente para alivia a saudade da " + city  );

        sc.close();



    }
}
