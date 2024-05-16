import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SocialTest {

    Social social;

    @BeforeEach
    public void setUp(){
        social = new Social("Instagram");
    }

    @Test
    public void canRead(){
        String expected = "I just read this new post on Instagram";
        assertThat(social.read()).isEqualTo(expected);
    }

    @Test
    public void canWatch(){
        String expected = "I just watched this new post on Instagram";
        assertThat(social.watch()).isEqualTo(expected);
    }

    @Test
    public void canGetTitle(){
        String result = "Instagram";
        String expected = social.getTitle();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetTitle(){
        social.setTitle("TikTok");
        String expected = "TikTok";
        assertThat(social.getTitle()).isEqualTo(expected);
    }

}
