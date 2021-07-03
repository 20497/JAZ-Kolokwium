package pjatk.edu.pl.jaz20497nbp.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String currency;
    private String from;
    private String to;
    private Double average;

    public Request() {

    }
    public Request(String currency, String from, String to, Double average) {
        this.currency = currency;
        this.from = from;
        this.to = to;
        this.average = average;
    }
}
