package socnet.socnet.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import socnet.socnet.DTO.User.PublicationDTO;
import socnet.socnet.Service.PublicationService;

@RestController
@RequestMapping("/api/v1/publication")
public class PublicationController {

    @Autowired
    private PublicationService publicationService;

    @GetMapping
    public List<PublicationDTO> getAllPublications() {
        return publicationService.getAllPublications();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PublicationDTO> getPublicationById(@PathVariable int id) {
        return publicationService.getPublicationById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PublicationDTO> createPublication(@RequestBody PublicationDTO publicationDTO) {
        PublicationDTO createdPublication = publicationService.createPublication(publicationDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPublication);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PublicationDTO> updatePublication(@PathVariable int id,
            @RequestBody PublicationDTO publicationDTO) {
        return publicationService.updatePublication(id, publicationDTO)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePublication(@PathVariable int id) {
        if (publicationService.deletePublication(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
