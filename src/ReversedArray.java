import java.util.Random;
import java.util.Scanner;

public class ReversedArray {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please. enter number size of array: ");
        int size = inputNumber();

        System.out.println("----------Before reverse----------");
        int[] array = doArray(size);

        System.out.println("----------After reverse----------");
        int[] resultArray = doReverse(array);

        System.out.println("----------Sub Array----------");
        System.out.println("Please. enter index: ");
        int index = inputNumber();
        System.out.println("Please, enter size of new array: ");
        int count = inputNumber();
        int[] subArray = subArray(array, index, count );



    }

    public static int []  subArray(int [] array, int index, int count) {

        int [] resultArray;
        //int counter = index + count;
        resultArray = new int[count];
        int available_elements = array.length - index;

        for (int i=0; i<resultArray.length; i++) {
            if (i <= available_elements - 1) {
                resultArray[i] = array[i+index];
            } else {
                resultArray[i] = 1;
            }

            System.out.println(resultArray[i]);
        }

        return resultArray;

    }


    public static int[] doReverse(int [] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);

        }
        return array;

    }



    public static int[] doArray (int size) {
        int[] array;
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (doRandom(size));
            System.out.println(array[i]);
        }

        return array;

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
