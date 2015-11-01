package alex.pol.model;

import java.util.List;

/**
 * Created by Alex on 20.10.2015.
 */
public class TextSection extends Section {
   private String text;

    public TextSection(String text,SectionType sectionType) {
        super(sectionType);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "TextSection{" +
                "text='" + text + '\'' +
                '}';
    }
}
