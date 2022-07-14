
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int counter = 0;
        int maxcounted = 0;
        int nums[] = { 1 };
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
                if (counter > maxcounted) {
                    maxcounted = counter;
                }
            } else {
                counter = 0;
            }

        }
        System.out.println(maxcounted);
    }
}
