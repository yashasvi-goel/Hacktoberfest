import java.util.Arrays;
import java.util.List;

public final class SortUtils {

    /**
     * Helper method for swapping places in array
     * @param array
     * @param idx
     * @param idy
     * @return
     */
    static boolean swap(int[] array, int idx, int idy){
        int swap = array[idx];
        array[idx] = array[idy];
        array[idy] = swap;
        return true;
    }


    /**
     * Prints an array
     * @param toPrint - the array  which should be printed
     */
    static void print(int[] toPrint){
        System.out.println(Arrays.toString(toPrint));
    }
}