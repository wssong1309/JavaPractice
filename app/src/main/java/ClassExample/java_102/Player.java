package ClassExample.java_102;

import java.util.List;

public class Player {

    // [1] Supplier Extends (read)
    public static void play(List <? extends Content> Playlist) { // Upper Bound. Content의 하위 타입만 받을 수 있음
        for (Content content : Playlist) {
            System.out.println("재생 : " + content.getTitle());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    // [2] Consumer Super (write)
    public static void addRecommendedContent(List<? super Music> playList) { // Lower Bound. Music을 의 상위 타입만 받을 수 있음
        Music music = new Music("ChatGPT4 Song");
        playList.add(music);

        // playList.add(new Movie("Star Wars")); => Compiletime Error 발생.(Movie type은 Music의 상위 타입이 아니기 때문에)
    }

}
