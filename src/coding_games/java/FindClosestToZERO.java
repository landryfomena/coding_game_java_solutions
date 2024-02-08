package coding_games.java;

public class FindClosestToZERO {

    static int closestToZero(int[] ints) {
        int closest = ints[0];

        for (int num : ints) {
            // Check if the absolute value of the current number is closer to 0
            if (Math.abs(num) < Math.abs(closest) || (Math.abs(num) == Math.abs(closest) && num > 0)) {
                closest = num;
            }
        }

        return closest;
    }
}
