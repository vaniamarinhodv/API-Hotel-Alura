package hotelaluracom.example.Hotel.alura.Controller;


import hotelaluracom.example.Hotel.alura.Repository.HospedeRepository;
import hotelaluracom.example.Hotel.alura.entity.Hospede;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("hospedes")
public class HospedeController {
    @Autowired
    HospedeRepository hospedeRepository;
    @PostMapping("create")
    private ResponseEntity<Hospede> insert(@RequestBody Hospede hospede){
        return ResponseEntity.ok().body(hospedeRepository.save(hospede));
    }

    @GetMapping("find")
    private ResponseEntity<List<Hospede>> listAll(){
        return ResponseEntity.ok().body(hospedeRepository.findAll());
    }

    @GetMapping(value = "find", params = "id")
    private ResponseEntity<Optional<Hospede>> findById(@RequestParam Integer id){
        return ResponseEntity.ok().body(hospedeRepository.findById(id));
    }

    @PutMapping("alter")
    private ResponseEntity<Hospede> alter(@RequestBody Hospede hospede){
        return  ResponseEntity.ok().body(hospedeRepository.save(hospede));
    }

    @DeleteMapping(value = "delete", params = "id")
    private ResponseEntity deleteHospede(@RequestParam Integer id){
        hospedeRepository.deleteById(id);
        return ResponseEntity.ok().body("hospede deletado");
    }
}
