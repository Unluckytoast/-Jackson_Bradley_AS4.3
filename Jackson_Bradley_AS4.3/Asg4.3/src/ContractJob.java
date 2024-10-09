public class ContractJob extends Job {
    private double hourlyRate;
    private int totalHours;

    public ContractJob(String companyName, String position, int startDate, int endDate, double hourlyRate, int totalHours) {
        super(companyName, position, startDate, endDate);
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
    }

    // Calculate total payment for the contract
    public double calculatePayment() {
        return hourlyRate * totalHours;
    }

    // Evaluate job security
    public String evaluateJobSecurity() {
        if ((endDate - startDate) > 365) return "High";
        else if ((endDate - startDate) > 180) return "Medium";
        else return "Low";
    }

    @Override
    public String assessJobSatisfaction() {
        return "Job security is " + evaluateJobSecurity();
    }
}
