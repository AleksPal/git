package alex.pol.model;

/**
 * Created by Alex on 20.10.2015.
 */
public class OrganizationSection extends Section {
    private Organization organization;
    private MultiTextSection textSection;

    public OrganizationSection(Organization organization, MultiTextSection textSection,SectionType type) {
        super(type);
        this.organization = organization;
        this.textSection = textSection;
    }

    public Organization getOrganization() {
        return organization;
    }

    public MultiTextSection getTextSection() {
        return textSection;
    }

    @Override
    public String toString() {
        return "OrganizationSection{" +
                "organization=" + organization +
                ", \ntextSection=" + textSection +
                '}';
    }
}
