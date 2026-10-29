import java.util.Scanner;


public class Ex01Helloworld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello World!!, seja bem vinda a Apredendo Java, vamos começa com o envio de mensagens e o recebido de resposta do usuario, e claro o armazenamento dessa informação");

        System.out.println("Please, enter your name:");
         String name = sc.nextLine();

        System.out.println("Welcome " + name + " to the wold of Java programming!");

        System.out.println("Por favor, seu informe seu nivel de habilidade em java, RF(registro de funcionario):");
        String cargo = sc.nextLine();
        String rf = sc.nextLine();

        System.out.println(" Want to City, para confirmação");
        String city = sc.nextLine();

       System.out.println(name +  cargo + rf + city );
 
 sc.close();   

 
    }
}
