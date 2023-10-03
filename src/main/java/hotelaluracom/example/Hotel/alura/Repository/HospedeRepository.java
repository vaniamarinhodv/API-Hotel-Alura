package hotelaluracom.example.Hotel.alura.Repository;

import hotelaluracom.example.Hotel.alura.entity.Hospede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HospedeRepository extends JpaRepository<Hospede, Integer> {
}
