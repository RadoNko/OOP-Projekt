package sk.stuba.fei.oop.insurance.nliveinsurance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sk.stuba.fei.oop.insurance.DefaultInsurance;
import sk.stuba.fei.oop.user.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class NonLiveInsurance extends DefaultInsurance {
    private User customer;
}
