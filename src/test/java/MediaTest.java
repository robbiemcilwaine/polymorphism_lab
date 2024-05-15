import models.Book;
import models.Media;
import models.Print;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.ArrayList;

public class MediaTest {

    Media media;
    Print printMedia1;
    Print printMedia2;

    @BeforeEach
    public void setUp(){
        media = new Media();
        printMedia1 = new Book("Being There", "Satire", 10.0, 112, "Jerzy Kosinski");
        printMedia2 = new Book("Siddartha", "Philosophical fiction", 12.2, 144, "Hermann Hesse");
    }

    @Test
    public void canAddItemToPrintMedia(){
        assertThat(media.countPrintMedia()).isEqualTo(0);
        media.addItemToPrintMedia(printMedia1);
        assertThat(media.countPrintMedia()).isEqualTo(1);
    }

    @Test
    public void canAddMultipleItemsToPrintMedia(){
        assertThat(media.countPrintMedia()).isEqualTo(0);
        media.addItemToPrintMedia(printMedia1);
        assertThat(media.countPrintMedia()).isEqualTo(1);
        media.addItemToPrintMedia(printMedia2);
        assertThat(media.countPrintMedia()).isEqualTo(2);
    }

    @Test
    public void canCalculateProfit(){
        media.addItemToPrintMedia(printMedia1);
        media.addItemToPrintMedia(printMedia2);
        double expected = 22.2;
        assertThat(media.calculateProfit()).isEqualTo(expected);
    }

    @Test
    public void canCountPrintMedia(){
        media.addItemToPrintMedia(printMedia1);
        int expected = 1;
        assertThat(media.countPrintMedia()).isEqualTo(expected);
    }

    @Test
    public void canGetPrintMedia(){
        ArrayList<Print> expected = new ArrayList<>();
        assertThat(media.getPrintMedia()).isEqualTo(expected);
    }

}
