package ch05;

public class StringMethodTest {
    public static int countChar(String s, char c) {
    int cnt = 0;
    // for(char character : s.toCharArray()) {
    //     cnt = character == c ? ++cnt : cnt;
    // }
    // 위의 방법도 있지만 charAt()메소드를 사용하라고 했으므로 아래 방법을 이용.
    for(int i = 0; i < s.length(); i++) {
        cnt = s.charAt(i) == c ? ++cnt : cnt;
    }
    return cnt;
}
    public static void main(String[] args) {
        System.out.println(countChar("character", 'c'));
    }
}
