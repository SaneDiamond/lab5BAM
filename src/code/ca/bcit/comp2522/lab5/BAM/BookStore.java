package ca.bcit.comp2522.lab5.BAM;
import java.util.Iterator;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookStore {
    private static final int MIN_AMOUNT_BOOKS = 0;
    private static final double ZERO_CHANCE = 0.0;
    private static final double RATIO_TO_PERCENTAGE = 100.0;
    private static final int CONTAINS_NOTHING = 0;

    private static final int END_YEAR = 9;

    private final String name;
    private final List<Novel> novels;
    private final Map<String, Novel> novelMap;



    // Constructor
    public BookStore(final String name) {
        novels = new ArrayList<>();
        this.name = name;
        novelMap = new HashMap<>();

        // Populating the list with the provided data
        novels.add(new Novel("The Adventures of Augie March", "Saul Bellow", 1953));
        novels.add(new Novel("All the King’s Men", "Robert Penn Warren", 1946));
        novels.add(new Novel("American Pastoral", "Philip Roth", 1997));
        novels.add(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
        novels.add(new Novel("Animal Farm", "George Orwell", 1946));
        novels.add(new Novel("Appointment in Samarra", "John O'Hara", 1934));
        novels.add(new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
        novels.add(new Novel("The Assistant", "Bernard Malamud", 1957));
        novels.add(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
        novels.add(new Novel("Atonement", "Ian McEwan", 2002));
        novels.add(new Novel("Beloved", "Toni Morrison", 1987));
        novels.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        novels.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        novels.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        novels.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        novels.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        novels.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        novels.add(new Novel("Call It Sleep", "Henry Roth", 1935));
        novels.add(new Novel("Catch-22", "Joseph Heller", 1961));
        novels.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        novels.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
        novels.add(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
        novels.add(new Novel("The Corrections", "Jonathan Franzen", 2001));
        novels.add(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
        novels.add(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
        novels.add(new Novel("The Day of the Locust", "Nathanael West", 1939));
        novels.add(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
        novels.add(new Novel("A Death in the Family", "James Agee", 1958));
        novels.add(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
        novels.add(new Novel("Deliverance", "James Dickey", 1970));
        novels.add(new Novel("Dog Soldiers", "Robert Stone", 1974));
        novels.add(new Novel("Falconer", "John Cheever", 1977));
        novels.add(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
        novels.add(new Novel("The Golden Notebook", "Doris Lessing", 1962));
        novels.add(new Novel("Go Tell It on the Mountain", "James Baldwin", 1953));
        novels.add(new Novel("Gone with the Wind", "Margaret Mitchell", 1936));
        novels.add(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
        novels.add(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
        novels.add(new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        novels.add(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
        novels.add(new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940));
        novels.add(new Novel("The Heart of the Matter", "Graham Greene", 1948));
        novels.add(new Novel("Herzog", "Saul Bellow", 1964));
        novels.add(new Novel("Housekeeping", "Marilynne Robinson", 1981));
        novels.add(new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962));
        novels.add(new Novel("I, Claudius", "Robert Graves", 1934));
        novels.add(new Novel("Infinite Jest", "David Foster Wallace", 1996));
        novels.add(new Novel("Invisible Man", "Ralph Ellison", 1952));
        novels.add(new Novel("Light in August", "William Faulkner", 1932));
        novels.add(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
        novels.add(new Novel("Lolita", "Vladimir Nabokov", 1955));
        novels.add(new Novel("Lord of the Flies", "William Golding", 1954));
        novels.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        novels.add(new Novel("Loving", "Henry Green", 1945));
        novels.add(new Novel("Lucky Jim", "Kingsley Amis", 1954));
        novels.add(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
        novels.add(new Novel("Midnight's Children", "Salman Rushdie", 1981));
        novels.add(new Novel("Money", "Martin Amis", 1984));
        novels.add(new Novel("The Moviegoer", "Walker Percy", 1961));
        novels.add(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
        novels.add(new Novel("Naked Lunch", "William Burroughs", 1959));
        novels.add(new Novel("Native Son", "Richard Wright", 1940));
        novels.add(new Novel("Neuromancer", "William Gibson", 1984));
        novels.add(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
        novels.add(new Novel("1984", "George Orwell", 1948));
        novels.add(new Novel("On the Road", "Jack Kerouac", 1957));
        novels.add(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
        novels.add(new Novel("The Painted Bird", "Jerzy Kosinski", 1965));
        novels.add(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
        novels.add(new Novel("A Passage to India", "E.M. Forster", 1924));
        novels.add(new Novel("Play It as It Lays", "Joan Didion", 1970));
        novels.add(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
        novels.add(new Novel("Possession", "A.S. Byatt", 1990));
        novels.add(new Novel("The Power and the Glory", "Graham Greene", 1939));
        novels.add(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
        novels.add(new Novel("Rabbit, Run", "John Updike", 1960));
        novels.add(new Novel("Ragtime", "E.L. Doctorow", 1975));
        novels.add(new Novel("The Recognitions", "William Gaddis", 1955));
        novels.add(new Novel("Red Harvest", "Dashiell Hammett", 1929));
        novels.add(new Novel("Revolutionary Road", "Richard Yates", 1961));
        novels.add(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
        novels.add(new Novel("Slaughterhouse-Five", "Kurt Vonnegut", 1969));
        novels.add(new Novel("Snow Crash", "Neal Stephenson", 1992));
        novels.add(new Novel("The Sot-Weed Factor", "John Barth", 1960));
        novels.add(new Novel("The Sound and the Fury", "William Faulkner", 1929));
        novels.add(new Novel("The Sportswriter", "Richard Ford", 1986));
        novels.add(new Novel("The Spy Who Came in from the Cold", "John le Carré", 1964));
        novels.add(new Novel("The Sun Also Rises", "Ernest Hemingway", 1926));
        novels.add(new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937));
        novels.add(new Novel("Things Fall Apart", "Chinua Achebe", 1959));
        novels.add(new Novel("To Kill a Mockingbird", "Harper Lee", 1960));
        novels.add(new Novel("To the Lighthouse", "Virginia Woolf", 1929));
        novels.add(new Novel("Tropic of Cancer", "Henry Miller", 1934));
        novels.add(new Novel("Ubik", "Philip K. Dick", 1969));
        novels.add(new Novel("Under the Net", "Iris Murdoch", 1954));
        novels.add(new Novel("Under the Volcano", "Malcolm Lowry", 1947));
        novels.add(new Novel("Watchmen", "Alan Moore and Dave Gibbons", 1986));
        novels.add(new Novel("White Noise", "Don DeLillo", 1985));
        novels.add(new Novel("White Teeth", "Zadie Smith", 2000));
        novels.add(new Novel("Wide Sargasso Sea", "Jean Rhys", 1966));

        // Populating the novelMap using the author as the key
        for (final Novel novel : novels) {
            // key: author, value: novel
            novelMap.put(novel.getAuthorName(), novel);
        }
    }

    // Getter for the novels list
    public List<Novel> getNovels() {
        return novels;
    }

    /**
     * Prints the title of all books in the bookstore/novels list
     * in uppercase.
     */
    public void printAllTitles() {
        for (final Novel novel : novels) {
            final String title;
            title = novel.getTitle();
            System.out.println(title.toUpperCase());
        }
    }

    public void printBookTitle(final String title) {
        final String novelTitleParameter;
        novelTitleParameter = "the";
        for (final Novel novel : novels) {
            if (novel.getTitle().toLowerCase().contains(novelTitleParameter.toLowerCase())) {
                System.out.println(novel.getTitle());
            }
        }

    }

    /**
     * Prints the titles of all books in alphabetical order using
     * the implemented compareTo() from the Novel class.
     */
    public void printTitlesInAlphaOrder() {

        final List<Novel> novelsCopy;
        novelsCopy = new ArrayList<>(novels);

        for (final Novel novel : novelsCopy) {
            final String title;
            title = novel.getTitle();
            System.out.println(title.toUpperCase());
        }
    }

    public void getLongest() {
        String longestTitle = "";

        for (final Novel novel : novels) {
            // Marcus:
            // - Split declaration and instantiation
            final String title = novel.getTitle();
            if (title.length() > longestTitle.length()) {
                longestTitle = title;
            }
        }

        System.out.println(longestTitle);
    }

    /**
     * Checks if there's any book published in the specified year
     * in the catalog.
     *
     * @param yearPublished year published that will be searched for in the catalog
     * @return true if a book published in the specified year was found
     */
    public boolean isThereABookWrittenIn(final int yearPublished) {

        for (final Novel novel : novels) {
            final int novelsYearPublished;
            novelsYearPublished = novel.getYearPublished();

            if(novelsYearPublished == yearPublished) {
                return true;
            }
        }

        return false;
    }

    // Marcus:
    // - Argument not final
    public int howManyBooksContain(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Word cannot be null.");
        }

        if (word.isBlank()) {
            throw new IllegalArgumentException("Word cannot be blank.");
        }
        int wordContainedWithin;
        wordContainedWithin = CONTAINS_NOTHING;
        for (final Novel novel : novels) {
            if (novel.getTitle().toLowerCase().contains(word.toLowerCase())) {
                wordContainedWithin++;
            }

        }
        return wordContainedWithin;
    }

    /**
     * Returns the percentage (between 0.0 and 100.0) of how many novels in the bookstore/novels list
     * were published in the interval of years specified (inclusive) in relation to all the books
     * in the bookstore.
     *
     * @param startYear first year of the interval
     * @param endYear last year of the interval
     * @return percentage of how many novels were published in the specified interval
     */
    public double whichPercentWrittenBetween(final int startYear,
                                             final int endYear) {

        // A larger start year than end year is invalid, chance is ZERO_CHANCE
        if(startYear > endYear) {
            return ZERO_CHANCE;
        }

        final int allBooks;
        int booksInRange;
        double result;

        allBooks = novels.size();
        booksInRange = MIN_AMOUNT_BOOKS;
        result = ZERO_CHANCE;

        for(final Novel novel: novels) {
            final int novelsYearPublished;
            novelsYearPublished = novel.getYearPublished();

            if(novelsYearPublished >= startYear && novelsYearPublished <= endYear) {
                booksInRange++;
            }
        }

        // If there's no books in range, then the percentage is ZERO_CHANCE
        if(booksInRange >= MIN_AMOUNT_BOOKS) {
            result = (double) booksInRange / allBooks;
            result *= RATIO_TO_PERCENTAGE;
        }

        return result;
    }

    /**
     * Prints the list of books by the decade entered
     * @param decade allows the user to sort by the decade inputted
     */
    public void printGroupByDecade(final int decade) {
        final int startYear = decade;
        final int endYear = decade + END_YEAR;

        final StringBuilder sb;
        sb = new StringBuilder();
        sb.append("Books from the ")
                .append(decade)
                .append("s:\n");

        boolean booksFound = false;

        // Loop through novels and check if they fall within the decade
        for (final Novel novel : novels) {
            final int year = novel.getYearPublished();
            if (year >= startYear && year <= endYear) {
                sb.append("- ")
                        .append(novel.getTitle())
                        .append(" (")
                        .append(year)
                        .append(")\n");
                booksFound = true;
            }
        }

        // me when no books
        if (!booksFound) {
            sb.append("No books in decade");
        }
        System.out.println(sb.toString());
    }

    /**
     * returns the oldest book
     */
    public Novel getOldestBook(){
        final List<Novel> novelList;
        novelList = new ArrayList<>();

        final StringBuilder sb;
        sb = new StringBuilder();

        final Novel oldestNovel;
        oldestNovel = Collections.max(novels);

        return oldestNovel;
        }

    /**
     * Prints all titles using an Iterator with map
     */
    private void printAllTitlesUsingIterator() {
        System.out.println("\nAll Titles in the BookStore:");
        // do finals even go here bruh
        // Marcus: they do, but you are missing splitting declaration and instantiation
        //         why is it a String too?
        final Set<String> keySet = novelMap.keySet();
        final Iterator<String> iterator = keySet.iterator();

        while (iterator.hasNext()) {
            // Marcus:
            // - Not final
            String title = iterator.next();
            System.out.println(title);
        }
    }
    /**
     * Removes all novels whose title contains "the"
     */
    private void removeNovelsWithTitleContainingThe() {
        System.out.println("\nRemoving novels with titles containing \"the\"...");

        final Iterator<Map.Entry<String, Novel>> iterator = novelMap.entrySet().iterator();

        while (iterator.hasNext()) {
            // Marcus:
            // - Not final
            // - Separate declaration and instantiation
            Map.Entry<String, Novel> entry = iterator.next();
            final String title = entry.getKey();

            if (title.toLowerCase().contains("the")) {
                iterator.remove();
                System.out.println("Removed: " + title);
            }
        }
    }

    /**
     * Prints the novels // need to be sorted by order
     */
    // Marcus:
    // - Why are you using String and not Novel?
    // - Why don't you just copy the list and use Collections.sort()
    private void printSortedNovels() {
        System.out.println("\nNovels sorted by title (excluding titles containing \"the\"):");
        // Marcus:
        // - Separate declaration and instantiation
        final Set<String> keySet = novelMap.keySet();
        final List<String> sortedTitles = new ArrayList<>(keySet);
        Collections.sort(sortedTitles);

        for (final String title : sortedTitles) {
            // Marcus:
            // - No final
            Novel novel = novelMap.get(title);
            System.out.println(novel.toString());
        }
    }

    // Marcus:
    // - Why strings? We are using novels
    // - no final for titleLength
    public List<String> getBooksThisLength(int titleLength) {
        final List<String> titles;
        titles = new ArrayList<>();

        for (final Novel novel : novels) {
            if (novel.getTitle().length() == titleLength) {
                titles.add(novel.getTitle());
            }

        }
        return titles;
    }


    // Optional: Main method for testing
    public static void main(final String[] args) {
        final BookStore bookstore;
        final Novel oldest;
        final List<Novel> fifteenCharTitles;

        bookstore = new BookStore("Classic Novels Collection");

        System.out.println("All Titles in UPPERCASE:");
        bookstore.printAllTitles();

        System.out.println("\nBook Titles Containing 'the':");
        bookstore.printBookTitle("the");

        System.out.println("\nAll Titles in Alphabetical Order:");
        bookstore.printTitlesInAlphaOrder();

        System.out.println("\nBooks from the 2000s:");
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

//        System.out.println("\nBooks with titles 15 characters long:");
//        fifteenCharTitles = bookstore.getBooksThisLength(15);

//        fifteenCharTitles.forEach(novel -> System.out.println(novel.getTitle()));
    }

}

