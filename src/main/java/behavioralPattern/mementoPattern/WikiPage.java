package behavioralPattern.mementoPattern;

/**
 * Created by Ning on 6/14/18.
 */
public class WikiPage {
    private String content;
    private int version;
    private int next;
    private MementoManager manager;

    public WikiPage() {
        manager = new MementoManager();
        next = 0;
    }

    public PageMemento createMemento() {
        return new PageMemento(this);
    }

    /**
     * restore the content and the version
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.content = memento.getContent();
        this.version = memento.getVersion();
    }

    public String getContent() {
        return content;
    }

    public int getVersion() {
        return version;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setPage(String content) {
        setContent(content);
        setVersion(next++);
        Memento cur = createMemento();
        manager.setMemento(cur);
    }

    public MementoManager getManager() {
        return manager;
    }

    public void save() {
        setVersion(next++);
        Memento cur = createMemento();
        manager.setMemento(cur);
    }

    public void print() {
        System.out.println("current content: " + getContent() + "; current version: " + getVersion());
    }
}
