package ca.bcit.comp2522.lab5.BAM;

/**
 * Represents a novel with a title, author's name, and year of publication.
 * Implements the Comparable interface to allow novels to be compared based on their titles.
 *
 * @author Andre Bernard Chang Dizon
 * @author Ben Nguyen
 * @author Marcus Vinicius Santos Lages
 *
 * @version 1.0
 */
public class Novel implements Comparable<Novel> {
    private final String title;
    private final String authorName;
    private final int yearPublished;

    /**
     * Constructs a Novel object with the specified title, author's name, and year of publication.
     *
     * @param title the title of the novel
     * @param authorName the name of the author of the novel
     * @param yearPublished the year the novel was published
     */
    public Novel(final String title, final String authorName, final int yearPublished) {
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Compares this novel to another novel based on their title (alphabetically).
     *
     * @param novel the novel to be compared
     * @return 0 if both novels have the same title,
     *         a negative integer if this novel's title is lexicographically less than the specified novel's title,
     *         or a positive integer if this novel's title is lexicographically greater than the specified novel's title
     */
    @Override
    public int compareTo(final Novel novel) {
        return title.compareTo(novel.title);
    }

    @Override
    public String toString(){
        return title;
    }
}
