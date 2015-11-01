package alex.pol.storage;

import alex.pol.model.Resume;

import java.util.*;

/**
 * Created by Alex on 28.10.2015.
 */
public class MapStorage extends AbstractStorage<String> implements IStorage {


    private Map<String, Resume> map = new HashMap<>();


    @Override
    protected String getContex(String uuid) {
        return uuid;
    }

    @Override
    protected boolean check(String uuid) {
        return !map.containsKey(uuid);

    }


    @Override
    protected void doClear() {
        map.clear();
    }

    @Override
    protected void doSave(Resume r) {
        if (r != null) {
            map.put(r.getUuid().toString(), r);
        }
    }

    @Override
    protected void doUpdate(Resume r,String uuid) {

        map.put(uuid, r);
    }

    @Override
    protected Resume doLoad(String uuid) {
        return map.get(uuid);
    }

    @Override
    protected void doDelete(String uuid) {

        map.remove(uuid);
    }

    @Override
    protected Collection<Resume> doSort() {
        List<Resume> list = new ArrayList<>(map.values());
        Collections.sort(list);
        return list;
    }

    @Override
    protected int doSize() {
        return map.size();
    }
}
   /* @Override
    public void clear() {
        logger.info("Delete te resumes");
        map.clear();
    }

    @Override
    public void save(Resume r)   {
        logger.info("Save resume with uuid" + r.getUuid().toString());
        String str = getKey(r.getUuid().toString());

        if (!str.equals(NO)) throw new WebAppException("Resume " + r.getUuid().toString() + "already exist", r);


        if (r != null) {
            map.put(r.getUuid().toString(), r);
        }
    }

    @Override
    public void update(Resume r) {
        logger.info("Update resume with " + r.getUuid().toString());
        String str = getKey(r.getUuid().toString());
        if (str.equals(NO)) throw new WebAppException("Resume " + r.getUuid() + "not exist", r);
        map.put(str, r);


    }


    @Override
    public Resume load(String uuid) {
        logger.info("Load resume with uuid=" + uuid);
        String str = getKey(uuid);
        if (str.equals(NO)) throw new WebAppException("Resume " + uuid + "not exist");
        return map.get(str);

    }
    @Override
    public void delete(String uuid) {
        logger.info("Delete resume with uuid=" + uuid.toString());
        String str = getKey(uuid);
        if (str.equals(NO)) throw new WebAppException("Resume " + uuid + "not exist");
        map.remove(str);


    }

    @Override
    public Collection<Resume> getAllSorted() {

        List<Resume> list = new ArrayList<>(map.values());
        Collections.sort(list);
        return list;
    }

    @Override
    public int size() {
        return map.size();
    }
*/
