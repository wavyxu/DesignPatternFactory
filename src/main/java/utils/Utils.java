package utils;
import java.util.List;
import java.util.Comparator;
/**
 * @ copyright : Wei Xu
 * NetID: fn9523
 *
 */
public class Utils {

    public static <T> void sort(List<T> list, Comparator<? super T> comparator) {
        // selection sort
        for (int i = 0; i < list.size(); ++i) {
            int temp = i;
            int j = i + 1;
            while (j < list.size()) {
                if (comparator.compare(list.get(temp), list.get(j)) > 0) {
                    temp = j;
                }
                j++;
            }
            T tempTask = list.get(temp);
            list.set(temp, list.get(i));
            list.set(i, tempTask);
            i++;
        }
    }
}
