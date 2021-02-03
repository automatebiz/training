package com.training.concepts.collections;

import com.training.assignment.model.Employee;
import com.training.concepts.Vehicle;
import com.training.concepts.sorting.VehicleMakeComparator;
import com.training.concepts.sorting.VehicleModelComparator;

import java.util.*;

public class CollectionConcepts {

    public static void main(String[] args) {

        // List
        // ArrayList
        // LinkedList
        //listExample();

        // Set
        // HashSet
        // TreeSet
        // LinkedHashSet
        //setExamples();

        // Map
        int id = 1;
        Map<Integer, Employee> employeeMap = new HashMap<>();
        Employee john = new Employee("John", 12200, id++, 20);
        employeeMap.put(john.getUniqueIdentifier(), john);

        Employee jane = new Employee("Jane", 52200, id++, 30);
        employeeMap.put(jane.getUniqueIdentifier(), jane);

        Employee max = new Employee("Max", 22200, id++, 25);
        employeeMap.put(max.getUniqueIdentifier(), max);

        // Iterate through just keys
        employeeMap.keySet().forEach(System.out::println);

        // Iterate through just values
        final Collection<Employee> values = employeeMap.values();
        values.forEach(Employee::displayInformation);

        // Iterate through entries
        final Set<Map.Entry<Integer, Employee>> entries = employeeMap.entrySet();
        for (Map.Entry<Integer, Employee> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Fetch a value based on key
        System.out.println("Fetch an employee - Enter Id: ");
        Scanner scanner = new Scanner(System.in);
        final int employeeId = scanner.nextInt();
        final Employee employee = employeeMap.get(employeeId);
        if (null == employee)
            System.out.println("Employee not found!");
        else System.out.println(employee);
        // HashMap
        // TreeMap
        // LinkedHashMap
        // project -> many employees
        // project 1  -> 1->Rachel, 2->Phebe, 3->Joe
        // project 2 -> 4->john 5->jane 6-> Max 7->Mark 8-> Obama

        // key -> project value -> another map(key->john id, value -> john object)
        // project 1  ->
        //              1->Rachel,
        //              2->Phebe,
        //              3->Joe
        // project 2 ->
        //              4->john
        //              5->jane
        //              6-> Max
        //              7->Mark
        //              8-> Obama

    }

    private static void setExamples() {
        Set<Vehicle> vehicles = new TreeSet<>(new VehicleMakeComparator());
        vehicles.add(new Vehicle("Hyundai", 13000));
        vehicles.add(new Vehicle("Maruti", 1000));
        vehicles.add(new Vehicle("Honda", 21000));
        vehicles.add(new Vehicle("Toyota", 9000));
        vehicles.add(new Vehicle("Hyundai", 13000));

        vehicles.forEach(System.out::println);
    }

    private static List<Vehicle> listOfRandomVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("Hyundai", 13000));
        vehicles.add(new Vehicle("Maruti", 1000));
        vehicles.add(new Vehicle("Honda", 21000));
        vehicles.add(new Vehicle("Toyota", 9000));

        return vehicles;
    }

    private static void sortVehicles(List<Vehicle> vehicles, Comparator<Vehicle> comparator) {
        vehicles.sort(comparator);
    }

    public static void sortVehiclesByMake() {
        sortVehicles(listOfRandomVehicles(), new VehicleMakeComparator());
    }

    public static void sortVehiclesByModel() {
        sortVehicles(listOfRandomVehicles(), new VehicleModelComparator());
    }

    public static void sortVehiclesByRegNum() {
        sortVehicles(listOfRandomVehicles(), Comparator.comparing(Vehicle::getRegistrationNumber));
    }

    private static void listExample() {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Max");
        List<String> moreNames = new ArrayList<>();
        moreNames.add("Rachel");
        moreNames.add("Joe");
        moreNames.add("Monica");
        names.addAll(moreNames);

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }

        // Search on list
        int index = Collections.binarySearch(names, "Chandler");
        if (index > 0)
            System.out.println("Name exists");
        else
            System.out.println("Name not found!");

        final boolean rachelExists = names.contains("Rachel");
        if (rachelExists)
            System.out.println("Exists");


    }
}
