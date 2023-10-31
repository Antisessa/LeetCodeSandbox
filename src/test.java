import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        };
//
//        System.out.println("Original List: " + list);
//
//        List<Integer> listMap = list.stream().map(a -> a * 2).toList();
//
//        System.out.println("List after Map: " + listMap);
//
//        List<Integer> listFilter = list.stream().filter(a -> a % 4 == 0).toList();
//
//        System.out.println("List after Filter: " + listFilter);

        list = list.stream().filter(a -> a % 2 != 0).map(a -> a * 2).collect(Collectors.toList());
        System.out.println(list);

    }
}