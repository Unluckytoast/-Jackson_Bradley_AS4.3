import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Job> jobHistory;

    public Employee(String name) {
        this.name = name;
        this.jobHistory = new ArrayList<>();
    }

    // Add a job to the history
    public void addJob(Job job) {
        jobHistory.add(job);
    }

    // Display all job details
    public void displayJobHistory() {
        for (Job job : jobHistory) {
            job.displayJobDetails();
            System.out.println("Job Duration: " + job.calculateJobDuration()); 
            System.out.println("Job Satisfaction: " + job.assessJobSatisfaction());
            System.out.println("------------------------------");
        }
    }

    // Calculate total work experience in days
    public int calculateTotalExperience() {
        int totalExperience = 0;
        for (Job job : jobHistory) {
            totalExperience += job.endDate - job.startDate; 
        }
        return totalExperience;
    }
}

