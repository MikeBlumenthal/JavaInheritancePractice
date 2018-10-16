package staff;

public abstract class Employee {
    String name;
    String niNumber;
    double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getNiNumber(){
        return niNumber;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double increment){
        if (increment > 0){
            salary += increment;
        }
    }

    public double payBonus(){
        return salary * 0.01;
    }

    public void changeName(String newName){
        if (newName != null){
            name = newName;
        }
    }
}
