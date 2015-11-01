package alex.pol.model;

import java.util.List;

/**
 * Created by Alex on 20.10.2015.
 */
public class MultiTextSection {
    private List<String> multitext;

    public MultiTextSection(List<String> multitext) {
        this.multitext = multitext;
    }

    public List<String> getMultitext() {
        return multitext;
    }

    @Override
    public String toString() {
        return "MultiTextSection{" +
                "multitext=" + multitext +
                '}';
    }
}
