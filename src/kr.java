//3
//import java.util.Scanner;
//
//public class kr {
//    public static void main(String[] args) {
//        double result = 0;
//        Scanner in = new Scanner(System.in);
//        double a= in.nextDouble();
//        String s1=in.next(); //считывание знака +
//        double b=in.nextDouble();
//        String s2=in.next();
//        double c= in.nextDouble();
//        //in.useLocale(Locale.US);
//        if (s1.equals("+"))
//        {
//            result=a+b;
//        }
//        if (s2.equals("+"))
//            result+=c;
//        System.out.println(result);
//    }
//}

//8
//if (c==0) //do while
//{
//    c++;
//    x++;
//}

//9
//   ; c < 50 && x < 500; c++, x+=2*c //for

//10
//int cnt=0;
//do{
//    if (x%d==0) cnt+=1;
//    d++;
//} while(d < x && cnt==0);
//if (cnt==1)
//    d--;


//12
//int c=0;
//for (int i=0; i<a.length; i++)
//    if (i%2==0 && a[i]%2==0)
//        c++;

//13 главное, что функция была корректной
//static double f(String s){
//    return 0.0;
//}

//import java.util.Scanner;
//
//public class kr {
//    public static void main(String[] args) {
//        int[] a = {1, 2, 3};
//        int c=0;
//        for (int i=0; i<a.length; i++)
//            if (i%2==0 && a[i]%2==0)
//                c++;
//        System.out.println(c);
//    }
//}


//12
import java.util.Scanner;
import static java.lang.Double.parseDouble;

//public class kr {
//    public static void main(String[] args) {
//        int[] a = {1, 2, 3};
//        int c=0;
//        for (int i=0; i<a.length; i++)
//            if (i%2==0 && a[i]%2==0)
//                c++;
//        System.out.println(c);
//    }
//    public static double f(String a){
//        return Double.parseDouble(a);
//    }
//}


//15
//public class kr {
//    public static void main(String[] args) {
//        int[][] a = {{1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        for (int i=0; i<a.length; i++){
//            int flag=0;
//            for (int j = 0; j < a[i].length; j++){
//                if (i%2==0 && j%2==0)
//                {
//                    flag=1;
//                    System.out.print(a[i][j] + " ");
//                }
//            }
//            if (flag==1)
//                System.out.println();
//        }
//    }
//}

//16 сдвиг вправо
//public static void rotRight(int[] arr){
//    int c=arr[arr.length-1];
//    for (int i=arr.length-1; i>0; i--)
//        arr[i]=arr[i-1];
//    arr[0]=c;
//}

