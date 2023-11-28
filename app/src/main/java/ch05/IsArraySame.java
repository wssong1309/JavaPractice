package ch05;

public class IsArraySame {
    public static boolean isSame(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] - b[i] == 0) continue;
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {3, 2, 4, 1, 5};
        int[] b = {3, 2, 4, 1};
        int[] c = {3, 2, 4, 1, 5};
        int[] d = {2, 7, 1, 8, 2};
        System.out.println(isSame(a, b));
        System.out.println(isSame(a, c));
        System.out.println(isSame(a, d));
        System.out.println(isSame(b, c));
        System.out.println(isSame(b, d));
        System.out.println(isSame(c, d));
    }
}

/** 또는 equals 메서드를 사용할 수 있다.
if(equals(a,b)) {
            System.out.println("a와 b는 같다.");
        }
        if(equals(b,c)) {
            System.out.println("b와 c는 같다.");
        }
        if(equals(c,d)) {
            System.out.println("c와 d는 같다.");
        }
        if(equals(d,a)) {
            System.out.println("a와 d는 같다.");
        }
        if(equals(a,c)) {
            System.out.println("a와 c는 같다.");
        }
        if(equals(d,b)) {
            System.out.println("b와 d는 같다.");
        } */