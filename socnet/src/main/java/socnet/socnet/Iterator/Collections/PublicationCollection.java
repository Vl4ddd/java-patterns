package socnet.socnet.Iterator.Collections;

import java.util.ArrayList;
import java.util.List;

import socnet.socnet.Iterator.PublicationIterator;
import socnet.socnet.DTO.User.PublicationDTO;

public class PublicationCollection{

    private List<PublicationDTO> publications = new ArrayList<>();

    public void addPublication(PublicationDTO publication) {
        publications.add(publication);
    }

    public void removePublication(PublicationDTO publication) {
        publications.remove(publication);
    }

    public PublicationIterator iterator() {
        return new PublicationCollectionIterator();
    }

    private class PublicationCollectionIterator implements PublicationIterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < publications.size();
        }

        @Override
        public PublicationDTO next() {
            if (!hasNext()) {
                throw new IndexOutOfBoundsException("No more publications");
            }
            return publications.get(index++);
        }
    }
    

}
