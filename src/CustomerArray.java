import java.util.Random;
import java.util.Scanner;

public class CustomerArray {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please, enter value: ");
        int number = inputNumber();

        int[] array;
        array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = (doRandom(number));
            System.out.println(array[i]);
        }

        int maxNumber = -100;
        int maxIndex = 0;


        for (int i = 0; i < array.length; i++) {
            if(maxNumber <= array[i]){
                maxNumber = array[i];
                maxIndex = i;
            }
        }

        System.out.println("--------------------------");

        System.out.println(maxNumber);

        System.out.println("--------------------------");

        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }


        System.out.println("Min is " + minNumber);

        System.out.println("--------------------------");

        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i];
        }
        System.out.println(summa);

        System.out.println("--------------------------");

        double average = summa / array.length;
        System.out.println(average);

        System.out.println("--------------------------");

        for ( int i = 0; i < array.length; i++ )
        {
            if ( array[i] % 2 != 0 )
            {
                System.out.print( " " + array[i] );
            }
        }

    }



    public static int inputNumber () {

        int number;

        if(input.hasNextInt()){
            number = input.nextInt();
        } else {
            System.out.println("Wrong input, please, enter your number again! ");
            input.next();
            number = inputNumber();

        }
        return number;
    }

    public static int doRandom (int number) {

        Random random = new Random();
        int i = random.nextInt(100);
        return  i;

    }






}

