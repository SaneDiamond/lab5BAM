package ca.bcit.comp2522.lab5.BAM;

import java.util.List;

/**
 * Main driver class to use and test the classes BookStore,
 * Bookshop and Novel.
 *
 * @author Ben Nguyen
 * @author Andre Bernard Chang Dizon
 * @author Marcus Vinicius Santos Lages
 *
 * @version 1.0
 */
public class Main {

    /**
     * Program's entry point for running.
     *
     * @param args command line arguments (unused)
     */
    public static void main(final String[] args) {
        final BookStore bookstore;
        final Novel oldest;
        final List<Novel> fifteenCharTitles;
        final Bookshop manager;

        bookstore = new BookStore("Classic Novels Collection");
        manager = new Bookshop(bookstore.getNovels());

        System.out.println("All Titles in UPPERCASE:");
        bookstore.printAllTitles();

        System.out.println("\nBook Titles Containing 'the':");
        bookstore.printBookTitle("the");

        System.out.println("\nAll Titles in Alphabetical Order:");
        bookstore.printTitlesInAlphaOrder();

        bookstore.printGroupByDecade(2000);

        System.out.println("\nLongest Book Title:");
        bookstore.getLongest();

        System.out.println("\nIs there a book written in 1950?");
        System.out.println(bookstore.isThereABookWrittenIn(1950));

        System.out.println("\nHow many books contain 'heart'?");
        System.out.println(bookstore.howManyBooksContain("heart"));

        System.out.println("\nPercentage of books written between 1940 and 1950:");
        System.out.println(bookstore.whichPercentWrittenBetween(1940, 1950) + "%");

        System.out.println("\nOldest book:");
        oldest = bookstore.getOldestBook();

        System.out.println(oldest.getTitle() + " by " + oldest.getAuthorName() + ", " +
                oldest.getYearPublished());

        System.out.println("\nBooks with titles 15 characters long:");
        fifteenCharTitles = bookstore.getBooksThisLength(15);

        fifteenCharTitles.forEach(novel -> System.out.println(novel.getTitle()));

        manager.printAllTitlesUsingIterator();
        manager.removeTitlesContainingThe();
        manager.printSortedNovelsExcludingThe();
    }
}