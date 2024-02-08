package coding_games.java;

public class SumRange {
    static  int sumRage(int[] ints){
        int sum=0;
        for(int i =0; i< ints.length; i++){
            int n = ints[i];
            if (n>=10 && n<=100) sum+=n;
        }
        return sum;
    }
}
