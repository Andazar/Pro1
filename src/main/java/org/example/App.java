package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

          /*      int a = 10;
                int b = 20;
                int c = 25;
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
/*
        int l ;

        System.out.println("a  = " +  a);//смотреть по F12
        System.out.println("b  = " +  b);//смотреть по F12

        l = a;
        a = b;
        b = l;

        System.out.println("a  = " +  a);//смотреть по F12
        System.out.println("b  = " +  b);//смотреть по F12


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
*/

       // int[] nums1 = new int[] { 0, 1, 2, 3, 4, 5 };
       // int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } };


      //  nums2[1][0]=44;
      // System.out.println(nums2[1][1]);

        //конструкция с while:

/*        int a = 1;

        while (a < 11) {
            System.out.println(a);
            a++; //увеличиваем а на единицу
        }

        //цикл с постусловием:

        int a = 1;
        do {
            System.out.println(a);
            a++; //увеличиваем а на единицу
        } while (a < 11);

        // с помощью for:

        for (а=1; a<11; i++) {
            System.out.println(a);
        }


        //Массив из Последовательности Фибонначи
        int a = 0;
        int b = 1;
        int i ;
        int fib[] = new int[25];
        for(i = 0; i < 25; i++){
            fib[i] = a;
            //System.out.println( (i+1) + "ый элемент массива " + fib[i]);
            int temp = b;
            b = a + b;
            a = temp;

        }
        //System.out.println("25ый элемент массива " + fib[24]);
         System.out.println(Arrays.toString(fib));


        //Массив обр порядке из Последовательности Фибонначи

        int fib2[] = new int[25];
        for(int j = 0; j < 25; j++){
            fib2[j] = fib[(fib.length-1)-j];
            //System.out.println( (j+1) + "ый элемент массива " + fib2[j]);


        }
        //System.out.println("25ый элемент массива " + fib[24]);
        System.out.println(Arrays.toString(fib2));



        int q =0;
        int fib3[] = new int[25];
        while (q < 25) {
         fib3[q] = fib[(fib.length-1)-q];
          //System.out.println( (q+1) + "ый элемент массива " + fib3[q]);
            q++; //увеличиваем а на единицу
        }

        System.out.println(Arrays.toString(fib3));
*/
// Вывести  таблицу умножения от 10 до 20.
/*
        int a = 10;
        int b = 10;
        int tab[] = new int[11];
        int head[] = new int[11];

        int j = 0;

        String t;
        String head2 = "  ";
for( a = 10; a <= 20; a++)
        {
            head[j] =  a;
            t = "   " + head[j];
            head2 =  head2 + t;
            j++;
        }
        System.out.println( head2);
//System.out.println("    " +Arrays.toString(head));


for( a = 10; a < 21; a++)
{
    int i = 0;
  for(b = 10; b < 21; b++)
      {
         tab[i] = a*b;
        //console.log(String(a),"*",String(b),"=", a*b);
        i++;
      }
    System.out.println(a + "  " + Arrays.toString(tab));
}



        //Счастливые билеты
        int b=0;
        //С помощью простого цикла и деления по модулю получим значения всех совпадений. Увеличиваем "счетчик" каждый раз, когда сумма первых 3 чисел равна сумме второй тройки. Так как минимальное такое число может быть только после 1000, начинаем цикл с нее
        for(int i=0;i<1000000;i++){
            int i1=i/100000%10,
                i2=i/10000%10,
                i3=i/1000%10,
                i4=i/100%10,
                i5=i/10%10,
                i6=i%10;
            if((i1+i2+i3)==(i4+i5+i6)){
                b++;
            }
        }

        System.out.println("Рулон билетов с номерами от 000001 до 999999 имеет " + b + " счастливых билетов.");

   //поиск простого числа
       int num = 4;
       String numStr = " ";
        for(int i = 2; i < num; i++)
        {
            if(num % i == 0) {numStr = "Не простое"; break;}
            else {numStr= "Простое"; }
        }

        System.out.println(numStr);


        int a = 50;
        int b = 70;
        int f = 0;
        //int t = 0;
        String numStr = " ";
        String numStr2 = "Простые числа: ";
    for (int j = a; j < b+1; j++)
    {
        for (int i = 2; i < j; i++)
        {
            if (j % i == 0) {
                numStr = j + ": Не простое число";
                f = 0;
                break;
            } else {
                numStr = j + ": Простое число";
                f = 1;
            }
        }
        System.out.println(numStr);
       // Список всех простых
        if (f == 1) {
            numStr2 = numStr2 + j+ ", ";
        } else {  numStr2 = numStr2 ;   }

    }

        System.out.println(numStr2);

*/


//поиск простого числа
/*const num = 125;
        let numStr, de = 2;
        for(let i = 2; i < num; i++)
        {
            if(num % i === 0) {numStr = "Не простое";}
            else {numStr= "Простое"; de++}
        }

        let out = numStr;

        console.log(numStr, "Делитель")


        //День в правильном падеже
        int day = 1;
        String dayString = " день";

        switch (day) {
            case 1:
                dayString = dayString;
                break;
            case 2:
            case 3:
            case 4:
                dayString = " дня";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                dayString = " дней";
                break;
            default: dayString = " - Неизвестный день";
               break;
        }
        System.out.println(day + dayString);

*/

        //Массив из целых чисел
      int a = 1;
      int b = 25;
      int sum = 0;
      int sum2 = 0;
      int mass[] = new int[25];
      int mass2[] = {100, 11, -25, -1, 0, 22, 86, -3, -31};
      int avg;
      int avg2;
      int max = mass[0];
      int max2 = mass2[0];
      int min = mass[0];
      int min2= mass2[0];
      int even = 0;
      int even2= 0;
       // int maxIndex = 0;
       // int maxIndex2 = 0;


        for(int i = 0; i < b; i++)
        {
            mass[i] = a;
            //System.out.println( (i+1) + "ый элемент массива " + fib[i]);
            a++;
        }

        for (int j = 0; j < mass.length; j++) {
            sum += mass[j];
        }
        avg = sum / mass.length;


        for (int j = 0; j < mass2.length; j++) {
            sum2 += mass2[j];
        }
        avg2 = sum2 / mass2.length;


        for (int i : mass) {
             if( i > max) {   max = i; }
             if( i < min) {   min = i; }

            if( i % 2 == 0) {   even += 1; }
        }


        for (int i : mass2) {
            if( i > max2) {  max2 = i; }
            if( i < min2) {  min2 = i; }

            if( i % 2 == 0) {  even2 += 1; }
        }




        //System.out.println("25ый элемент массива " + fib[24]);
        System.out.println("Первый массив " + Arrays.toString(mass));
        System.out.println("Среднее = " + avg);
        //System.out.println(NumberUtils.max(age));
        System.out.println(max);
        System.out.println(min);
        System.out.println(even);
        //System.out.println("Индекс максимального элемента: " + maxInd);


        System.out.println("--------------------" );
        System.out.println("Второй массив " + Arrays.toString(mass2));
        System.out.println("Среднее = " + avg2);
        System.out.println(max2);
        System.out.println(min2);
        System.out.println(even2);

    }
        }


