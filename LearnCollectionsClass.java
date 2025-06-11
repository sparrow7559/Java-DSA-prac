
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(24);
        list.add(45);
        list.add(7);
        list.add(56);
        list.add(78);
        list.add(96);

        // System.out.println("min element "+Collections.min(list));
        // System.out.println("max element "+Collections.max(list));
        // System.out.println(Collections.frequency(list, 7));

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
    }
}