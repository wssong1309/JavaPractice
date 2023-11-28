package ch05;

public class ReverseArray {
    static int[] reverse(int[] org) {
        int front = 0, rear = org.length-1, tmp;
        for (int i = 0; i < org.length; i++) {
            tmp = org[front];
            org[front++] = org[rear];
            org[rear--] = tmp;
            if (front >= rear) break;
        }
        return org;
    }
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reversedArray = reverse(num);
        for (int i = 0; i < 10; i++) {
            System.out.println(reversedArray[i] + " ");
        }
    }
}