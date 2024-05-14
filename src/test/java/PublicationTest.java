import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PublicationTest {

    Publication publication;

    @BeforeEach
    public void setUp(){
        publication = new Publication("Being There", "Satire", 3.5, 112);
    }

    @Test
    public void canRead(){
        String result = "I am reading Being There!";
        String expected = publication.read();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canCountPages(){
        String result = "This publication has 112 pages!";
        String expected = publication.countPages();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetTitle(){
        publication.setTitle("Siddartha");
        String expected = "Siddartha";
        assertThat(publication.getTitle()).isEqualTo(expected);
    }

    @Test
    public void canGetTitle(){
        String result = "Being There";
        String expected = publication.getTitle();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetGenre(){
        publication.setGenre("Philosophical fiction");
        String expected = "Philosophical fiction";
        assertThat(publication.getGenre()).isEqualTo(expected);
    }

    @Test
    public void canGetGenre(){
        String result = "Satire";
        String expected = publication.getGenre();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetCost(){
        publication.setCost(7.2);
        double expected = 7.2;
        assertThat(publication.getCost()).isEqualTo(expected);
    }

    @Test
    public void canGetCost(){
        double result = 3.5;
        double expected = publication.getCost();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetPages(){
        publication.setPages(144);
        int expected = 144;
        assertThat(publication.getPages()).isEqualTo(expected);
    }

    @Test
    public void canGetPages(){
        int result = 112;
        int expected = publication.getPages();
        assertThat(result).isEqualTo(expected);
    }

}
