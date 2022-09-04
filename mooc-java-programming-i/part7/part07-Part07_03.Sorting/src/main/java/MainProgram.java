
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int min = array[0];
        for (int integer : array) {
            if (min > integer) {
                min = integer;
            }
        }
        return min;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int index = startIndex;
        int min = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (min > table[i]) {
                min = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = indexOfSmallestFrom(array,i);
            swap(array,i,minIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}
