package lld.compositePattern.solutionWithComposite;

public class Main {

    public static void main(String args[]) {

        Directory movieDirectory = new Directory("Movie");

        FileSystem border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        FileSystem hulchul = new File("Hulchul");
        FileSystem heraPheri = new File("Hera Pheri");
        comedyMovieDirectory.add(hulchul);
        comedyMovieDirectory.add(heraPheri);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();

    }
}
