package alex.pol.model;

import java.util.*;

/**
 * Created by Alex on 16.10.2015.
 */
public final class Resume implements Comparable<Resume> {
    private UUID uuid;
    private String fullName;
    private String location;
    private String homePage;
    private Map<ContactType,String> contacts = new EnumMap<>(ContactType.class);
    private List<Section> sections = new LinkedList<>();

    public Resume(String uuid, String fullName, String location, String homePage) {
        this.uuid = UUID.fromString(uuid);
        this.fullName = fullName;
        this.location = location;
        this.homePage = homePage;
    }

    public Resume(String fullName, String location, String homePage) {

        this(UUID.randomUUID().toString(),fullName,location,homePage);
    }

    public Resume(String fullName, String location) {
        this(UUID.randomUUID().toString(),fullName,location,"нет");
    }
    public void setUuid(UUID uuid) {
               this.uuid = uuid;
           }

                public void setFullName(String fullName) {
               this.fullName = fullName;
           }

                public void setLocation(String location) {
                this.location = location;
           }

                public void setHomePage(String homePage) {
                this.homePage = homePage;
           }


    public UUID getUuid() {
        return uuid;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLocation() {
        return location;
    }

    public String getHomePage() {
        return homePage;
    }

    public void addContact(ContactType type, String value) {
        contacts.put(type, value);
    }

    public void addSections(Section section) {
        sections.add(section);
    }

    public String getContact(ContactType type ) {
        return contacts.get(type);
    }

    public List<Section> getSections() {
        return sections;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Resume resume = (Resume) o;

        if (!fullName.equals(resume.fullName)) return false;
        if (homePage != null ? !homePage.equals(resume.homePage) : resume.homePage != null) return false;
        if (!location.equals(resume.location)) return false;
        if (!uuid.equals(resume.uuid)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }

    @Override
    public String toString() {
        return "Resume:" +"\n"+
                "uuid=" + uuid +"\n"+
                " fullName= " + fullName + "\n" +
                " location= " + location + "\n" +
                " homePage= " + homePage + "\n" +
                " contacts= " + contacts +"\n"+
                " sections :  " + sections ;

    }

    @Override
    public int compareTo(Resume o) {
        return fullName.compareTo(o.fullName);
    }
}
