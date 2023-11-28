package ClassExample.java_11.maptest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapLoopTest {
    public static void main(String[] args) {
        System.out.println("[1] SmartA");
        System.out.println("[1] Map.Entry<K,V> entrySet()");
        Map<String, String> classA = new HashMap<>();
        classA.put("S1", "Java");
        classA.put("S2", "Spring");
        classA.put("S3", "Python");
        classA.put("S4", "Java");
        classA.put("S5", "Java");
        classA.put("S6", "Database");
        
        // [1] Map.Entry<K,V> entrySet()
        for (Map.Entry<String, String> rv : classA.entrySet()) {
            /*
             * for each문은 iteration 결과를 조작할 수 없다. (Immutable)
             * reference variable은 단수로 만든다.
             */
            System.out.println("이름: " + rv.getKey() + "\tSkill: " + rv.getValue());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.println("[2] SmartB");
        System.out.println("[2] Iterator<String> Pattern");
        Map<String, String> classB = new HashMap<>();
        classB.put("B1", "Java");
        classB.put("B2", "Python");
        classB.put("B3", "Java");
        classB.put("B4", "Android");
        classB.put("B5", "IOS");
        classB.put("B6", "Android");
        
        // [2] Iterator<String> Pattern
        for (Iterator<String> it = classB.keySet().iterator(); it.hasNext();) {
            String key = it.next();
            System.out.println("이름: " + key + "\tSkill: " + classB.get(key));
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [3] SmartA와 SmartB 통합
        System.out.println("[3] SmartA와 SmartB 통합");
        Map<String, String> student = new HashMap<>();
        student.putAll(classA);
        student.putAll(classB);
        for (Map.Entry<String, String> stu : student.entrySet()) {
            System.out.println("이름: " + stu.getKey() + "\tSkill: " + stu.getValue());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [4] Android 수강한 학생은 Mobile Class로 보내고 SmartA+SmartB 수강하는 학생 목록
        System.out.println("[4] Android 수강한 학생은 Mobile Class로 보냄");
        Set<String> skill = Collections.singleton("Android"); // skill이 Android인 학생 저장 (Immutable Set이 return됨)
        student.values().removeAll(skill); // skill이 Android인 학생 목록에서 제거 (어떻게 value를 가지고 key, value쌍을 제거한거지..?)
        System.out.println(student.keySet());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [5] Python, Database과목을 수강하는 학생을 확인 (S3, B2)
        System.out.println("[5] Python을 수강하는 학생을 확인");
        Map<String, String> py = new HashMap<>();
        py.put("S3", "Python");
        py.put("B3", "DataBase");
        System.out.println(student.entrySet().containsAll(py.entrySet())); // Set.containsAll(Collection<?> c)
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [6] SmartA와 SmartB 반이 학생이 같은지 확인
        System.out.println("[6] SmartA와 SmartB반의 학생이 같은 지 확인");
        System.out.println(classA.keySet().equals(classB.keySet()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [7] Java, JavaScript Skill을 보유한 학생 확인 여부
        System.out.println("[7] Java, JavaScript Skill을 보유한 학생 확인");
        System.out.println(student.containsValue("Java"));
        System.out.println(student.containsValue("JavaScript"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

/*
 * [1] java.util.Map
 * key를 통해 value를 얻는 자료형이다.
 * 특징으로는 중복된 키를 포함할 수 없으며 저장 순서를 유지하지 않는다는 것이 있다.
 * 
 * - Map.get(Object key) : object key에 해당하는 value를 return한다.
 * - Map.put(K key, V value) : K, V는 generics이고, Map object에 key, value쌍을 추가한다.
 * - Map.putAll(Map<? extends K,?? extends V> m) : 다른 Map object를 해당 Map객체에 추가한다.
 * 
 * [2] Map.entrySet()
 * Map.entrySet() method는 Map의 매핑을 Set형태의 Map.Entry객체로 만들어 준다.
 * 만들어진 Map.Entry객체는 getKey(), getValue() method로 요소에 접근할 수 있다.
 * setValue(V value) method는 해당하는 entry객체의 value를 V값으로 바꿔준다.
 * 
 * [3] Map.keySet()
 * Map.keySet() method는 Map의 key값을 Set형태의 객체로 만들어준다.
 * 
 * [4] Collections.singleton
 * immutable Set object를 return한다.
 */