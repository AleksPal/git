package alex.pol.storage;

import alex.pol.WebAppException;
import alex.pol.model.Resume;

import java.util.*;
import java.util.logging.Logger;

/**
 * Created by Alex on 20.10.2015.
 */
public class ArrayStorage extends AbstractStorage<Integer> implements IStorage {
    public static final int LIMIT = 100;

    private Resume[] resumes = new Resume[LIMIT];
    private int size;

    @Override
    protected Integer getContex(String uuid) {
        for (int i = 0; i < LIMIT; i++) {
            if (resumes[i] != null) {
                if (resumes[i].getUuid().toString().equals(uuid)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    protected boolean check(Integer index) {
        return index == -1;
    }



    @Override
    protected void doClear() {
        Arrays.fill(resumes, null);
        size = 0;
    }

    @Override
    protected void doSave(Resume r) {
        for (int i = 0; i < LIMIT; i++) {
            if (resumes[i] == null) {
                resumes[i] = r;
            }
        }
        resumes[size++] = r;
    }

    @Override
    protected void doUpdate(Resume r,Integer index) {
        resumes[index] = r;
    }

    @Override
    protected Resume doLoad(Integer index) {
        return resumes[index];
    }

    @Override
    protected void doDelete(Integer index) {
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(resumes, index + 1, resumes, index,
                    numMoved);
        resumes[--size] = null; // clear to let GC do its work
    }

    @Override
    protected Collection<Resume> doSort() {
        Arrays.sort(resumes, 0, size);
        return Arrays.asList(Arrays.copyOf(resumes, size));
    }

    @Override
    protected int doSize() {
        return size;
    }
}
