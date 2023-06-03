public class fibonacci{
    static void main(){
        System.out.print("0, 1, ");
        int a=0,b=1,c;
        for (int i=0;i<18;i++){
            c=b;
            b=a+b;
            a=c;
            if (i>16)
                System.out.print(b);
            else
                System.out.print(b+", ");
        }
    }
}
