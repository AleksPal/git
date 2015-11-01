package alex.pol.storage;

import alex.pol.WebAppException;
import alex.pol.model.ContactType;
import alex.pol.model.Resume;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Alex on 30.10.2015.
 */
public abstract class AbstractStorageTest {
    private Resume R1, R2, R3, R4;
    protected IStorage storage;

    @Before
    public void before() throws Exception {
        R1 = new Resume("Полное Имя1", "location1");
        R1.addContact(ContactType.MAIL, "mail1@ya.ru");
        R1.addContact(ContactType.PHONE, "11111");
        R2 = new Resume("Полное Имя2", null);
        R2.addContact(ContactType.SKYPE, "skype2");
        R2.addContact(ContactType.PHONE, "22222");
        R3 = new Resume("Полное Имя3", null);
        storage.clear();
        storage.save(R3);
        storage.save(R1);
        storage.save(R2);
//        storage.save(R3);
        R4 = new Resume("Alex Pol", "Vitebsk");
        R4.addContact(ContactType.SKYPE, "Migel");
    }

    @Test
    public void testSave() throws Exception {

    }

    @Test
    public void testClear() {

        storage.clear();
        Assert.assertEquals(0, storage.size());
    }


    @Test
    public void testUpdate() throws Exception {

        R2.setFullName("Updated N2");
        storage.update(R2);
        Assert.assertEquals(R2, storage.load(R2.getUuid().toString()));

    }

    @Test(expected = WebAppException.class)
    public void testUpdateException() throws Exception {

        R4.setFullName("Updated N4");
        storage.update(R4);
        Assert.assertEquals(R4, storage.load(R4.getUuid().toString()));

    }

    @Test
    public void testLoad() throws Exception {
        Assert.assertEquals(R1, storage.load(R1.getUuid().toString()));
        Assert.assertEquals(R2, storage.load(R2.getUuid().toString()));
        Assert.assertEquals(R3, storage.load(R3.getUuid().toString()));
    }

    @Test(expected = WebAppException.class)
    public void testDeleteNotFound() throws Exception {
        storage.load("dummy");
    }

   // @Ignore
    @Test
    public void testDelete() {
        storage.delete(R1.getUuid().toString());
        Assert.assertEquals(2, storage.size());
//        Assert.assertEquals(null, storage.load(R1.getUuid().toString()));
    }

    @Test
    public void testGetAllSorted() throws Exception {

        Resume[] src = new Resume[]{R1, R2, R3};
        Arrays.sort(src);
        Assert.assertArrayEquals(src, storage.getAllSorted().toArray());
    }

    @Test
    public void testSize() throws Exception {
        Assert.assertEquals(3, storage.size());
    }
}
