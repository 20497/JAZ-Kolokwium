package pjatk.edu.pl.jaz20497nbp.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rate {
    public String no;
    public String effectiveDate;
    public double mid;

    public Rate() {

    }
    public Rate(String no, String effectiveDate, Double mid) {
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.mid = mid;
    }
}
