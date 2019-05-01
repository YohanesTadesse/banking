package debit.service;

import debit.entity.BankAccount;
import framework.service.Report;

import java.util.Date;


public class BankReport implements Report {

    private Date from;
    private Date to;
    private BankAccount account;

    public BankReport(BankAccount account, Date from, Date to) {
        this.from = from;
        this.to = to;
        this.account = account;
    }

    @Override
    public String generateReport() {
        StringBuilder report = new StringBuilder();

        report.append("Bank report of " + account.getAccountNumber() + " for " + to.getMonth());

        return report.toString();
    }
}
