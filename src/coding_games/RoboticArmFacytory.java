package coding_games;

public class RoboticArmFacytory {
    public static void main(String[] args) {

    }

    public static String solve(int width, int height, int length, int mass) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        var volume = (width * height * length);
        System.err.println("volume " + volume);
        var bulky = (volume >= 1000000) || (width >= 150) || (height >= 150) || (length >= 150);

        var heavy = mass >= 20;

        if (heavy && bulky) {
            return "REJECTED";
        } else {
            if (!bulky && !heavy) {
                return "STANDARD";
            } else {
                if (heavy || bulky) {
                    return "SPECIAL";
                }

            }
        }


        return "";

    }


}
