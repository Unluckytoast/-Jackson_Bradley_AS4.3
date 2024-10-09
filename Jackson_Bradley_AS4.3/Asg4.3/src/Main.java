public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe");

        Job fullTimeJob = new FullTimeJob("ABC Corp", "Software Engineer", 0,  7302, 40.0, 45); // 2 decades
        Job partTimeJob = new PartTimeJob("XYZ Inc", "Data Analyst", 0, 732, 30.0, 20); // 2 years
        Job contractJob = new ContractJob("Freelance", "Consultant", 0, 60, 50.0, 1000); // 2 months

        employee.addJob(fullTimeJob);
        employee.addJob(partTimeJob);
        employee.addJob(contractJob);

        employee.displayJobHistory();
        System.out.println("Total Work Experience: " + employee.calculateTotalExperience() + " days");
    }
}
