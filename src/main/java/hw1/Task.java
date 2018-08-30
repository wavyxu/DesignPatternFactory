package hw1;
import java.util.Calendar;

/**
 * @ copyright : Wei Xu
 * NetID: fn9523
 *
 */
public class Task implements Comparable<Task>{
    private String name;
    private Calendar deadline;

    public Task(String name, Calendar deadline) {
        this.name = name;
        this.deadline = deadline;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDeadline(Calendar date) {
        this.deadline = date;
    }
    public String getName() {
        return name;
    }
    public Calendar getDeadline() {

        return deadline;
    }


    public int compareTo(Task t) {

        return this.deadline.getTime().compareTo(t.deadline.getTime()) ;
    }
}
