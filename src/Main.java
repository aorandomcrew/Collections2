import java.util.*;

public class Main {
    public static void main(String[] args) {
//задание 1
        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println();
//задание 2
        System.out.println("Задание 2");
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums2);
        for (Integer integer : nums2) {
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
        System.out.println();
//задание 3
        System.out.println("Задание 3");
        List<String> words = new ArrayList<>(List.of("wasd", "wasd", "qwe", "zxc"));
        Set<String> set = new HashSet<>(words);
        words.clear();
        words.addAll(set);
        System.out.print(words);
        System.out.println();
        System.out.println();
//задание 4
        System.out.println("Задание 4");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> counts = new HashMap<>();
        for (String str : strings) {
            counts.put(str, counts.getOrDefault(str, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " дублей");
        }
    }
}