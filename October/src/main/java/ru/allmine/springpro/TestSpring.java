package ru.allmine.springpro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("musicBean", Music.class);//creating object
        //MusicPlayer musicPlayer = new MusicPlayer(music);//injection of this object

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;

        System.out.println(comparison);

        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
//        System.out.println(musicPlayer.getName());
//        System.out.println (musicPlayer.getVolume());

        firstMusicPlayer.setVolume(11);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        context.close();
    }
}
