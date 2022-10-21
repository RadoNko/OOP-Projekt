package sk.stuba.fei.oop.services;

import lombok.AllArgsConstructor;
import sk.stuba.fei.oop.insurance.DefaultInsurance;
import sk.stuba.fei.oop.user.User;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
public class InsuranceService{
    
    public void createInsurance(User user,DefaultInsurance insurance){
        user.getContracts().add(insurance);
    }
    public DefaultInsurance getInsuranceByID(Set<DefaultInsurance> contracts,String contractID){
        for (DefaultInsurance i: contracts) {
            if (i.getContractId() == contractID) return i;
        }

        throw new IllegalArgumentException("Contract not found");
    }
    public void editInsurance(User who, String contractID,Date contractCreation,Date insuranceStart,Date insuranceEnd,int insuranceAmount,int monthlyFee){

        DefaultInsurance insurance = getInsuranceByID(who.getContracts(),contractID);

        insurance.setContractId(contractID);
        insurance.setContractCreation(contractCreation);
        insurance.setInsuranceStart(insuranceStart);
        insurance.setInsuranceEnd(insuranceEnd);
        insurance.setInsuranceAmount(insuranceAmount);
        insurance.setMonthlyFee(monthlyFee);
    }

    public void printAllInsurances(UserService users){

        Set<DefaultInsurance>contracts = new HashSet<>();
        users.getUsers().entrySet().forEach(entry-> contracts.addAll(entry.getValue().getContracts()));

        System.out.println(contracts.toString());
    }
    public void printByID(UserService userService,String id){
        User user = userService.getUser(id);
        System.out.println(user.getContracts().toString());
    }

}
