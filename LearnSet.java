
import java.util.Set;
import java.util.TreeSet;


public class LearnSet{
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>();
        //order of elements is not defined(random)

        // Set<Integer> set = new LinkedHashSet<>();
        //HashSet which follows properties of a linked list

        Set<Integer> set = new TreeSet<>();
        //follows properties of the set and is sorted as it is tree

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        set.add(65);//only unique elements allowed

        System.out.println(set);

        set.remove(54);
        System.out.println(set);

        System.out.println(set.contains(21));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);
    }
}