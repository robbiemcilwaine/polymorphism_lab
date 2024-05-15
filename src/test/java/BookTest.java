import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BookTest {

    Book book;

    @BeforeEach
    public void setUp(){
        book = new Book("Being There", "Satire", 3.5, 112, "Jerzy Kosinski");
    }

    @Test
    public void canJudgeByItsCover(){
        String result = "Don't do that!";
        String expected = book.judgeByItsCover();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canDiscuss(){
        String result = "I really enjoyed Being There, what do you think?";
        String expected = book.discuss();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canWantPrintMedia(){
        String result = "I'm in the mood for some reading - maybe I'll read Being There";
        String expected = book.wantPrintMedia();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canRead(){
        String result = "I am reading Being There!";
        String expected = book.read();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canCountPages(){
        String result = "This print media has 112 pages!";
        String expected = book.countPages();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetAuthor(){
        book.setAuthor("George Orwell");
        String expected = "George Orwell";
        assertThat(book.getAuthor()).isEqualTo(expected);
    }

    @Test
    public void canGetAuthor(){
        String result = "Jerzy Kosinski";
        String expected = book.getAuthor();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetTitle(){
        book.setTitle("Siddartha");
        String expected = "Siddartha";
        assertThat(book.getTitle()).isEqualTo(expected);
    }

    @Test
    public void canGetTitle(){
        String result = "Being There";
        String expected = book.getTitle();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetGenre(){
        book.setGenre("Philosophical fiction");
        String expected = "Philosophical fiction";
        assertThat(book.getGenre()).isEqualTo(expected);
    }

    @Test
    public void canGetGenre(){
        String result = "Satire";
        String expected = book.getGenre();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetCost(){
        book.setCost(7.2);
        double expected = 7.2;
        assertThat(book.getCost()).isEqualTo(expected);
    }

    @Test
    public void canGetCost(){
        double result = 3.5;
        double expected = book.getCost();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetPages(){
        book.setPages(144);
        int expected = 144;
        assertThat(book.getPages()).isEqualTo(expected);
    }

    @Test
    public void canGetPages(){
        int result = 112;
        int expected = book.getPages();
        assertThat(result).isEqualTo(expected);
    }

}
