package comparableuse;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private  int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Employee o) {
//        return this.name.compareTo(o.getName());
        if(this.id> o.getId()){
            return 1;
        }
        else if(this.id < o.getId()){
            return -1;
        }
        else
            return 0;
    }

    // Not required for TreeMap
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id && Objects.equals(name, employee.name);
//    }



//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }


}
