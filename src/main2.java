//import java.util.Arrays;
//import java.util.Scanner;
////public - уровень открытости
////private - функция используется только внутри своего класса
////protected - только внутри одной папки функция видна
////default - в папке/ внутри ф/ внутри полей этого же класса
//
//public class main2 { //методы
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        main2 main2 = new main2(); //экземпляр нашего класса
//        main2.f1(12);
//        main2.f2(14);
//        //System.out.println(f3(10));
//        int [] x=new int[1];
//        x[0]= in.nextInt();
//        System.out.println(x[0]);
//        System.out.println(f3(x));
//
//
//        int[][] array = new int[5][3];
//        int[][] array1 = new int[][]{{1,2,3,4,5},{1,2,3},{1}};
//        for (int i=0; i<array1.length; i++) {
//            for (int j = 0; j < array1[i].length; j++)
//                System.out.print(array1[i][j] + " ");
//        }
//        System.out.println(Arrays.toString(array1[2]));
//    }
//
//    public void f1(int x){
//        x++;
//        System.out.println(x);
//    }
//    protected static void f2(int x){ //без static работает так же из статичного вызвать f1 можно, но из класса нельзя
//        x+=2;
//        System.out.println(x);
//    }
//    public static int ii=0; //статичное поле
//    public static int f3 (int [] k){
//        k[0]+=4;
//        return k[0];
//    }
//}