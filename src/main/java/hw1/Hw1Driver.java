package hw1;
import java.util.*;
/**
 * @ copyright : Wei Xu
 * NetID: fn9523
 *
 */
public class Hw1Driver {
    public static void main(String[] args) {

        Organizer organizer = new Organizer();

        // prepare test data
        for (int i = 0; i < 10; i++) {
            String name = "task" + i;
            Calendar calendar = null;
            calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_MONTH, 10 - i);

            organizer.addTask(new Task(name, calendar));
        }

        // prepare comparator
        Comparator<Task> cmpByName = (Task o1, Task o2) -> o1.getName().compareTo(o2.getName());
        Comparator<Task> cmpByDeadline = (Task o1, Task o2) -> o1.getDeadline().compareTo(o2.getDeadline());


        // use collection.sort
        System.out.println("Call Collection.sort(cmpByName) ....");
        organizer.sortTasks(cmpByName);
        organizer.getTasks().forEach((task) -> System.out.println(task.getName() + " : " + task.getDeadline().getTime()));
        System.out.println("-----------------------------------------------");
        System.out.println("Call Collection.sort(cmpByDeadline) ....");
        organizer.sortTasks(cmpByDeadline);
        organizer.getTasks().forEach((task) -> System.out.println(task.getName() + " : " + task.getDeadline().getTime()));
        System.out.println("-----------------------------------------------");

        // use my version of sort
        System.out.println("Call mySortTasks(cmpByName) ....");
        organizer.mySortTasks(cmpByName);
        organizer.getTasks().forEach((task) -> System.out.println(task.getName() + " : " + task.getDeadline().getTime()));
        System.out.println("-----------------------------------------------");
        System.out.println("Call mySortTasks.sort(cmpByDeadline) ....");
        organizer.mySortTasks(cmpByDeadline);
        organizer.getTasks().forEach((task) -> System.out.println(task.getName() + " : " + task.getDeadline().getTime()));

    }
}
