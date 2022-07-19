import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortedSquares {
    public static List<Integer> squareValues(List<Integer> values) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            int value = values.get(i);
            int squared = value * value;
            result.add(squared);
        }
        return result;
    }

    public static List<Integer> sortSquares(List<Integer> values) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            if (i < values.size() - 1) {
                int currentValue = values.get(i);
                int nextValue = values.get(i + 1);
                if (currentValue < nextValue) {
                    result.add(currentValue);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-4, -1, 0, 3, 10);
        List<Integer> values = squareValues(arr);
        System.out.println(values);
        List<Integer> squares = sortSquares(values);
        System.out.println(squares);

    }
}
