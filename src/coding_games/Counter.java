package coding_games;

public class Counter {
    private static  int count = 0;
    public  static int increment(){
        count = count+1;
        return count;
    }

    public static synchronized int incrementConcurential() {
        count = count + 1;
        return count;
    }

}
