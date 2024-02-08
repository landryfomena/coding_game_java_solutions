package coding_games.java;

public class FindLargestNumber {

    /** @return the largest number of the given array */
    static int findLargest(int[] numbers) {
        // Your code goes here
        var largest= numbers[0];

        for(int number: numbers){
            if(number>largest){ 
                largest= number;
            }
        }

        return largest;
    }
}
