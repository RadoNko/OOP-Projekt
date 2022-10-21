package sk.stuba.fei.oop.insurance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sk.stuba.fei.oop.user.User;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class DefaultInsurance {

    private String contractId;
    private Date contractCreation;
    private User contractor;
    private Date insuranceStart;
    private Date insuranceEnd;
    private int insuranceAmount;
    private int monthlyFee;

    public void setInsuranceAmount(int insuranceAmount) {
        if (insuranceAmount < 0)
            throw new IllegalArgumentException("InsuranceAmount cant be < 0");

        this.insuranceAmount = insuranceAmount;
    }

    public void setMonthlyFee(int monthlyFee) {
        if (monthlyFee < 0){
            throw new IllegalArgumentException("MonthlyFee cant be < 0");
        }
        this.monthlyFee = monthlyFee;
    }
}
