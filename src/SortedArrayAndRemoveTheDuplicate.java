import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortedArrayAndRemoveTheDuplicate {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        int array[] = {1, 2, 2, 3, 4, 4, 5, 7, 8, 8};
        List<Integer> ll = new ArrayList();
        for (int i : array) {
            ll.add(i);
        }
        System.out.println(getLength(ll));

    }

    private static int getLength(List<Integer> l) {


        List<Integer> collect = l.stream().distinct().collect(Collectors.toList());

        return collect.size();
    }
}
