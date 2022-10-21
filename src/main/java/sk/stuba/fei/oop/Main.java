package sk.stuba.fei.oop;

import sk.stuba.fei.oop.services.InsuranceService;
import sk.stuba.fei.oop.services.UserService;
import sk.stuba.fei.oop.insurance.DefaultInsurance;
import sk.stuba.fei.oop.insurance.nliveinsurance.HomeInsurance;
import sk.stuba.fei.oop.insurance.nliveinsurance.PropertyTypeDial;
import sk.stuba.fei.oop.user.Address;
import sk.stuba.fei.oop.user.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<DefaultInsurance>contracts = new HashSet<DefaultInsurance>();
        UserService userService = new UserService(new HashMap<String,User>());
        InsuranceService insuranceService = new InsuranceService(contracts);

        Address address = new Address(91321,"Trencianska Turna","Za zahradou",826);
        DefaultInsurance insurance = new HomeInsurance(PropertyTypeDial.FAMILYHOUSE_CONCRETE,address,100,100);
        DefaultInsurance insurance2 = new HomeInsurance(PropertyTypeDial.FLAT,address,100,100);
        DefaultInsurance insurance3 = new HomeInsurance(PropertyTypeDial.FLAT,address,300,200);

        userService.addUser(new User("231","Daniel","Jankech","djankech98@gmail.com",address,null,new HashSet<DefaultInsurance>()));
        userService.addUser(new User("232","Daniel","Jankech","djankech98@gmail.com",address,null,new HashSet<DefaultInsurance>()));
        userService.addUser(new User("233","Daniel","Jankech","djankech98@gmail.com",address,null,new HashSet<DefaultInsurance>()));
        insuranceService.createInsurance(userService.getUser("231"),insurance);
        insuranceService.createInsurance(userService.getUser("231"),insurance2);
        insuranceService.createInsurance(userService.getUser("233"),insurance3);

        //userService.printUser("231");
        insuranceService.printAllInsurances(userService);
    }
}
