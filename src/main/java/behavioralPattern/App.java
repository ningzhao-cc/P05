package behavioralPattern;

import behavioralPattern.chainOfResponsibilityPattern.CEO;
import behavioralPattern.chainOfResponsibilityPattern.Handler;
import behavioralPattern.chainOfResponsibilityPattern.Request;
import behavioralPattern.chainOfResponsibilityPattern.TeamManager;
import behavioralPattern.commandPattern.*;
import behavioralPattern.iteratorPattern.Container;
import behavioralPattern.iteratorPattern.GamesContainer;
import behavioralPattern.iteratorPattern.Iterator;
import behavioralPattern.mediatorPattern.ConcreteMediator;
import behavioralPattern.mediatorPattern.Developer;
import behavioralPattern.mediatorPattern.ProductDirector;
import behavioralPattern.mementoPattern.MementoManager;
import behavioralPattern.mementoPattern.WikiPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

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
        //Container gamesContainer = new GamesContainer();
        //Iterator iter = gamesContainer.iterator();
        //
        //while (iter.hasNext()) {
        //    System.out.println(iter.next());
        //}
        //
        ////
        ////while (iter.hasPrevious()) {
        ////    System.out.println(iter.previous());
        ////}


        // mediator Pattern
        // a question : what is the difference between proxy pattern vs mediator pattern
        //ConcreteMediator mediator = new ConcreteMediator();
        //Developer developer = new Developer("cc-server", mediator);
        //ProductDirector pd = new ProductDirector("cc-pd", mediator);
        //
        //mediator.setDev(developer);
        //mediator.setPd(pd);
        //
        //pd.contact("we have a new requirement");
        //developer.contact("no problem, create a ticket");
        //pd.contact("sure, a ticket created");
        //developer.contact("work starts");


        // memento Pattern
        //WikiPage page = new WikiPage();
        //
        //page.setPage("content 0");
        //page.print();
        //page.setPage("content 1");
        //page.print();
        //page.setPage("content 2");
        //page.print();
        //List<Integer> list = page.getManager().getAllVersions();
        //System.out.println("versions : ");
        //for (int i : list) {
        //    System.out.println(i);
        //}
        //
        //page.restoreMemento(page.getManager().getMemento(0));
        //page.print();
        //page.save();
        //page.print();



    }
}
