package ch05;

public class FindingMine {
    public static char[][] BuildMap(int m, int n, int p) {
        char[][] Map = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Map[i][j] = Math.random() < 0.3 ? '*' : '-';
            }
        }
        return Map;
    }
    public static void PrintMap(char[][] map, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(map[i][j]);
            }
        }
    }
    public static void main(char[] args) {
        
    }
}