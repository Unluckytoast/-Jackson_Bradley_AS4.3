public abstract class Job {
 String companyName;
  String position;
    long startDate;  // Start date in days
    long endDate;    // End date in days

    // Days in each month 
 int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Job(String companyName, String position, int startDate, int endDate) {
        this.companyName = companyName;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Display job details
    public void displayJobDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Position: " + position);
    }

    // Calculate job duration 
    public String calculateJobDuration() {
        long totalDays = endDate - startDate;
        int years = 0;
        int months = 0;
        long days = totalDays;

        // Loop through the months, subtracting their length from the total days
        for (int i = 0; days >= daysInMonths[i % 12]; i++) {
            days -= daysInMonths[i % 12];
            months++;

            // If months reach 12, increment years and reset months to 0
            if (months == 12) {
                years++;
                months = 0;
            }
        }

        // Final output
        return years + " years, " + months + " months, and " + days + " days";
    }

    
    public abstract String assessJobSatisfaction();
}


