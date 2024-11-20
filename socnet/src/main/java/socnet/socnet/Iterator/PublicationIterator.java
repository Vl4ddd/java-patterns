package socnet.socnet.Iterator;

import socnet.socnet.DTO.User.PublicationDTO;

public interface PublicationIterator {

    boolean hasNext();
    PublicationDTO next();
}
