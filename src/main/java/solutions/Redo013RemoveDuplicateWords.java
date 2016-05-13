package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Given a List of Strings, write a method removeDuplicates that removes duplicate words from the List and returns an
 * ArrayList of all the unique words. The returned ArrayList should be lexically alphabetically.
 */
public class Redo013RemoveDuplicateWords {
    public static ArrayList<String> removeDuplicates(List<String> input) {
        TreeSet<String> resultSet = new TreeSet<>();
        ArrayList<String> resultList = new ArrayList<>();
        resultSet.addAll(input);
        resultList.addAll(resultSet);
        return resultList;
    }
}
