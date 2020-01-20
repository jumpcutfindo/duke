package tasks;

public class DeadlineTask extends Task {

    private String deadline;

    public DeadlineTask(String description, String deadline) {
        super(description);
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return String.format("%s%s (by: %s)", "[D]", super.toString(), deadline);
    }
}