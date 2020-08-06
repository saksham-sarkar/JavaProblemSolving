package Top100;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeMain {
    static Map<String,Employee> treeMap = new TreeMap<>();
    public static void main(String args[]){
        Address address = new Address(111,"S1","S2","S3","S4");
        Employee emp = new Employee();
        emp.setAddress(address);
        emp.setId(1);
        emp.setName("Saksham");
        emp.setAge(28);
        addToCollection(emp);
         address = new Address(112,"SS1","SS2","SS3","SS4");
         emp = new Employee();
        emp.setAddress(address);
        emp.setId(2);
        emp.setName("Amit");
        emp.setAge(28);
        addToCollection(emp);
         address = new Address(113,"SSS1","SSS2","SSS3","SSS4");
         emp = new Employee();
        emp.setAddress(address);
        emp.setId(3);
        emp.setName("Rohit");
        emp.setAge(28);
        addToCollection(emp);
        address = new Address(114,"SSS1","SSS2","SSS3","SSS4");
        emp = new Employee();
        emp.setAddress(address);
        emp.setId(4);
        emp.setName("Sreya");
        emp.setAge(28);
        addToCollection(emp);
        display();



    }

    static void addToCollection(Employee emp){
        if(treeMap.containsKey(emp.getName())){
            treeMap.put(emp.getName(),emp);
        }
        else {
            treeMap.put(emp.getName(), emp);
        }
    }

    static void display(){
     System.out.println(treeMap);
    }
}
