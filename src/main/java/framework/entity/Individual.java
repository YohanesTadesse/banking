package framework.entity;


import java.util.Date;


public class Individual extends Customer {
    private Date birthdate;
    public Individual(String customerId, String name, Date birthdate, Address address) {
        super(customerId, name, address);
        this.birthdate = birthdate;
    }

    public Date getBirthdate() {
        return birthdate;
    }
}
