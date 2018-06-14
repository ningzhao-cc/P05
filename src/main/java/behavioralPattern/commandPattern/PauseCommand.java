package behavioralPattern.commandPattern;

/**
 * Created by Ning on 6/13/18.
 */
public class PauseCommand implements Command{
    private Music music;

    public PauseCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.pause();
    }
}
