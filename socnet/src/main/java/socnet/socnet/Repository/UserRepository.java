package socnet.socnet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import socnet.socnet.DTO.User.UserDTO;

public interface UserRepository extends JpaRepository<UserDTO, Integer> {

}
