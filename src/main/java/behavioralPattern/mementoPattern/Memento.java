package behavioralPattern.mementoPattern;

/**
 * Created by Ning on 6/14/18.
 */
public class Memento {
    private String content;
    private int version;

    public Memento(WikiPage wikiPage) {
        this.content = wikiPage.getContent();
        this.version = wikiPage.getVersion();
    }

    public String getContent() {
        return this.content;
    }

    public int getVersion() {
        return this.version;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
