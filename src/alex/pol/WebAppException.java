package alex.pol;

import alex.pol.model.Resume;

/**
 * Created by Alex on 28.10.2015.
 */

public class WebAppException extends RuntimeException {
    private Resume resume ;
    private String uuid ;

    public WebAppException(String message) {
        super(message);
    }

    public WebAppException(String message, Throwable e) {
        super(message, e);
    }

    public WebAppException(String message, Resume resume) {
        super(message);
        this.resume = resume;
    }

    public WebAppException(String message, Resume resume, Throwable e) {
        super(message, e);
        this.resume = resume;
    }

    public WebAppException(String message, String uuid) {
        super(message);
        this.uuid = uuid;
    }

    public Resume getResume() {
        return resume;
    }



    public String getUuid() {
        return uuid;
    }
}

