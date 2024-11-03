import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Bana bir sayı söyle bende sana faktöriyelini hesaplayayım... ");
        int number = scanner.nextInt();
        System.out.println("Sayın: "+number +" Factöriyeli: "+ factorial(number));
        scanner.close();
    }
    public static int  factorial(int s){
        if (s==0){
            return 1;
        }
        else{
            return s*factorial(s-1);
        }
    }
}