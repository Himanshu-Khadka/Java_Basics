

import java.util.Scanner;

public class Wap_to_print_fabonacci_series_upto_given_index_in_Java{
    public static void main(String[] args) {

        int a = 0,b=1,temp;
        int upto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want to print");
        upto = sc.nextInt();
        sc.close();

        //logic
        /* Expected OutPut is 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
        * possible solution is to use a for loop and print the sum of a and b but the optimal solution is to use  if else statement
        * until n < 1
        *
        * */
        for(int i = 0;i<upto;i++){
            if(i<1){
                System.out.println(1);
            }
            else{
                temp = a + b;
                System.out.println(temp);
                a = b;
                b = temp;

            }
        }

    }
}
