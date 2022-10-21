package sk.stuba.fei.oop.insurance.liveinsurance;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class TravelInsurance extends  LiveInsurance {

    private boolean inEU;
    private PurposeDialTravel option;


}
