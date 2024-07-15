package Example_Of_SOLID_Principles;

import java.util.HashMap;
import java.util.Map;

public class SingleResponsibility {

    public static void main(String[] args) {

        HashMap<Integer, Worker> hashMapCompanyWorkers = new HashMap<>();

        // Adding two workers
        hashMapCompanyWorkers.put(170015,
                new Worker(170015, 5000, 20, "John Johnz", "Project Developer"));
        hashMapCompanyWorkers.put(170016,
                new Worker(170016, 5100, 20, "Rubi Ramos", "Project Manager"));

        //Initialize overtime hour payment for the two types of Job Titles
        SalaryCalculator.initOvertimeHourPayment();

        //Calculate Salary without extra hours
        HashMap<Integer, Integer> integerHashMapCompanyWorkersSalaries = SalaryCalculator.calculateWorkersSalary(hashMapCompanyWorkers);

        // Print to Console
        System.out.println("Salaries without extra hours:");
        System.out.println(hashMapCompanyWorkers.get(170015) + ",\n\tSalary: " + integerHashMapCompanyWorkersSalaries.get(170015) + " money unit");
        System.out.println(hashMapCompanyWorkers.get(170016) + ",\n\tSalary: " + integerHashMapCompanyWorkersSalaries.get(170016) + " money unit");

        // Adding Extra Hours
        hashMapCompanyWorkers.replace(170015,
                hashMapCompanyWorkers.get(170015).addExtraHour(10));
        hashMapCompanyWorkers.replace(170016,
                hashMapCompanyWorkers.get(170016).addExtraHour(5));

        // Calculate Salary without extra hours
        integerHashMapCompanyWorkersSalaries = SalaryCalculator.calculateWorkersSalary(hashMapCompanyWorkers);

        // Print to Console
        System.out.println("\n\nSalaries with extra hours:");
        System.out.println(hashMapCompanyWorkers.get(170015) + ",\n\tSalary: " + integerHashMapCompanyWorkersSalaries.get(170015) + " money unit");
        System.out.println(hashMapCompanyWorkers.get(170016) + ",\n\tSalary: " + integerHashMapCompanyWorkersSalaries.get(170016) + " money unit");

    }
}

// This class is just responsible of managing worker data
class Worker {

    private int baseSalary, workHours, extraHoursPerMonth, ID;
    private String fullName, jobTitle;

    public Worker(int _ID, int _baseSalary, int _workHours, String _fullName, String _jobTitle) {

        this.ID = _ID;
        this.baseSalary = _baseSalary;
        this.workHours = _workHours;
        this.fullName = _fullName;
        this.jobTitle = _jobTitle;

    }

    public Worker addExtraHour(int hoursPerDay) {

        this.extraHoursPerMonth += hoursPerDay;

        return this;

    }

    public void resetExtraHour() {
        this.extraHoursPerMonth = 0;
    }

    public int getBaseSalary() {
        return this.baseSalary;
    }

    public int getWorkHours() {
        return this.workHours;
    }

    public int getExtraHour() {
        return this.extraHoursPerMonth;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getJobTitle() {

        return this.jobTitle;
    }

    public String toString() {
        return this.fullName + " " + this.jobTitle;
    }
}

// This class is just responsible of calculate the salaries
final class SalaryCalculator {

    private static HashMap<String, Integer> extraHours = new HashMap<>();

    private SalaryCalculator() {
        ;
    }

    public static void initOvertimeHourPayment() {

        extraHours.put("Project Developer", 40);
        extraHours.put("Project Manager", 25);

    }

    public static HashMap<Integer, Integer> calculateWorkersSalary(HashMap<Integer, Worker> hashMapWorkers) {

        HashMap<Integer, Integer> hashMapCompanyWorkersSalaries = new HashMap<Integer, Integer>();

        for (Map.Entry<Integer, Worker> workerEntry: hashMapWorkers.entrySet()) {

            Integer id = workerEntry.getKey();
            Worker worker = workerEntry.getValue();
            int salary = worker.getBaseSalary() + worker.getExtraHour() * extraHours.get(worker.getJobTitle());

            hashMapCompanyWorkersSalaries.put(id, salary);
        }
        return hashMapCompanyWorkersSalaries;
    }

}


