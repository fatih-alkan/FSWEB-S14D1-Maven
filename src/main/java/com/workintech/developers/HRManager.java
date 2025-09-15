package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, int salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[10];
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }
    public HRManager(long id, String name, int salary, int juniorSize, int midSize, int seniorSize) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[juniorSize];
        this.midDevelopers = new MidDeveloper[midSize];
        this.seniorDevelopers = new SeniorDeveloper[seniorSize];
    }

    @Override
    public void work() {
        setSalary(getSalary() + 5000);
        System.out.println("HR Manager is managing employees. New salary: " + getSalary());
    }

    public void addEmployee(JuniorDeveloper developer) {
        addToArray(juniorDevelopers, developer);
    }

    public void addEmployee(MidDeveloper developer) {
        addToArray(midDevelopers, developer);
    }

    public void addEmployee(SeniorDeveloper developer) {
        addToArray(seniorDevelopers, developer);
    }

    private <T> void addToArray(T[] array, T employee) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = employee;
                System.out.println(employee.getClass().getSimpleName() + " added at index " + i);
                return;
            }
        }
        System.out.println("No empty slot available for " + employee.getClass().getSimpleName());
    }
}
