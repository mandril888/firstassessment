import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 3, 2, 5};
        int sum1 = 52;
        int[] sol1 = {11, 11, 10, 10, 10};
        int[] result1 = balancer(nums1, sum1);
        System.out.println("Result: " + Arrays.toString(result1));
        System.out.println("Expect: " + Arrays.toString(sol1));

        int[] nums2 = {4, 1, 3, 2, 5};
        int sum2 = 25;
        int[] sol2 = {5, 5, 5, 5, 5};
        int[] result2 = balancer(nums2, sum2);
        System.out.println("Result: " + Arrays.toString(result2));
        System.out.println("Expect: " + Arrays.toString(sol2));

        int[] nums3 = {4, 1, 3, 2, 5};
        int sum3 = 5;
        int[] sol3 = {4, 1, 3, 2, 5};
        int[] result3 = balancer(nums3, sum3);
        System.out.println("Result: " + Arrays.toString(result3));
        System.out.println("Expect: " + Arrays.toString(sol3));
    }

    public static int[] balancer(int[] numList, int sum) {
        int totalSumNumList = 0;
        int[] test = {1, 2, 3, 4, 5};

        for (int num : numList) {
            totalSumNumList += num;

            if (totalSumNumList >= sum) {
                return numList;
            }
        }

        Arrays.sort(numList);
        numList[0] += 1;

        balancer(numList, sum);

        return numList;
    }
}