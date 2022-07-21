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
        for (int i = 0; i < values.size(); i++) {
            for (int j = 0; j < values.size(); j++) {
                int currentValue = values.get(i);
                int nextValue = values.get(j);
                if (currentValue < nextValue) {
                    int temp = currentValue;
                    values.set(i, nextValue);
                    values.set(j, temp);
                }
            }
        }
        return values;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-7, -3, 2, 3, 11);
        List<Integer> squares = squareValues(arr);
        System.out.println("squared: " + squares);
        List<Integer> sortedSquares = sortSquares(squares);
        System.out.println("sorted: " + sortedSquares);

    }
}
