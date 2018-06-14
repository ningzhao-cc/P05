package behavioralPattern.commandPattern;

/**
 * Created by Ning on 6/13/18.
 */
public class MusicCommander {
    PlayCommand playCommand;
    PauseCommand pauseCommand;
    PreviousCommand previousCommand;
    SkipCommand skipCommand;

    public void play() {
        playCommand.execute();
    }

    public void pause() {
        pauseCommand.execute();
    }

    public void previous() {
        previousCommand.execute();
    }

    public void skip() {
        skipCommand.execute();
    }

    public PlayCommand getPlayCommand() {
        return playCommand;
    }

    public void setPlayCommand(PlayCommand playCommand) {
        this.playCommand = playCommand;
    }

    public PauseCommand getPauseCommand() {
        return pauseCommand;
    }

    public void setPauseCommand(PauseCommand pauseCommand) {
        this.pauseCommand = pauseCommand;
    }

    public PreviousCommand getPreviousCommand() {
        return previousCommand;
    }

    public void setPreviousCommand(PreviousCommand previousCommand) {
        this.previousCommand = previousCommand;
    }

    public SkipCommand getSkipCommand() {
        return skipCommand;
    }

    public void setSkipCommand(SkipCommand skipCommand) {
        this.skipCommand = skipCommand;
    }
}
