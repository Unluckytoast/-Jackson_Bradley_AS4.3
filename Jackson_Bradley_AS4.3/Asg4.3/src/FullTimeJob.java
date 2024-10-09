public class FullTimeJob extends Job {
    private double hourlyWage;
    private int hoursPerWeek;

    public FullTimeJob(String companyName, String position, int startDate, int endDate, double hourlyWage, int hoursPerWeek) {
        super(companyName, position, startDate, endDate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    // Calculate salary
    public double calculateSalary() {
        return hourlyWage * hoursPerWeek * 4; 
    }

    // Evaluate work-life balance
    public String evaluateWorkLifeBalance() {
        if (hoursPerWeek > 50) return "Poor";
        else if (hoursPerWeek > 40) return "Moderate";
        else return "Excellent";
    }

    @Override
    public String assessJobSatisfaction() {
        return "Work-life balance is " + evaluateWorkLifeBalance();
    }
}
