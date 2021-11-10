import java.util.Random;
import java.util.Scanner;

public class UserArray {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please. enter number size of array: ");
        int size = inputNumber();

        System.out.println("Please. enter element: ");
        int element = inputNumber();

        System.out.println("----------Before add element----------");
        int[] array = doArray(size);

        System.out.println("----------After add element----------");
        int[] resultArray = doAddElement(array, element);

    }

    public static int[] doAddElement (int[] array, int element) {

        int[] resultArray = new int [array.length + 1];
        resultArray[0] = element;
        //System.out.println(resultArray.length);

        for (int i = 1; i < array.length + 1; i++) {
            resultArray[i] = array[i-1];
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
        }

        return resultArray;

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
