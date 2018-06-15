package behavioralPattern.mementoPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Ning on 6/14/18.
 */
public class MementoManager {
    /**
     * save the mementos by versions.
     */
    private HashMap<Integer, Memento> map;
    private HashSet<Integer> set;

    public MementoManager() {
        map = new HashMap<>();
        set = new HashSet<>();
    }

    public Memento getMemento(int version) {
        return map.get(version);
    }

    public void setMemento(Memento memento) {
        set.add(memento.getVersion());
        map.put(memento.getVersion(), memento);
    }

    public List<Integer> getAllVersions() {
        return new ArrayList<Integer>(set);
    }
}
