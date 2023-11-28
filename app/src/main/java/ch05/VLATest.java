package ch05;

public class VLATest {
    static int sumExceptFirst(int i, int... nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumExceptFirst(1, 2, 3, 4));
        int arr[] = { 2, 3 };
        System.out.println(sumExceptFirst(1, arr));
        System.out.println(sumExceptFirst(1, 2, 3, 4, 5));
    }
}
