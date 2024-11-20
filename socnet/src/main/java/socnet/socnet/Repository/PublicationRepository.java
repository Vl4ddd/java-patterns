package socnet.socnet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import socnet.socnet.DTO.User.PublicationDTO;


public interface PublicationRepository extends JpaRepository<PublicationDTO, Integer> {
}
