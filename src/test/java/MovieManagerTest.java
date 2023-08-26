import org.example.MovieManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void firstManagerTestAll(){
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");

        String[] actual = manager.findAll();
        String[] expected = {"Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void secondManagerTestAll(){
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] actual = manager.findAll();
        String[] expected = {"Film I", "Film II", "Film III"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ManagerTestAllOverLimit(){
        MovieManager manager = new MovieManager(1);

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] actual = manager.findAll();
        String[] expected = {"Film I", "Film II", "Film III"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ManagerTestAllUnderLimit(){
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] actual = manager.findAll();
        String[] expected = {"Film I", "Film II", "Film III"};

        Assertions.assertArrayEquals(expected, actual);
    }



    @Test
    public void thirdManagerTestLast(){
        MovieManager manager = new MovieManager(5);

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");


        String[] actual = manager.findLast();
        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void fourthManagerTestLast(){
        MovieManager manager = new MovieManager(5);

        manager.addMovie("Film I");


        String[] actual = manager.findLast();
        String[] expected = {"Film I"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void fifthManagerTestLast(){
        MovieManager manager = new MovieManager(5);

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");
        manager.addMovie("Film VII");
        manager.addMovie("Film VIII");
        manager.addMovie("Film VIV");
        manager.addMovie("Film X");


        String[] actual = manager.findLast();
        String[] expected = {"Film X", "Film VIV", "Film VIII", "Film VII", "Film VI"};

        Assertions.assertArrayEquals(expected, actual);
    }
}
