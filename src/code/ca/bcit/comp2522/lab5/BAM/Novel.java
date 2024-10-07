package ca.bcit.comp2522.lab5.BAM;

public class Novel
        implements Comparable<Novel> {
    private final String title;
    private final String authorName;
    private final int yearPublished;

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

    @Override
    public int compareTo(final Novel novel) {
        final int comparison;
        comparison = title.compareTo(novel.title);

        return comparison;
    }
}
