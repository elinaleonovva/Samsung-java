import java.util.Scanner;

public class dop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        int e=in.nextInt();
        for (int i=2; i*i<=a; i++)
            if (a%i==0){
                System.out.println("composite");
                return;
            }
        System.out.println("prime");

    }
}