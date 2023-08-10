import java.util.Scanner;

public class WAP_to_check_weather_the_given_number_is_a_prime_number_or_not{
    public static void main(String[] args) {
        int num,count=0;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a number to check weather it is prime or not");
        num = Input.nextInt();
        Input.close();

        //checking weather a given number is prime or not
        for (int i = 1;i<=num;i++){
            if (num%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
