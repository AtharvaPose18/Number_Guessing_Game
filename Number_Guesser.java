import java.util.Scanner;
import java.util.Random;
public class Number_Guesser{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int number=random.nextInt(100)+1;
        int guess;
        int attempts=0;
        do{
            System.out.println("Enter a guess between 1 to 100:");
            guess=sc.nextInt();
            attempts++;
            if(guess<number){
                System.out.println("The number is greater than your guess!");
            }
            else if(guess>number){
                System.out.println("The number is smaller than your guess!");
            }
            else{
                System.out.println("Correct! You won");
                System.out.println("Attempts:"+attempts);
            }
        }while(guess!=number);




    }
}