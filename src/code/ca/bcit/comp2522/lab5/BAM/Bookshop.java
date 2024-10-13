package ca.bcit.comp2522.lab5.BAM;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.Collections;

/**
 * The Bookshop class manages a collection of novels. It allows for operations
 * such as printing all titles, removing titles containing the word "the", and
 * printing sorted novels.
 * This class uses a Map with the title of the novel as the key and the Novel
 * object as the value.
 *
 * @author Ben Nguyen
 * @author Andre Dizon
 * @author Marcus Lages
 *
 * @version 1.0
 */
public class Bookshop {
    private final Map<String, Novel> novelMap;

    /**
     * Constructs a new Bookshop and initializes the novel map.
     *
     * @param novels a List of Novel objects to be added to the map.
     */
    public Bookshop(final List<Novel> novels) {
        novelMap = new HashMap<>();

        if(novels != null) {
            for (final Novel novel : novels) {
                if(novel != null) {
                    novelMap.put(novel.getTitle(), novel); // key: title, value: novel
                }
            }
        }
    }

    /**
     * Prints all titles using an Iterator with map
     */
    public void printAllTitlesUsingIterator() {
        final Set<String> keySet;
        final Iterator<String> iterator;

        keySet = novelMap.keySet();
        iterator = keySet.iterator();

        System.out.println("\nAll Titles in the BookStore:");
        while (iterator.hasNext()) {
            final String key;
            key = iterator.next();

            if(key != null) {
                final Novel n;
                n = novelMap.get(key);
                System.out.println(n);
            }
        }
    }

    /**
     * Removes all novels from the novelMap whose titles contain "the" (case-insensitive).
     * This method modifies the internal map and removes any entry that matches the condition.
     */
    public void removeTitlesContainingThe() {
        final Iterator<String> iterator;
        iterator = novelMap.keySet().iterator();

        while (iterator.hasNext()) {
            final String title;
            title = iterator.next();

            if (title != null && title.toLowerCase().contains("the")) {
                iterator.remove();
            }
        }

        System.out.println("\nTitles containing 'the' have been removed.");
    }

    /**
     * Sorts the novel titles alphabetically (case-insensitive) and prints the novels
     * in sorted order. This method excludes titles containing "the".
     */
    public void printSortedNovelsExcludingThe() {
        final Set<String> keySet;
        final List<String> keyList;

        keySet = novelMap.keySet();
        keyList = new ArrayList<>(keySet);

        Collections.sort(keyList, String.CASE_INSENSITIVE_ORDER);

        System.out.println("\nNovels after removing titles containing 'the', sorted by title:");
        for (final String title : keyList) {
            if(title != null) {
//                final Novel novel;
//                novel = novelMap.get(title);
//                System.out.println(novel.getTitle());
                System.out.println(title);
            }
        }
    }
}
