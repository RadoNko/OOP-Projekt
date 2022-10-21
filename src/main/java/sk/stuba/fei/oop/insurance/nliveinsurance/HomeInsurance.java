package sk.stuba.fei.oop.insurance.nliveinsurance;

import lombok.AllArgsConstructor;
import lombok.Data;
import sk.stuba.fei.oop.user.Address;

@Data
@AllArgsConstructor
public class HomeInsurance extends NonLiveInsurance {
    private PropertyTypeDial dial;
    private Address homeAdress;
    private int homeValue;
    private int homeEquipmentValue;

}
