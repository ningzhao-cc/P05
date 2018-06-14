package behavioralPattern.commandPattern;

/**
 * Created by Ning on 6/13/18.
 */
public class SkipCommand implements Command {
    private Music music;

    public SkipCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.skip();
    }
}
