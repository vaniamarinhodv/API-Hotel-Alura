package hotelaluracom.example.Hotel.alura.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Reserva {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int id;
    private Date dataEntrada;
    private Date dataSaida;
    private Double valor;
    private String formaPagamento;

    public void setDataEntrada(String data) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(data);
        this.dataEntrada = dataFormatada;
    }
    public void setDataSaida(String data) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(data);
        this.dataSaida = dataFormatada;
    }

}
