public class PartTimeJob extends Job {
    private double hourlyWage;
    private int hoursPerWeek;

    public PartTimeJob(String companyName, String position, int startDate, int endDate, double hourlyWage, int hoursPerWeek) {
        super(companyName, position, startDate, endDate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    // Calculate part-time salary
    public double calculateSalary() {
        return hourlyWage * hoursPerWeek * 4; // Monthly salary
    }

    // work flexibility
    public String assessWorkFlexibility() {
        return hoursPerWeek < 20 ? "Flexible" : "Moderate";
    }

    @Override
    public String assessJobSatisfaction() {
        return "Work flexibility is " + assessWorkFlexibility();
    }
}
