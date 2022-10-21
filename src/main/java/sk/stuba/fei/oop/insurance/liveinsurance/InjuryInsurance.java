package sk.stuba.fei.oop.insurance.liveinsurance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class InjuryInsurance extends LiveInsurance {

    private double permanentDamageReparation;
    private double deathReparation;
    private double dailyHospitalReparation;
    private PurposeDialInjury dialInjury;


}
