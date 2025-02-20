//Sum of Digits

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int sum=0;
        while(n>0){
            int r=n%10;
            sum+=r;
            n/=10;
        }
        System.out.print(sum);
    }
}
