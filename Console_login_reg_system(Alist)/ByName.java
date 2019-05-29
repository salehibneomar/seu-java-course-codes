
package javaapplication26;

import java.util.Comparator;

public class ByName implements Comparator<SR>{
    @Override
    public int compare(SR a, SR b) {
        return a.getName().compareTo(b.getName());
    }
}
