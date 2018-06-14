package behavioralPattern.commandPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Ning on 6/13/18.
 */
public class Music {
    private static final Logger logger = LoggerFactory.getLogger(Music.class);

    public void play() {
        //logger.info("music starts to play");
        System.out.println("music starts to play");
    }

    public void pause() {
        //logger.info("music stops");
        System.out.println("music stops");
    }

    public void skip() {
        //logger.info("music skipped");
        System.out.println("music skipped");
    }

    public void previous() {
        //logger.info("return last music");
        System.out.println("return last music");
    }
}
