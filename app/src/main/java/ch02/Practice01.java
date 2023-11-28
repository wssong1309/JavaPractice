package ch02;

public class Practice01 {
    public static void main(String[] args) {
        int i, j, k;
        for(i=1; i<=7; i++){
            for(j=1; j<=7-i; j++){
                System.out.print(" ");
            }
            for(k=0; k<2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
