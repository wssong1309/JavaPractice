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
             * for each���� iteration ����� ������ �� ����. (Immutable)
             * reference variable�� �ܼ��� �����.
             */
            System.out.println("�̸�: " + rv.getKey() + "\tSkill: " + rv.getValue());
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
            System.out.println("�̸�: " + key + "\tSkill: " + classB.get(key));
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [3] SmartA�� SmartB ����
        System.out.println("[3] SmartA�� SmartB ����");
        Map<String, String> student = new HashMap<>();
        student.putAll(classA);
        student.putAll(classB);
        for (Map.Entry<String, String> stu : student.entrySet()) {
            System.out.println("�̸�: " + stu.getKey() + "\tSkill: " + stu.getValue());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [4] Android ������ �л��� Mobile Class�� ������ SmartA+SmartB �����ϴ� �л� ���
        System.out.println("[4] Android ������ �л��� Mobile Class�� ����");
        Set<String> skill = Collections.singleton("Android"); // skill�� Android�� �л� ���� (Immutable Set�� return��)
        student.values().removeAll(skill); // skill�� Android�� �л� ��Ͽ��� ���� (��� value�� ������ key, value���� �����Ѱ���..?)
        System.out.println(student.keySet());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [5] Python, Database������ �����ϴ� �л��� Ȯ�� (S3, B2)
        System.out.println("[5] Python�� �����ϴ� �л��� Ȯ��");
        Map<String, String> py = new HashMap<>();
        py.put("S3", "Python");
        py.put("B3", "DataBase");
        System.out.println(student.entrySet().containsAll(py.entrySet())); // Set.containsAll(Collection<?> c)
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [6] SmartA�� SmartB ���� �л��� ������ Ȯ��
        System.out.println("[6] SmartA�� SmartB���� �л��� ���� �� Ȯ��");
        System.out.println(classA.keySet().equals(classB.keySet()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [7] Java, JavaScript Skill�� ������ �л� Ȯ�� ����
        System.out.println("[7] Java, JavaScript Skill�� ������ �л� Ȯ��");
        System.out.println(student.containsValue("Java"));
        System.out.println(student.containsValue("JavaScript"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

/*
 * [1] java.util.Map
 * key�� ���� value�� ��� �ڷ����̴�.
 * Ư¡���δ� �ߺ��� Ű�� ������ �� ������ ���� ������ �������� �ʴ´ٴ� ���� �ִ�.
 * 
 * - Map.get(Object key) : object key�� �ش��ϴ� value�� return�Ѵ�.
 * - Map.put(K key, V value) : K, V�� generics�̰�, Map object�� key, value���� �߰��Ѵ�.
 * - Map.putAll(Map<? extends K,?? extends V> m) : �ٸ� Map object�� �ش� Map��ü�� �߰��Ѵ�.
 * 
 * [2] Map.entrySet()
 * Map.entrySet() method�� Map�� ������ Set������ Map.Entry��ü�� ����� �ش�.
 * ������� Map.Entry��ü�� getKey(), getValue() method�� ��ҿ� ������ �� �ִ�.
 * setValue(V value) method�� �ش��ϴ� entry��ü�� value�� V������ �ٲ��ش�.
 * 
 * [3] Map.keySet()
 * Map.keySet() method�� Map�� key���� Set������ ��ü�� ������ش�.
 * 
 * [4] Collections.singleton
 * immutable Set object�� return�Ѵ�.
 */