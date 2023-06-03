import java.util.Scanner;public class primenpalindrome{
    static void main(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=in.nextInt();boolean p=true;
        for (int i=2;i<(x/2);i++)
         if(x%i==0)p=false;
        int r=0,l=x;
        while(x>0){int y=x%10;x=x/10;r=r*10+y;}
        if (l==r && p==true)System.out.println("The number is a prime Palindrome number");
        else System.out.println("The number is not a prime Palindrome number");
  }
}