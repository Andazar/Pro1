package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

               int a = 10;
                int b = 20;
         /*        int c = 25;
                int d = 25;
                System.out.println("a + b = " + (a + b));
                System.out.println("a - b = " + (a - b));
                System.out.println("a * b = " + (a * b));
                System.out.println("b / a = " + (b / a));
                System.out.println("b % a = " + (b % a));
                System.out.println("c % a = " + (c % a));
                System.out.println("a++   = " +  (a++));
                System.out.println("b--   = " +  (a--));
                // Проверьте разницу в d++ и ++d
                System.out.println("d++   = " +  (d++));
                System.out.println("++d   = " +  (++d));
*/

        int l ;

        System.out.println("a  = " +  a);//смотреть по F12
        System.out.println("b  = " +  b);//смотреть по F12

        l = a;
        a = b;
        b = l;

        System.out.println("a  = " +  a);//смотреть по F12
        System.out.println("b  = " +  b);//смотреть по F12

/*
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );


        int a = 60;	// 60 = 0011 1100
        int b = 13;	/* 13 = 0000 1101
        int c = 0;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

        c = a & b;       /* 12 = 0000 1100
        System.out.println("a & b = " + c );
        System.out.println("a & b = " + Integer.toBinaryString(c));

        c = a | b;       /* 61 = 0011 1101
        System.out.println("a | b = " + c );

        c = a ^ b;       /* 49 = 0011 0001
        System.out.println("a ^ b = " + c );

        c = ~a;          /*-61 = 1100 0011
        System.out.println("~a = " + c );
        System.out.println("~a = " + Integer.toBinaryString(c));

        c = a << 2;     /* 240 = 1111 0000
        System.out.println("a << 2 = " + c );

        c = a >> 2;     // 215 = 1111
        System.out.println("a >> 2  = " + c );

        c = a >>> 2;     //215 = 0000 1111
        System.out.println("a >>> 2 = " + c );


        boolean x = true;
        boolean y = false;

        System.out.println("a && b = " + (x&&y));

        System.out.println("a || b = " + (x||y) );

        System.out.println("!(a && b) = " + !(x && y));


        int c =0;
        c = a + b;
        System.out.println("c = a + b = " + c );

        c += a ;
        System.out.println("c += a  = " + c );

        c -= a ;
        System.out.println("c -= a = " + c );

        c *= a ;
        System.out.println("c *= a = " + c );

        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c );

        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a  = " + c );

        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );

        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );

        c >>= 2 ;
        System.out.println("c >>= a = " + c );

        c &= a ;
        System.out.println("c &= 2  = " + c );

        c ^= a ;
        System.out.println("c ^= a   = " + c );

        c |= a ;
        System.out.println("c |= a   = " + c );



        int x , y;
        x = 10;
        y = (x == 1) ? 20 : 30;
        System.out.println( "Значение y: " +  y );

        y = (x == 10) ? 20 : 30;
        System.out.println( "Значение y: " + y );

        String a = "Hello", b = "World";
        System.out.println(a + " " + b); // Здесь + означает объединение (конкатенацию) строк
        // Пробел не вставляется автоматически

        // Строки конкатенируются слева направо, надо помнить это когда соединяешь строку и примитив
        String c = 2 + 2 + ""; // "4"
        String d = "" + 2 + 2; // "22"
        d = "" + (2 + 2); // а теперь d тоже "4"

        String foo = "a string";
        String bar = "a string"; // bar будет указывать на тот же объект что и foo
        String baz = new String("a string"); // Чтобы гарантированно создать новую строку надо вызвать конструктор
        System.out.println("foo == bar ? " + (foo == bar)); // == сравнивает ссылки на объекты
        System.out.println("foo равен bar ? " + (foo.equals(bar))); // Метод equals служит для проверки двух объектов на равенство
        System.out.println("foo == baz ? " + (foo == baz));
        System.out.println("foo равен baz ? " + (foo.equals(baz)));
*/

        int nums[] = new int[4]; // массив из 4 чисел
        //int[] nums2 = new int[5]; // массив из 5 чисел

// устанавливаем значения элементов массива
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 100;

// получаем значение третьего элемента массива
        System.out.println("Третий элемент массива " + nums[2]);    // 4

        // System.out.println(nums[]);

        int length = nums.length;   // 5

        int last = nums[nums.length-1]; //последний элемент массива

        System.out.println("Длина массива " + length);
        System.out.println("Последний элемент массива " + last);


       // int[] nums1 = new int[] { 0, 1, 2, 3, 4, 5 };
       // int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } };


       // nums2[1][0]=44;
       // System.out.println(nums2[1][1]);


    }
        }


