package socnet.socnet.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import socnet.socnet.DTO.User.PublicationDTO;

public class PublicationService {

    private final List<PublicationDTO> publications = new ArrayList<>();
    private int currentId = 1; 

    public List<PublicationDTO> getAllPublications() {
        return publications;
    }

    public Optional<PublicationDTO> getPublicationById(int id) {
        return publications.stream()
                .filter(publication -> publication.getIdPubclication() == id)
                .findFirst();
    }

    public PublicationDTO createPublication(PublicationDTO publicationDTO) {
        publicationDTO.setIdPubclication(currentId++);
        publications.add(publicationDTO);
        return publicationDTO;
    }

    public Optional<PublicationDTO> updatePublication(int id, PublicationDTO publicationDTO) {
        Optional<PublicationDTO> existingPublication = getPublicationById(id);
        if (existingPublication.isPresent()) {
            publicationDTO.setIdPubclication(id);
            publications.remove(existingPublication.get());
            publications.add(publicationDTO);
            return Optional.of(publicationDTO);
        }
        return Optional.empty();
    }

    public boolean deletePublication(int id) {
        return publications.removeIf(publication -> publication.getIdPubclication() == id);
    }

}
