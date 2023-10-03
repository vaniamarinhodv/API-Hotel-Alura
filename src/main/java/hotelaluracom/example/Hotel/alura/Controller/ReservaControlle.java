package hotelaluracom.example.Hotel.alura.Controller;


import hotelaluracom.example.Hotel.alura.Repository.ReservaRepository;
import hotelaluracom.example.Hotel.alura.entity.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("reservas")
public class ReservaControlle {
    @Autowired
    ReservaRepository reservaRepository;


    @PostMapping("create")
    private ResponseEntity<Reserva> create(@RequestBody Reserva reserva){
        return ResponseEntity.ok().body(reservaRepository.save(reserva));
    }
    @GetMapping("find")
    private ResponseEntity<List<Reserva>> findAll(){
        return ResponseEntity.ok().body(reservaRepository.findAll());
    }

    @GetMapping(value = "find",params = "id")
    private ResponseEntity<Optional<Reserva>> findAll(@RequestParam int id){
        return ResponseEntity.ok().body(reservaRepository.findById(id));
    }
    @PutMapping("alter")
    private ResponseEntity<Reserva> alter(@RequestBody Reserva reserva){
        return ResponseEntity.ok().body(reservaRepository.save(reserva));
    }

    @DeleteMapping(value = "delete", params = "id")
    private ResponseEntity alter(@RequestParam int id){
        reservaRepository.deleteById(id);
        return ResponseEntity.ok().body("Reserva deletada");
    }
}
