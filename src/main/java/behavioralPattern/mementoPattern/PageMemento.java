package behavioralPattern.mementoPattern;

/**
 * Created by Ning on 6/14/18.
 */
public class PageMemento implements Memento{
    private String content;
    private int version;

    public PageMemento(WikiPage wikiPage) {
        this.content = wikiPage.getContent();
        this.version = wikiPage.getVersion();
    }

    public String getContent() {
        return this.content;
    }

    public int getVersion() {
        return this.version;
    }
}
