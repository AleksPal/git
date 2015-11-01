package alex.pol.model;

/**
 * Created by Alex on 18.10.2015.
 */
public class Section {
    SectionType type;

    public Section(SectionType type) {
        this.type = type;
    }

    public SectionType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Section{" +
                "type=" + type +
                '}';
    }
}
