package ua.mainacadamy.Service;

public class MathTwo {

    public static void main(String[] args) {

        int num = 12345;
        int sum = 0;
        int ost; // остача


        ost = num % 10;
        sum = num + ost; //5

        num = num / 10; //1234

        ost = num % 10;
        sum = num + ost; //9

        num = num / 10; //123

        ost = num % 10;
        sum = num + ost; //12

        num = num / 10; //12

        ost = num % 10;
        sum = num + ost; //14

        num = num /10;//1

        sum = sum + num;

        System.out.println("sum is "+sum);
    }
}


