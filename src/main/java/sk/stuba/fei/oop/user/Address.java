package sk.stuba.fei.oop.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private int postalNum;
    private String town;
    private String street;
    private int housNo;

    @Override
    public String toString() {
        return town+ " " + street+ " " + housNo + " " + postalNum ;

    }
}
