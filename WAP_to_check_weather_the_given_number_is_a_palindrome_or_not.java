//WAP_to_check_weather_the_given_number_is_a_palindrome_or_not

/*A number that remains the same after it is reversed
* This program will take a three-digit number and check weather it is a palindrome or not
* to do this we will break the given number into three parts and then add them together , to get the reverse of the given number
* And then compare it,
*
* let's understand the three-digit number first,
* for any given three-digit number, let's say xyz , we can write it as 100x + 10y + z
* that means to break this number we will divide the number by 100 so that we can get the number that is in the hundredth place
* after that we will divide the number by 10 so that we can get the number that is in the tenth place,
* and then we will divide the number by 1 so that we can get the number that is in the unit place
*
* After that to reverse it we can multiply the number in the hundredth place by 1
* the number in the tenth place by 10
* and the number in the unit place by 100
* and then add them together
*
* */


import java.util.Scanner;

public class WAP_to_check_weather_the_given_number_is_a_palindrome_or_not{
    public static void main(String[] args) {
        int num;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a Three-digit Number : ");
        num = Input.nextInt();
        Input.close();

        // breaking the number into three parts
        int x = num/100;
        int y = (num - (x*100))/10;
        int z = num - ((x*100) + (y*10));
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
        //reversing the number
        int reverse = 0;
        reverse = (z*100) + (y*10) + x;

        //checking if the number is palindrome or not
        if (num == reverse){
            System.out.println("The number is palindrome : " + num);
        }
        else {
            System.out.println("The number is not palindrome : " + num);
        }
//        System.out.println(reverse);
    }
}
