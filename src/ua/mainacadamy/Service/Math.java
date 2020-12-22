package ua.mainacadamy.Service;

public class Math {

    public static void main(String[] args) {

        int number = 123456;
        int summ = 0;
        String str = Integer.toString(number);
        System.out.println(str);

        char[] array = str.toCharArray();
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;

        int length = array.length;


        for (char element : array) {
            summ = summ + element;
            System.out.println("The sum of numbers = " + summ);

        }

    }

}
