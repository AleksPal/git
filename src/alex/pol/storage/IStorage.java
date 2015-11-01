package alex.pol.storage;

import alex.pol.model.Resume;

import java.util.Collection;

/**
 * Created by Alex on 20.10.2015.
 */
public interface IStorage {

    void clear();

    void save(Resume r) ;

    void update(Resume r);

    Resume load(String uuid);

    void delete(String uuid);

    Collection<Resume> getAllSorted();

    int size();
}
