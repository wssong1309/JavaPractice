package ClassExample.java_102;

import java.util.ArrayList;
import java.util.List;

public class SubTypeTest {
    public static void main(String[] args) {
        /* 
         *List<Music> musicList = new ArrayList<Movie>(); Compiletime Error 발생.
         *(musicList의 Generics type과 ArrayList생성자의 Generics type이 다르기 때문에. 무조건 같아야한다.)
         */
        List<Music> musicList = new ArrayList<Music>();
        musicList.add(new Music("Betelgeuse"));
        musicList.add(new Music("Refrain"));
        musicList.add(new Music("Orange"));

        Player.play(musicList);

        Player.addRecommendedContent(musicList);
        
        Player.play(musicList);
    }
}
