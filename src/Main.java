import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        Collections.sort(nums);
        int number = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num % 2 == 0 & num != number) {
                System.out.println("num = " + num);
                number = num;
            }
        }
    }

    public static void task3() {
        Set<String> filteredWords = new HashSet<>(words);
        System.out.println(filteredWords);
    }

    public static void task4() {
        Map<String, Integer> filteredWords = new HashMap<String, Integer>();

        for (String word : words) {
            Integer count = filteredWords.get(word);
            if (count == null) {
                count = 0;
            }
            filteredWords.put(word, count + 1);
        }
        for (Integer value : filteredWords.values()) {
            System.out.println(value);
        }
    }
}