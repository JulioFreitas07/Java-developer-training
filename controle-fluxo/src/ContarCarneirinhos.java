import java.util.Scanner;

public class ContarCarneirinhos{

    public static void main(String[] args){

        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Quantos carneirinhos para dormir?");
            int quantCarneirinhos = myScanner.nextInt();

            for(int i = 1; i <= quantCarneirinhos; i++){

                System.out.println(i + " Carneirinho para dormir!");
                
                if (i == quantCarneirinhos) {

                    System.out.println("Ebaa! O Carneirinho dormiu!! béeee rsrs :)");

                }

            }
        }

    }


}