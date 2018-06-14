package behavioralPattern.iteratorPattern;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ning on 6/14/18.
 */
public class GamesContainer implements Container {
    final private List<String> games = Arrays.asList("Super Mario", "LOL", "DOTA2", "2K18", "FIFA");

    @Override
    public Iterator iterator() {
        return new GamesIterator(this);
    }

    @Override
    public Object get(int i) {
        return games.get(i);
    }

    @Override
    public int size() {
        return games.size();
    }
}
