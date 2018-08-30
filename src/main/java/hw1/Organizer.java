package hw1;
import utils.Utils;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/**
 * @ copyright : Wei Xu
 * NetID: fn9523
 *
 */
public class Organizer {
    private List<Task> tasks;
    public Organizer()
    {
        this.tasks = new ArrayList<Task>();
    }
    public void addTask(Task t) {

        tasks.add(t);
    }
    public List<Task> getTasks() {

        return tasks;
    }


    public void sortTasks(Comparator<Task> comparator) {

        Collections.sort(tasks, comparator);
    }

    public void mySortTasks(Comparator<Task> comparator) {
        Utils.sort(tasks, comparator);
    }
}
