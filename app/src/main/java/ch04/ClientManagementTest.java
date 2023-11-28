package ch04;

class Member {
    private String name;
    private String id;
    private String password;
    private int age;
    
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Member(String name, String id, String password, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }
}

public class ClientManagementTest {
    public static void main(String[] args) {
        Member m1 = new Member("송우석", "wssong1309", "blabla*", 22);
        System.out.printf("m1님의 정보: 이름: %s, ID: %s, Password: %s, 나이: %d.", m1.getName(), m1.getId(), m1.getPassword(), m1.getAge());
    }
}
