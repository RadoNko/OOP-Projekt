package sk.stuba.fei.oop.services;


import lombok.AllArgsConstructor;
import sk.stuba.fei.oop.insurance.DefaultInsurance;
import sk.stuba.fei.oop.user.Address;
import sk.stuba.fei.oop.user.User;

import java.util.Map;
import java.util.Set;

@AllArgsConstructor
public class UserService{


    private Map<String,User>users;

    public void addUser(User user){
        //this.users.add(user);
        users.put(user.getId(),user);
    }

    public void printAllUsers(){
        users.entrySet().forEach(entry-> System.out.println(entry.getValue()));

        /*for (User user : this.users) {
            System.out.println(user.toString());
        }*/
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public User getUser(String id) {
        if (users.get(id) == null)
            throw new IllegalArgumentException("User not found");
        return users.get(id);

       /* for (User u : users) {
            if (u.getId() == id) return u;
        }
       throw new IllegalArgumentException("User not found");
       */
    }
    public void printUser(String id){
        /*
        if (users.get(id) == null)
            throw new IllegalArgumentException("User not found");
        System.out.println(users.get(id).toString());
        */

        getUser(id).toString();

        /*for (User user : this.users) {
            if (user.getId() == id) {
                System.out.println(user.toString());
                break;
            }
        }*/
    }



    public void editUser(String who,String id, String name, String surname, String email, Address homeAddress, Address postalAddress, Set<DefaultInsurance> contracts){
        User user = getUser(who);

        user.setId(id);
        user.setName(name);
        user.setSurname(surname);
        user.setEmail(email);
        user.setHomeAddress(homeAddress);
        user.setPostalAddress(postalAddress);
        user.setContracts(contracts);
    }

}
