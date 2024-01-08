import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(1));
        hashSet.add(Integer.valueOf(1));
        hashSet.add(Integer.valueOf(2));
        System.out.println("Hello world!"+ hashSet.size());
        // what is the result of 2>>1
        var value = 2>>1;
        System.out.println("the value of 2>>1 is "+ value);
        // what is the value of i3
        int i1=5;
        int i2=2;
        int i3=i1/i2;
        System.out.println("the value of i3 is "+ i3);

    }
}