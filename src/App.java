import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input a number: ");

        try {
            int factorialNumInput = sc.nextInt();
            int FactorialInput = 1;
            if(factorialNumInput < 0){
                throw new NegativeException("Negative");
            }else if(factorialNumInput == 0){
                FactorialInput = 0;
                
            }else{
            
                for(int i = 1; i <= factorialNumInput; i++){
                FactorialInput *= i;
                }
            System.out.println(FactorialInput);
        }
        } catch (InputMismatchException e) {
            System.out.println(e);
        }

    }
}
