package behavioralPattern.commandPattern;

/**
 * Created by Ning on 6/13/18.
 */
public class PlayCommand implements Command {
    private Music music;

    public PlayCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.play();
    }
}
