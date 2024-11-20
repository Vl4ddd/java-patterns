package socnet.socnet.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import socnet.socnet.Repository.PublicationRepository;
import socnet.socnet.DTO.User.PublicationDTO;

public class PublicationService {

    @Autowired
    private PublicationRepository publicationRepository;

    public List<PublicationDTO> getAllPublications() {
        return publicationRepository.findAll();
    }

    public Optional<PublicationDTO> getPublicationById(int id) {
        return publicationRepository.findById(id);
    }

    public PublicationDTO createPublication(PublicationDTO publication) {
        return publicationRepository.save(publication);
    }

    public PublicationDTO updatePublication(int id, PublicationDTO publication) {
        publication.setIdPublication(id);
        return publicationRepository.save(publication);
    }

    public void deletePublication(int id) {
        publicationRepository.deleteById(id);
    }

}
