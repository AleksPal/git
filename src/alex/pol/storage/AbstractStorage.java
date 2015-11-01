package alex.pol.storage;

import alex.pol.WebAppException;
import alex.pol.model.Resume;

import java.util.Collection;
import java.util.logging.Logger;

/**
 * Created by Alex on 28.10.2015.
 */
abstract public class AbstractStorage<T> implements IStorage {
    protected Logger logger = Logger.getLogger(getClass().getName());

    @Override
    public void clear() {
        logger.info("Delete te resumes");
        doClear();
    }
    @Override
    public void save(Resume r) {
        logger.info("Save resume with uuid=" + r.getUuid());
        T t = getContex(r);
        if (!check(t)) throw new WebAppException("Resume " + r.getUuid().toString() + "already exist", r);
        doSave(r);
    }

    @Override
    public void update(Resume r) {
        logger.info("Update resume with " + r.getUuid().toString());
        T t = getContex(r);
        if (check(t)) throw new WebAppException("Resume " + r.getUuid() + "not exist", r);
        doUpdate(r,t);
    }

    @Override
    public Resume load(String uuid) {
        logger.info("Load resume with uuid=" + uuid);
        T t = getContex(uuid);
        if (check(t)) throw new WebAppException("Resume " + uuid + "not exist");
       return doLoad(t);
    }

    @Override
    public void delete(String uuid) {
        logger.info("Delete resume with uuid=" + uuid.toString());
        T t = getContex(uuid);
        if (check(t)) throw new WebAppException("Resume " + uuid + "not exist");
        doDelete(t);
    }

    @Override
    public Collection<Resume> getAllSorted() {
        logger.info("Sorted resumes");
        return doSort();
    }

    @Override
    public int size() {
        logger.info("total resumes");
        return doSize();
    }

    protected abstract boolean check(T t);
    protected abstract  T getContex(String uuid);
    protected abstract void doClear();
    protected abstract void doSave(Resume r);
    protected abstract void doUpdate(Resume r,T t);
    protected abstract Resume doLoad(T t);
    protected abstract void doDelete(T t);
    protected abstract Collection<Resume> doSort();
    protected abstract int doSize();

    private   T getContex(Resume r){
        return getContex(r.getUuid().toString());
    }




}
