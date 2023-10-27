//import java.util.Arrays;
//import java.util.Scanner;
//in.useLocale(Locale.US); //чтобы при вводе считывалась точка, а не запятая по умолчанию
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world \n"); //sout + enter \n-перевод \t-табуляция
//        Scanner in = new Scanner(System.in);  //название класса, имя объекта - создание переменной, считывание ее с консоли
//        int i= in.nextInt();
//        System.out.println(i+" value");
//        System.out.format("Sumsung %5d", i); //форматированный вывод
//        System.out.format("Sumsung %5d %.4f", i); //форматированный вывод float кол-во знаков после запятой
//        in.useLocale(Locale.US); //меняет десятичную запятую на точку
//
//        boolean bool = true; //false
//        String str = "string";
//        char ch='h';
//        char n = in.next ().charAt (0); //ввод типа char
//        byte bt= 127; //-128
//        short sh=32454;
//        float f=0.1243f; //4 байта
//        double d=0.67465; //8 байт
//        int i2 = 123; //4 байта
//        long l=14265784144L;
//        var xx=10; //как auto в с++
//        //Сtrl + ? - комментировать
//        //Сtrl + F - поиск
//        //Ctrl + R (К русская)-заменить
//
//        int a=5;
//        int b=7;
//        int c=a+b;
//        c=a-b;
//        c=a*b;
//        //c=a/(float) b; //либо числитель, либо знаменатель
//        c=a%b;
//        c=10;
//        int m=c++; //сначла присваивание, потом инкрименцияж
//        int mm=++c;
//        System.out.println(m +" " + mm); //10 12
//
//        int a=5; //101
//        int b=7; // 111
//        int c=a&b; //101
//        c=a|b; //111
//        c=~c; //побитовое отрицание 101 -> 10
//        c=a^b; //101 111 -> 010
//
//        System.out.println(c +" " + Integer.toBinaryString(~c));
//
//        c=a<<1; //101 << 1 -> 1010 5 -> 10*2 //сдвиг влево = *2 в стeпени i
//        double p=Math.pow(a,b);
//        a=-5;
//        c=a>>1; //101 >> 1 -> 10 5->2 //сдвиг вправо = /2
//        System.out.println(c); //-3, тк -2 округляется в -3
//
//        c= a>>>1; //0100000000001101 - смещает все биты и знаковый тоже (меняем знак)
//        System.out.println(c);

//        System.out.println(1<<a); //степень двойки
//
//        // && || !(true)
//        int k=in.nextInt();
//
//        int x=(a>10) ? /*true*/ 10 : /*false*/ -10;
//        System.out.println(a>b ? a>c ? a : c : b > c ? b : c); //максимум из трех

//        if (k>10 || k<0){
//            //true
//        }
//        else{
//            //flase
//        }
//
//        switch(a){
//            case 4:
//                System.out.println("Hallo");
//                break;
//            case 5:
//                System.out.println("World");
//                break;
//            default:
//                System.out.println("Default");
//                break;
//        }
//
//        int o=8;
//        while(true)
//        {
//            if (o<=8) {
//                return;
//            }
//        }
//
//        String str1="hghg";
//        String str2="gjgg";
//        int n=str2.length();
//        !srt.equals("srt"); //не отличается ли значение типа str от сравниваемой строки, вместо ==, тк == сравнивает ссылки
//        System.out.println(n);
//          String str = Integer.toString(a); //преобразование числа в строку
//        str.charAt(i) //обращение к символу строки

//        String s1="";               //реверс строки
//        s1= new StringBuilder(s).reverse().toString();
//        new StringBuilder(s).reverse().toString();

//        String str1="123";
//        String str2="123";
//        String str3=new String("123");
//
//        System.out.println(str1.equals(str3));
//
//        do
//        {
//            System.out.println("HH");
//            o++;
//        }while (0>8);
//
//        for (int i=0; i<8; i++){
//            //
//        }
//
//        int size=10;
//        int[] arr = new int[size];
//        arr[0]=1;
//        //arr.length; длина массивa
//        Arrays.sort(arr);
//        for (int h: arr){
//            System.out.println(h);
//        }
//        int[] arr2={1,2,3,4,5};
//
//
//        Arrays.fill(arr2, 101); //весь массив заполнился 101
//        for (int i:arr2)
//            System.out.println(i);
//
//        long time = System.currentTimeMillis();
//        Arrays.fill(arr,101);
//        long time2 = System.currentTimeMillis();
//        for (int j=0; j<arr.length; j++){
//            arr[j]=101;
//        }
//        long time3 = System.currentTimeMillis();
//        System.out.println(""+(time2-time)+" "+(time3-time2));
//
//        System.out.println(Arrays.toString(arr2)); //быстрый вывод массива
//
//        for (int i = 0; i < a.length; i++) { //вывод массива в одну строку
//               System.out.print(a[i] + " ");

//
//        //перевород переменной (двойной переворот)
//        int a=7;
//        int b=5;
//        a=a^b;//101 111 ->010
//        b=a^b;//010 111 -> 101
//        a=a^b; // 010 101 -> 111
//    }
//}