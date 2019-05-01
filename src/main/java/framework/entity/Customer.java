package framework.entity;

import java.util.List;


public abstract class Customer {
    private String id;
    private String name;
    private Address address;

    private List<Account> accountList;

    public Customer(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }
    public List<Account> getAccounts() {
        return accountList;
    }
}
