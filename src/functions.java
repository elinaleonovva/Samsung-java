//import java.io.IOException;
//import java.util.*;
//import java.util.Locale;
//import java.util.Scanner;
//
//public class functions {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        in.useLocale(Locale.US);
//        int n=in.nextInt();
//        int m=in.nextInt();
//        int [][] arr1=new int [n][m];
//        int [][] arr2=new int [m][n];
//        for (int i=0; i<n; i++)
//            for (int j=0; j<m; j++)
//                arr1[i][j]=in.nextInt();
//        int cnt=0;
//        for (int i=n-1; i>=0; i--) {
//            for (int j = 0; j < m; j++)
//                arr2[j][cnt] = arr1[i][j];
//            cnt++;
//        }
//        System.out.println(m+" "+n);
//        for (int i=0; i<m; i++) {
//            for (int j = 0; j < n; j++)
//                System.out.print(arr2[i][j] + " ");
//            System.out.println();
//        }
//    }
//}


//import java.util.Locale;
//import java.util.Scanner;
//
//public class functions {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        in.useLocale(Locale.US);
//        int n=in.nextInt();
//        int m= in.nextInt();
//        int [][] arr=new int [n][m];
//        int cnt=0, flag=0;
//        for (int i=0; i<n; i++){
//            if (i%2==0)
//            {
//                for (int j=0; j<m; j++) {
//                    arr[i][j] = cnt;
//                    cnt++;
//                }
//            }
//            else {
//                for (int j = m-1; j >=0; j--) {
//                    arr[i][j] = cnt;
//                    cnt++;
//                }
//            }
//        }
//        for (int i=0; i<n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.format(" %2d", arr[i][j]);
//            }
//            System.out.println();
//        }
//
//    }
//}

//import java.util.Arrays;
//import java.util.Locale;
//import java.util.Scanner;
//
//public class functions {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        in.useLocale(Locale.US);
//        int n=in.nextInt();
//        int m=in.nextInt();
//        int [][] a=new int [n][m];
//        for (int i=0; i<n*m; i++){
//            a[i / m][i % m] = (i / m) * (i % m);
//        }
//        for (int i=0; i<n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.format(" %2d", a[i][j]);
//            }
//            System.out.println();
//        }
//
//
//    }
//}


//import java.util.Scanner;
//
//public class functions {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a= in.nextInt();
//        int b= in.nextInt();
//        int cnt=0;
//        for (int i=a; i<=b ;i++){
//            if (functions.Prime(i)==true) {
//                System.out.print(i + " ");
//                cnt++;
//            }
//        }
//        if (cnt==0)
//            System.out.println(0);
//    }
//    public static boolean Prime(int n){
//        for (int i=2; i*i<=n; i++)
//            if (n%i==0)
//                return false;
//        return true;
//
//    }
//}

//import java.util.Scanner;
//
//public class functions {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        char n = in.next ().charAt (0); //ввод типа char
//        if (functions.IsDigit(n)==true)
//            System.out.println("yes");
//        else
//            System.out.println("no");
//    }
//    public static boolean IsDigit(char c){
//        int n=(int)c;
//        if (n>=48 && n<=57)
//            return true;
//        return false;
//    }
//
//}

//import java.util.Scanner;
//
//public class functions {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//            char c = in.next ().charAt (0);
//            char changedChar = changeCase(c);
//            System.out.println(changedChar);
//        }
//
//        public static char changeCase(char c) {
//            if (Character.isLowerCase(c)) {
//                return Character.toUpperCase(c);
//            } else if (Character.isUpperCase(c)) {
//                return Character.toLowerCase(c);
//            } else {
//                return c;
//            }
//        }
//}

//import java.util.Scanner;
//
//public class functions {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        String[] words = s.split(" "); //массив состоящий из строк, разделенных по пробелам
//        String longestWord = "";
//        int l = 0, maxl = -1;
//        for (String slovo: words) {
//            if (slovo.length()>maxl){
//                maxl=slovo.length();
//                longestWord=slovo;
//            }
//        }
//        System.out.println(longestWord+" "+maxl);
//    }
//}

//import java.util.Scanner;
//
//public class functions {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s=in.next();
//        String s1="";
//        s1= new StringBuilder(s).reverse().toString();
//        if (!s.equals(s1))
//            System.out.println("no");
//        else
//            System.out.println("yes");
//
//    }
//}

//import java.util.Scanner;
//
//public class functions {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s=in.next();
//        for (int i=0; i<s.length()-1; i++){
//            for (int j=i+1; j<s.length(); j++)
//                if (s.charAt(i)==s.charAt(j)){
//                    System.out.println(s.charAt(i));
//                    return;
//                }
//        }
//    }
//}

//import java.util.Scanner;
//
//public class functions {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s=in.nextLine();
//        s=s.replaceAll(" ","");
//        String s1="";
//        s1=new StringBuilder(s).reverse().toString();
//        if (!s.equals(s1))
//            System.out.println("no");
//        else
//            System.out.println("yes");
//
//    }
//}

//import java.util.Scanner;
//
//public class functions {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s=in.nextLine();
//        int cnt=0;
//        String result = removeExtraSpaces(s);
//        System.out.println(result);
//
//    }
//
//    public static String removeExtraSpaces(String s) {
//        return s.replaceAll("\\s+", " ");
//    }
//}

import java.util.Scanner;

//public class functions {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int x=0,y=0;
//        while(in.hasNextLine()) {
//            String str = in.nextLine();
//            String[] s1 = str.split(" ");
//            String s = s1[0]; // Направление
//            int n = Integer.parseInt(s1[1]); //
//            switch (s) {
//                case "South":
//                    y -= n;
//                    break;
//                case "North":
//                    y += n;
//                    break;
//                case "West":
//                    x -= n;
//                    break;
//                case "East":
//                    x += n;
//                    break;
//                default:
//                    break;
//            }
//            if (s.isEmpty()) {
//                break;
//            }
//        }
//        System.out.println(x+" "+y);
//    }
//}

//import java.util.Locale;
//import java.util.Scanner;
//
//public class functions {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        in.useLocale(Locale.US);
//        int n = in.nextInt();
//        int[][] array = new int[2 * n + 1][2 * n + 1];
//        int num = (2 * n + 1) * (2 * n + 1) - 1;
//        int rowStart = 0, rowEnd = 2 * n, colStart = 2 * n, colEnd = 0;
//
//        while (rowStart <= rowEnd && colStart >= colEnd) {
//            for (int i = colStart; i >= colEnd; i--) {
//                array[rowStart][i] = num--;
//            }
//            rowStart++;
//
//            for (int i = rowStart; i <= rowEnd; i++) {
//                array[i][colEnd] = num--;
//            }
//            colEnd++;
//
//            for (int i = colEnd; i <= colStart; i++) {
//                array[rowEnd][i] = num--;
//            }
//            rowEnd--;
//
//            for (int i = rowEnd; i >= rowStart; i--) {
//                array[i][colStart] = num--;
//            }
//            colStart--;
//        }
//
//        for (int i = 0; i < 2 * n + 1; i++) {
//            for (int j = 0; j < 2 * n + 1; j++) {
//                System.out.format("%3d", array[2 * n - j][2 * n - i]);
//            }
//            System.out.println();
//        }
//    }
//}
