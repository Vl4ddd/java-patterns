package socnet.socnet.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import socnet.socnet.DTO.User.PublicationDTO;
import socnet.socnet.Iterator.PublicationIterator;
import socnet.socnet.Iterator.Collections.PublicationCollection;

@Service
public class PublicationService {

    private final PublicationCollection publicationCollection = new PublicationCollection();
    private int currentId = 1; 

    public PublicationIterator getAllPublications() {
        return publicationCollection.iterator(); 
    }

    public Optional<PublicationDTO> getPublicationById(int id) {
        PublicationIterator iterator = getAllPublications();
        while (iterator.hasNext()) {
            PublicationDTO publication = iterator.next();
            if (publication.getIdPubclication() == id) {
                return Optional.of(publication);
            }
        }
        return Optional.empty();
    }

    public PublicationDTO createPublication(PublicationDTO publicationDTO) {
        publicationDTO.setIdPubclication(currentId++);
        publicationCollection.addPublication(publicationDTO);
        return publicationDTO;
    }

    public Optional<PublicationDTO> updatePublication(int id, PublicationDTO publicationDTO) {
        Optional<PublicationDTO> existingPublication = getPublicationById(id);
        if (existingPublication.isPresent()) {
            publicationDTO.setIdPubclication(id);
            publicationCollection.removePublication(existingPublication.get());
            publicationCollection.addPublication(publicationDTO);
            return Optional.of(publicationDTO);
        }
        return Optional.empty();
    }

    public boolean deletePublication(int id) {
        PublicationIterator iterator = getAllPublications();
        while (iterator.hasNext()) {
            PublicationDTO publication = iterator.next();
            if (publication.getIdPubclication() == id) {
                publicationCollection.removePublication(publication);
                return true;
            }
        }
        return false;
    }

}
