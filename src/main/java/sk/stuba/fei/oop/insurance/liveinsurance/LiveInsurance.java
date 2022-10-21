package sk.stuba.fei.oop.insurance.liveinsurance;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sk.stuba.fei.oop.insurance.DefaultInsurance;
import sk.stuba.fei.oop.user.User;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class LiveInsurance extends DefaultInsurance {

    private User customer;

}
