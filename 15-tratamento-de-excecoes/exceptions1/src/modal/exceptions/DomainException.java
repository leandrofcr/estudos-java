package modal.exceptions;

import java.io.Serial;

public class DomainException extends Exception {
    @Serial
    private static final long serialVersionUID = -49612472209531588L;

    public DomainException(String msg) {
        super(msg);
    }

}
