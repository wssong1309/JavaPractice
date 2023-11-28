package ClassExample.java_104;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private Set<String> subjects;

    public Student(String name) {
        this.name = name;
        subjects = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }

}

/*
 * - java.util.Set
 * 중복된 element를 갖지 않으며 순서가 상관없는 collection이다.
 * Set Interface의 구현체는 HashSet<>()을 많이 사용한다.
 * HashSet<>()괄호 안에 Collection을 넣어서 Set object를 생성할 수도 있다.
 * 
 * Set.retainAll(Collection<?> c) : Set의 원소 중 매개변수로 받은 Collection에 포함되는 원소만 남기고 나머지는 제거한다.
 * Set.removeAll(Collection<?> c) : Set의 원소 중 매개변수로 받은 Collection에 포함되는 원소를 모두 제거한다.
 */