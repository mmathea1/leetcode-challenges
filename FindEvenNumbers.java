import java.util.Arrays;

public class FindEvenNumbers {
    public static void main(String[] args) {
        int arr[] = { 12, 345, 2, 6, 7896 };
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            int nm = Arrays.asList(String.valueOf(val).split("")).size();
            if (nm % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
