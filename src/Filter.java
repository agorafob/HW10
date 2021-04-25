import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Filter {
    public static void main(String[] args) {

        ArrayList<Object> test = new ArrayList<>();
        test.add(10);
        test.add(20);
        test.add(10);
        test.add(15);
        System.out.println(filter(test));
    }

    public static Set filter(ArrayList arr) {
        return (Set<Object>) new TreeSet(arr);
    }
}
