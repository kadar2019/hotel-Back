package simplon.co.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import simplon.co.entities.Hotel;

@CrossOrigin
@RepositoryRestResource
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
