package behavioralPattern.commandPattern;

/**
 * Created by Ning on 6/13/18.
 */
public class PreviousCommand implements Command {
    private Music music;

    public PreviousCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.previous();
    }
}
