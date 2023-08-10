//WAP_to_print_Factorial_of_a_number




import java.util.Scanner;

public class WAP_to_print_Factorial_of_a_number{
    public static void main(String[] args) {
        int num;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = Input.nextInt();
        Input.close();
        int fact = 1;

        for (int i = num;i>=1;i--){
            fact = fact*i;
        }
        System.out.println("The factorial of given Number is : "+fact);
    }
}
