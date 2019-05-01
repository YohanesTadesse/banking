package framework.entity;

import java.util.Date;

public class Transaction {
    private Double amount;
    private Date date;
    private String description;

    public Transaction(Double amount, Date date, String description) {
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}
