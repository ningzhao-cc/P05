package behavioralPattern.iteratorPattern;

/**
 * Created by Ning on 6/14/18.
 */
public class GamesIterator implements Iterator {
    private Container container;
    private int pos = -1;

    public GamesIterator(Container container) {
        this.container = container;
    }

    @Override
    public boolean hasNext() {
        if (container != null && pos < container.size() - 1) {
            return true;
        }
        else return false;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return container.get(++pos);
        }
        else return null;
    }

    @Override
    public Object first() {
        if (container != null && container.size() > 0) {
            return container.get(0);
        }
        else return null;
    }

    @Override
    public Object last() {
        if (container != null && container.size() > 0) {
            return container.get(container.size() - 1);
        }
        else return null;
    }

    @Override
    public boolean hasPrevious() {
        if (container != null && pos > 0) {
            return true;
        }
        else return false;
    }

    @Override
    public Object previous() {
        if (hasPrevious()) {
            return container.get(--pos);
        }
        else return null;
    }

}
