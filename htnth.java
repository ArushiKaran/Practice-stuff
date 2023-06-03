import java.util.Scanner; 
public class htnth{
    static void main(){
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the value of n");
       double n=in.nextInt(), s=0;
       for(int i=1;i<=n;i++){
           s+=(i/10.0);
       }
       System.out.println(s);
    }
}