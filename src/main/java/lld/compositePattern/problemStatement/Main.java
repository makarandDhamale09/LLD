package lld.compositePattern.problemStatement;

public class Main {

    /**
     * The problem with this approach is that we are creating the list of Object and
     * not of a specific type. So not a good approach.
     */
    public static void main(String args[]) {

        Directory movieDirectory = new Directory("Movie");

        File border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();
    }
}
