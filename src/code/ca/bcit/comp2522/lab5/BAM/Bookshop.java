package ca.bcit.comp2522.lab5.BAM;

import java.util.*;

/**
 * The Bookshop class manages a collection of novels. It allows for operations
 * such as printing all titles, removing titles containing the word "the", and
 * printing sorted novels.
 * This class uses a Map with the title of the novel as the key and the Novel
 * object as the value.
 *
 * @author Ben Nguyen, Andre Dizon, Marcus Lages
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
        for (final Novel novel : novels) {
            novelMap.put(novel.getTitle(), novel); // key: title, value: novel
        }
    }

    /**
     * Prints all novel titles using an iterator over the key set of the map.
     */
    public void printAllTitlesUsingIterator() {
        System.out.println("All Titles in the BookStore:");
        final Set<String> keySet;
        final Iterator<String> iterator;

        keySet = novelMap.keySet();

        iterator = keySet.iterator();

        while (iterator.hasNext()) {
            final String title = iterator.next();
            System.out.println(title);
        }
    }

    /**
     * Removes all novels from the novelMap whose titles contain "the" (case-insensitive).
     * This method modifies the internal map and removes any entry that matches the condition.
     */
    public void removeTitlesContainingThe() {
        final Iterator<String> iterator = novelMap.keySet().iterator();

        while (iterator.hasNext()) {
            final String title = iterator.next();
            if (title.toLowerCase().contains("the")) {
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
        System.out.println("\nNovels after removing titles containing 'the', sorted by title:");
        final Set<String> keySet;
        final List<String> keyList;

        keySet = novelMap.keySet();

        keyList = new ArrayList<>(keySet);

        Collections.sort(keyList, String.CASE_INSENSITIVE_ORDER);

        for (final String title : keyList) {
            final Novel novel = novelMap.get(title);
            System.out.println(novel);
        }
    }
}
