package behavioralPattern;

import behavioralPattern.chainOfResponsibilityPattern.CEO;
import behavioralPattern.chainOfResponsibilityPattern.Handler;
import behavioralPattern.chainOfResponsibilityPattern.Request;
import behavioralPattern.chainOfResponsibilityPattern.TeamManager;
import behavioralPattern.commandPattern.*;
import behavioralPattern.iteratorPattern.Container;
import behavioralPattern.iteratorPattern.GamesContainer;
import behavioralPattern.iteratorPattern.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {

        //// command Pattern
        //Music music = new Music();
        //
        //PlayCommand playCommand = new PlayCommand(music);
        //PauseCommand pauseCommand = new PauseCommand(music);
        //PreviousCommand previousCommand = new PreviousCommand(music);
        //SkipCommand skipCommand = new SkipCommand(music);
        //
        //MusicCommander commander = new MusicCommander();
        //
        //commander.setPlayCommand(playCommand);
        //commander.setPauseCommand(pauseCommand);
        //commander.setPreviousCommand(previousCommand);
        //commander.setSkipCommand(skipCommand);
        //
        //commander.play();
        //commander.pause();
        //commander.skip();
        //commander.previous();


        // chain of responsibility Pattern
        // /* a good example is the creation of an error logging system */

        //Request request = new Request(500000);
        //System.out.println("Ask for approval for " + request.getBudget());
        //Handler handler = new TeamManager();
        //System.out.println(handler.handleRequest(request));

        //Request request = new Request(500);
        ///* the root of the chain can be defined by client */
        //System.out.println("Ask for approval for " + request.getBudget() + " directly from CEO");
        //Handler handler = new CEO();
        //System.out.println(handler.handleRequest(request));


        // iterator Pattern
        Container gamesContainer = new GamesContainer();
        Iterator iter = gamesContainer.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        //
        //while (iter.hasPrevious()) {
        //    System.out.println(iter.previous());
        //}
    }

}
