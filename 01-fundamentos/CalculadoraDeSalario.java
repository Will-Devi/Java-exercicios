import java.util.Scanner;

 public class CalculadoraDeSalario{


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome employee veio verificar o valor do seu aumento de final de ano ?? \n"+
         "um grana a mais no salary sempre cair bem como esta no final da ano \n" +
         "esta na epoca do reajuste salary increase de até: 10 percentage para a happy" );

        System.out.println( "Please your name ?");
        String name = sc.nextLine();

        System.out.println("Please your current salary R$ ?");
        double salary = sc.nextDouble(); 

        System.out.println("Please the your increase percentage, de acordo com sua posion");
        double increase = sc.nextDouble();

        if (salary > 0 && increase > 0 ){
          
          double aumento = salary * increase / 100;  

        System.out.println (
      "======================================================\n"+
          " Employee: " + name  +"\n"
        + " Current salary:R$ " + salary +"\n"
        + " Increase:% " + increase +"\n"
        + " Increase value:R$ " + aumento +"\n" 
        + " New salary:R$ " + (salary + aumento) +"\n"
        + " Congratulations! "+
      "======================================================\n");

        }else {

          System.out.println("Erro: o salário deve ser maior que zero e a porcentagem de aumento também deve ser maior que zero R$");
        }

        sc.close();

    }


 }