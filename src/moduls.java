//1.1
//import java.util.Scanner;
//
//public class moduls {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a= in.nextInt();
//        int b= in.nextInt();
//        System.out.println(a+b);
//        System.out.println((-5)%2);
//
//        main2.f2(12);
//    }
//}
//
//1.5
//import java.util.Locale;
//import java.util.Scanner;
//
//public class moduls {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        in.useLocale(Locale.US);
//        double a= in.nextDouble();
//        if ((a>=-2 && a<=3) || (a>=6 && a<=9))
//            System.out.println("false");
//        else
//            System.out.println("true");
//    }
//}
//
//
//import java.util.Scanner;
//
//public class moduls {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a= in.nextInt();
//        int b=in.nextInt();
//        int c=in.nextInt();
//        int cnt=0;
//        if (a%2==0)
//            cnt++;
//        if (b%2==0)
//            cnt++;
//        if (c%2==0)
//            cnt++;
//        if (cnt>=2)
//            System.out.println("true");
//        else
//            System.out.println("false");
//    }
//}
//
//1.5
//import java.util.Locale;
//import java.util.Scanner;
//import static java.lang.Math.sin;
//
//public class moduls {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        in.useLocale(Locale.US);
//        double x= in.nextDouble();
//        double y= in.nextDouble();
//        if ( (x*x+y*y<=1 && y<=1 && x>=0) || (x*x+y*y>=1 && y<=1 && y>=(x-1) && x>=0 && y>=0) )
//            System.out.println("YES");
//        else
//            System.out.println("NO");
//    }
//}
//
//import java.util.Scanner;
//
//public class moduls {
//    public static void main(String[] args) {
//        int n = new Scanner(System.in).nextInt();
//        n++;
//        int numb = 0;
//        if (n < 1000) {
//            for (int i = n; i < 1000; i++) {
//                if (check(i)) {
//                    numb = i;
//                    break;
//                }
//            }
//            System.out.println(numb);
//        }
//    }
//    public static boolean check(int numb) {
//        for (int i = 2; i < numb; i++) {
//            if (numb % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
//
//import java.util.Scanner;
//import java.util.Collections;
//import static java.lang.Math.pow;
//import java.util.Collections;
//public class moduls {
//    public static void main(String[] args) {
//        int n = new Scanner(System.in).nextInt();
//        int T=10;
//        int num=0;
//        int cnt=0;
//        while(n>0)
//        {
//            num+=(n%2)*pow(T,cnt);
//            n/=2;
//            cnt++;
//        }
//        String str = Integer.toString(num);
//        for (int i=str.length()-1; i>0; i--)
//            System.out.println(str[i]+"");
//
//
//    }
//}
//
//import java.util.Scanner;
//
//public class moduls {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        double a= in.nextDouble();
//        long n= in.nextInt();
//        System.out.println(Rec(a,n));
//
//    }
//    public static double Rec(double a, long n) {
//        if (n==0)
//            return 1;
//        else if (n==1)
//            return a;
//        else if (n%2==0)
//            return Rec(a*a,n/2);
//        else
//            return a*Rec(a,n-1);
//    }
//}
//
//import java.util.Scanner;
//import java.util.Arrays;
//public class moduls {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a= in.nextInt();
//        int b= in.nextInt();
//        int c= in.nextInt();
//        int [] arr = new int[3];
//        arr[0]=a;
//        arr[1]=b;
//        arr[2]=c;
//        Arrays.sort(arr);
//        for (int i=0; i<arr.length; i++)
//            System.out.print(arr[i]+" ");
//    }
//}
//
//import java.util.Scanner;
//import java.util.Arrays;
//public class moduls {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int[] arr = new int[3];
//        arr[0] = a;
//        arr[1] = b;
//        arr[2] = c;
//        Arrays.sort(arr);
//        if (arr[0] + arr[1] <= arr[2])
//            System.out.println("impossible");
//        else if (arr[2] == Math.sqrt(arr[0] * arr[0] + arr[1] * arr[1]))
//            System.out.println("right");
//        else if (((arr[0] * arr[0]) + (arr[1] * arr[1]) - (arr[2] * arr[2])) / (2 * a * b) > 0)
//            System.out.println("acute");
//        else
//            System.out.println("obtuse");
//    }
//}
//
//import java.util.Scanner;
//public class moduls {
//    enum Numeral {
//        I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);
//        int weight;
//
//        Numeral(int weight) {
//            this.weight = weight;
//        }
//    };
//    public static String roman(long n) {
//
//        if( n <= 0) {
//            throw new IllegalArgumentException();
//        }
//
//        StringBuilder buf = new StringBuilder();
//
//        final Numeral[] values = Numeral.values();
//        for (int i = values.length - 1; i >= 0; i--) {
//            while (n >= values[i].weight) {
//                buf.append(values[i]);
//                n -= values[i].weight;
//            }
//        }
//        return buf.toString();
//    }
//    public static void test(long n) {
//        System.out.println(roman(n));
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a= in.nextInt();
//        test(a);
//    }
//}
//
//import java.util.Scanner; //степень двойки
//import java.util.Arrays;
//public class moduls {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//
//        System.out.println(1<<a);
//    }
//}
//
//import java.util.Scanner; //обнуление старших бит
//import java.util.Arrays;
//public class moduls {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int i = in.nextInt();
//        System.out.println(a & ((1 << i) - 1));
//    }
//}
//
//import java.util.Scanner; //степень двойки
//import java.util.Arrays;
//public class moduls {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        if ((a&(a-1))==0)
//            System.out.println(0);
//        else
//            System.out.println(-1);
//    }
//}
//
//import java.util.BitSet;
//import java.util.Scanner; //степень двойки
//import java.util.Arrays;
//public class moduls {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        long value = scan.nextLong();
//        int pos = scan.nextInt();
//
//        BitSet bs = BitSet.valueOf(new long[]{value});
//        bs.set(pos);
//        System.out.println(bs.toLongArray()[0]);
//    }
//}
//
//
//import java.util.Scanner;
//public class moduls {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();
//        int [] cards=new int[m];
//        for (int i=0; i<m; i++)
//            cards[i]= scanner.nextInt();
//        int n = cards.length + 1;
//        int totalSum = n * (n + 1) / 2;
//        int cardSum = 0;
//
//        for (int i = 0; i < cards.length; i++) {
//            cardSum += cards[i];
//        }
//
//        int missingCard = totalSum - cardSum;
//        System.out.println(missingCard);
//    }
//}
//
//import java.util.Scanner;
//
//public class moduls {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        int[] cards = new int[n];
//
//        for (int i = 0; i < n - 1; i++) {
//            cards[i] = scanner.nextInt();
//        }
//
//        int totalSum = n * (n + 1) / 2;
//
//        int cardSum = 0;
//        for (int i = 0; i < n - 1; i++) {
//            cardSum += cards[i];
//        }
//
//        int missingCard = totalSum - cardSum;
//        System.out.println(missingCard);
//    }
//}
//
//import java.util.*;
//
//public class moduls {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt(); // Размер таблицы
//
//        int[][] vasyaTable = new int[n][n];
//        int[][] petyaTable = new int[n][n];
//
//        int c=1;
//        // Заполнение таблицы Васи
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                vasyaTable[i][j] = c;
//                c++;
//            }
//        }
//
//        int k=1;
//        // Заполнение таблицы Пети
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                petyaTable[j][i] = k;
//                k++;
//            }
//        }
//
//        Set<Integer> commonNumbers = new HashSet<>();
//
//        // Поиск общих чисел
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (vasyaTable[i][j] == petyaTable[i][j]) {
//                    commonNumbers.add(vasyaTable[i][j]);
//                }
//            }
//        }
//
//        List<Integer> sortedNumbers = new ArrayList<>(commonNumbers);
//        Collections.sort(sortedNumbers);
//
//        // Вывод общих чисел
//        for (int number : sortedNumbers) {
//            System.out.print(number + " ");
//        }
//    }
//}
//
//import java.util.Scanner;
//public class moduls {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int[] sequence = new int[N];
//        int A = scanner.nextInt();;
//        int B = scanner.nextInt();
//        int C = scanner.nextInt();
//        int D = scanner.nextInt();
//
//        // Заполнение последовательности числами от 1 до N
//        for (int i = 0; i < N; i++) {
//            sequence[i] = i + 1;
//        }
//
//        reverse(sequence, A-1, B-1); // Переворот части последовательности от A до B
//        reverse(sequence, C-1, D-1); // Переворот части последовательности от C до D
//
//        // Вывод результата
//        for (int i = 0; i < N; i++) {
//            System.out.print(sequence[i] + " ");
//        }
//    }
//
//    // Метод для переворота части последовательности
//    public static void reverse(int[] sequence, int start, int end) {
//        while (start < end) {
//            int temp = sequence[start];
//            sequence[start] = sequence[end];
//            sequence[end] = temp;
//            start++;
//            end--;
//        }
//    }
//}