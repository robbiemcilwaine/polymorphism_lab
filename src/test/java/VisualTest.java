import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VisualTest {

    Visual visual;

    @BeforeEach
    public void setUp(){
        visual = new Visual("Epic Fails");
    }

    @Test
    public void canWatch(){
        String expected = "I just watched this new video, it's called Epic Fails";
        assertThat(visual.watch()).isEqualTo(expected);
    }

    @Test
    public void canGetTitle(){
        String result = "Epic Fails";
        String expected = visual.getTitle();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetTitle(){
        visual.setTitle("Memes");
        String expected = "Memes";
        assertThat(visual.getTitle()).isEqualTo(expected);
    }
}
