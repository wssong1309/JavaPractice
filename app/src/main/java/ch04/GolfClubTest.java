package ch04;

class GolfClub {
    private int iclub = 0;
    private String sclub = "NULL";
    
    public int getIclub() {
        return iclub;
    }
    public void setIclub(int iclub) {
        this.iclub = iclub;
    }
    public String getSclub() {
        return sclub;
    }
    public void setSclub(String sclub) {
        this.sclub = sclub;
    }
    public GolfClub() {
    }
    public GolfClub(int iclub) {
        this.iclub = iclub;
    }
    public GolfClub(String sclub) {
        this.sclub = sclub;
    }

    public void print() {
        if (iclub == 0 && sclub.compareTo("NULL") == 0) {
            System.out.println("7번 아이언입니다.");
        } else if (iclub != 0) {
            System.out.println(iclub + "번 아이언입니다.");
        } else if (sclub.compareTo("NULL") != 1) {
            System.out.println(sclub + "입니다.");
        }
    }
}

public class GolfClubTest {
    public static void main(String[] args) {
        GolfClub g1 = new GolfClub();
        g1.print();

        GolfClub g2 = new GolfClub(8);
        g2.print();

        GolfClub g3 = new GolfClub("퍼터");
        g3.print();
    }
}
