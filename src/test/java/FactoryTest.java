import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.ArrayList;

public class FactoryTest {

    Factory factory;
    Publication publication1;
    Publication publication2;

    @BeforeEach
    public void setUp(){
        factory = new Factory("Book Factory");
        publication1 = new Publication("Being There", "Satire", 3.5, 112);
        publication2 = new Publication("Siddartha", "Philosophical fiction", 7.2, 144);
    }

    @Test
    public void canAddItemToPublications(){
        assertThat(factory.countPublications()).isEqualTo(0);
        factory.addItemToPublications(publication1);
        assertThat(factory.countPublications()).isEqualTo(1);
    }

    @Test
    public void canAddMultipleItemsToPublications(){
        assertThat(factory.countPublications()).isEqualTo(0);
        factory.addItemToPublications(publication1);
        assertThat(factory.countPublications()).isEqualTo(1);
        factory.addItemToPublications(publication2);
        assertThat(factory.countPublications()).isEqualTo(2);
    }

    @Test
    public void canCalculateProfit(){
        factory.addItemToPublications(publication1);
        factory.addItemToPublications(publication2);
        double expected = 10.7;
        assertThat(factory.calculateProfit()).isEqualTo(expected);
    }

    @Test
    public void canCountPublications(){
        factory.addItemToPublications(publication1);
        int expected = 1;
        assertThat(factory.countPublications()).isEqualTo(expected);
    }

    @Test
    public void canGetPublications(){
        ArrayList<Publication> expected = new ArrayList<>();
        assertThat(factory.getPublications()).isEqualTo(expected);
    }

    @Test
    public void canSetName(){
        factory.setName("Magazine Factory");
        String expected = "Magazine Factory";
        assertThat(factory.getName()).isEqualTo(expected);
    }

    @Test
    public void canGetName(){
        String result = "Book Factory";
        String expected = factory.getName();
        assertThat(result).isEqualTo(expected);
    }

}
