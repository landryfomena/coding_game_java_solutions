package coding_games;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDublicatesFromArray {
    public static Integer[] main() {
        Integer[] array = { 1, 2, 2, 3, 4, 4, 5 };

        // Convert the array to a stream, remove duplicates, and collect back to an array
        Integer[] uniqueArray = Arrays.stream(array)
                .distinct()
                .toArray(Integer[]::new);
        return uniqueArray;
    }

    public  static int[] filterDuplicates(int[] data){
        return   Arrays.stream(data)
                .distinct()
                .toArray();

    }
}
