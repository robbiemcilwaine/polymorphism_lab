import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MagazineTest {

    Magazine magazine;

    @BeforeEach
    public void setUp(){
        magazine = new Magazine("BBC Good Food", "Food", 4.5, 90, "Christine Hayes");
    }

    @Test
    public void canRead(){
        String result = "I am reading a magazine - it's called BBC Good Food!";
        String expected = magazine.read();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canWantPrintMedia(){
        String result = "Let's read the latest gossip - I've got a copy of BBC Good Food";
        String expected = magazine.wantPrintMedia();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canAddArticle(){
        assertThat(magazine.countArticles()).isEqualTo("This magazine has 0 articles");
        magazine.addArticle("New Shepard's Pie Recipe");
        assertThat(magazine.countArticles()).isEqualTo("This magazine has 1 articles");
    }

    @Test
    public void canAddContributor(){
        assertThat(magazine.countContributors()).isEqualTo("This magazine has 0 contributors");
        magazine.addContributor("Keith Kendrick");
        assertThat(magazine.countContributors()).isEqualTo("This magazine has 1 contributors");
    }

    @Test
    public void canGossip(){
        magazine.addArticle("Jeff Bezos");
        magazine.addContributor("Lex Fridman");
        magazine.setTitle("Wired");
        String expected = "OMG! Did you hear that article about Jeff Bezos in Wired by Lex Fridman?";
        assertThat(magazine.gossip(0, 0)).isEqualTo(expected);
    }

    @Test
    public void canSetTitle(){
        magazine.setTitle("The Economist");
        String expected = "The Economist";
        assertThat(magazine.getTitle()).isEqualTo(expected);
    }

    @Test
    public void canGetTitle(){
        String result = "BBC Good Food";
        String expected = magazine.getTitle();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetGenre(){
        magazine.setGenre("Business");
        String expected = "Business";
        assertThat(magazine.getGenre()).isEqualTo(expected);
    }

    @Test
    public void canGetGenre(){
        String result = "Food";
        String expected = magazine.getGenre();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetCost(){
        magazine.setCost(5.4);
        double expected = 5.4;
        assertThat(magazine.getCost()).isEqualTo(expected);
    }

    @Test
    public void canGetCost(){
        double result = 4.5;
        double expected = magazine.getCost();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetPages(){
        magazine.setPages(100);
        int expected = 100;
        assertThat(magazine.getPages()).isEqualTo(expected);
    }

    @Test
    public void canGetPages(){
        int result = 90;
        int expected = magazine.getPages();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetEditor(){
        magazine.setEditor("Keith Kendrick");
        String expected = "Keith Kendrick";
        assertThat(magazine.getEditor()).isEqualTo(expected);
    }

    @Test
    public void canGetEditor(){
        String result = "Christine Hayes";
        String expected = magazine.getEditor();
        assertThat(result).isEqualTo(expected);
    }

}
