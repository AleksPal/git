package alex.pol.model;

/**
 * Created by Alex on 20.10.2015.
 */
public class Organization {
    private Link link;
    private Period period;

    public Organization(Link link, Period period) {
        this.link = link;
        this.period = period;
    }

    public Link getLink() {
        return link;
    }

    public Period getPeriod() {
        return period;
    }

    @Override
    public String toString() {
        return
                "link=" + link +
                ", period=" + period +
                '}';
    }
}
