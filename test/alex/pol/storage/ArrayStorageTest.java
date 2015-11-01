package alex.pol.storage;

public class ArrayStorageTest extends AbstractStorageTest {
    //  private static Resume R1, R2, R3;


    {

    storage = new ArrayStorage();
    }


//    static {
//        R1 = new Resume("Полное Имя1", "location1");
//        R1.addContact(new Contact(ContactType.MAIL, "mail1@ya.ru"));
//        R1.addContact(new Contact(ContactType.PHONE, "11111"));
//        R2 = new Resume("Полное Имя2", null);
//        R2.addContact(new Contact(ContactType.SKYPE, "skype2"));
//        R2.addContact(new Contact(ContactType.PHONE, "22222"));
//        R3 = new Resume("Полное Имя3", null);
//    }

//    @BeforeClass
//    public static void beforeClass() {}
//        // the same as static {}
//        public static void beforeClass () {
//@BeforeClass
//public static void beforeClass() {
//    // the same as static {}
//}



//    @Test
//    public void testSave() throws Exception {
//
//    }
//
//    @Test
//    public void testClear()  {
//
//        storage.clear();
//        Assert.assertEquals(0, storage.size());
//    }
//
//    @Test(expected = WebAppException.class)
//    public void testClearException()  {
//
//        storage.clear();
//        Assert.assertEquals(0, storage.size());
//    }
//
//    @Test
//    public void testUpdate() throws Exception {
//
//        R2.setFullName("Updated N2");
//        storage.update(R2);
//        Assert.assertEquals(R2, storage.load(R2.getUuid().toString()));
//    }
//
//    @Test
//    public void testLoad() throws Exception {
//        Assert.assertEquals(R1, storage.load(R1.getUuid().toString()));
//        Assert.assertEquals(R2, storage.load(R2.getUuid().toString()));
//        Assert.assertEquals(R3, storage.load(R3.getUuid().toString()));
//    }
//
//    @Test(expected = WebAppException.class)
//    public void testDeleteNotFound() throws Exception {
//        storage.load("dummy");
//    }
//    @Ignore
//    @Test
//    public void testDelete()  {
//        storage.delete(R1.getUuid().toString());
//        Assert.assertEquals(2, storage.size());
//        Assert.assertEquals(null, storage.load(R1.getUuid().toString()));
//    }
//
//    @Test
//    public void testGetAllSorted() throws Exception {
//
//        Resume[] src = new Resume[]{R1, R2, R3};
//        Arrays.sort(src);
//        Assert.assertArrayEquals(src, storage.getAllSorted().toArray());
//    }
//
//    @Test
//    public void testSize() throws Exception {
//        Assert.assertEquals(3, storage.size());
//    }
}

//public class ArrayStorageTest {
//    private static Resume r1, r2, r3;
//    ArrayStorage storage = new ArrayStorage();
//
//    @BeforeClass
//    public static void beforeClass() {
//
//        Contact c1= new Contact(ContactType.PHONE,"123-33-55");
//        Contact c2= new Contact(ContactType.SKYPE,"rew");
//        Contact c3= new Contact(ContactType.PHONE,"123-99-55");
//        r1 = new Resume("Флек Ясаек", "нет");
//        r1.addContacts(c1);
//        r2 = new Resume( "Игор Петро", "москва");
//        r2.addContacts(c2);
//        r3 = new Resume( "Вася Пув", "омск");
//        r3.addContacts(c3);
//
//
//    }
//    @Before
//      public void before() throws Exception {
//        storage.clear();
//        storage.save(r1);
//        storage.save(r2);
//        storage.save(r3);
//
//
//
//    }
//
//    @Test
//    public void testClear() throws Exception {
//        Resume[] r = new Resume[storage.getLimit()];
//        storage.clear();
//        Assert.assertArrayEquals(r,storage.array());
//
//    }
//
//    @Test(expected=IllegalArgumentException.class)
//    public void testSave() throws Exception {
//
//        storage.save(r1);
//
//
//    }
//
//    @Test
//    public void testUpdate() throws Exception {
//        r1.addContacts(new Contact(ContactType.FACEBOOK,"faceb"));
//        storage.update(r1);
//        Contact[]contacts1 = {new Contact(ContactType.PHONE,"123-33-55"),
//                new Contact(ContactType.FACEBOOK,"faceb")};
//        Contact[]contacts2= {new Contact(ContactType.SKYPE,"rew")};
//
//        Assert.assertArrayEquals(contacts1,r1.getContacts().toArray());
//        Assert.assertArrayEquals( contacts2,r2.getContacts().toArray());
//
//
//
//    }
//
//    @Test
//    public void testLoad() throws Exception {
//
//    }
//
//    @Test
//    public void testDelete() throws Exception {
//        System.out.println(r3.getUuid().toString());
//        storage.delete(r3.getUuid().toString());
//
//
//       // Assert.assertNull(r3);
//        Assert.assertNotNull(r1);
//        //Assert.assertNotNull(r2);
//       // Assert.assertNotNull(r3);
//
//    }
//
//    @Test
//    public void testGetAllSorted() throws Exception {
//        storage.getAllSorted();
//        Resume[] r = new Resume[storage.getLimit()];
//        r[0]=r3;
//        r[1]=r2;
//        r[2]=r1;
//
//
//        Assert.assertArrayEquals(r,storage.array());
//
//    }
//
//    @Test
//    public void testSize() throws Exception {
//
//        Assert.assertEquals(3,storage.size());
//
//    }
//}
