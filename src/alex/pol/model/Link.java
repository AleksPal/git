package alex.pol.model;

/**
 * Created by Alex on 20.10.2015.
 */
public class Link {
    String name;
    String URL;

    public Link(String name, String URL) {
        this.name = name;
        this.URL = URL;
    }

    public String getName() {
        return name;
    }

    public String getURL() {
        return URL;
    }

    @Override
    public String toString() {
        return "Link{" +
                "name='" + name + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }
}
