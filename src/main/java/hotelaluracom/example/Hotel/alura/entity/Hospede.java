package hotelaluracom.example.Hotel.alura.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Hospede {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int id;
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private String nacionalidade;
    private String telefone;
    private int reservaId;

    public void setDataNascimento(String data) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(data);
        this.dataNascimento = dataFormatada;
    }
}
