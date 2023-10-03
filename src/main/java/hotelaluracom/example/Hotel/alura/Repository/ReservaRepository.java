package hotelaluracom.example.Hotel.alura.Repository;

import hotelaluracom.example.Hotel.alura.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}
