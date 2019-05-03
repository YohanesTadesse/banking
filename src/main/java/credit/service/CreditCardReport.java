package credit.service;

import credit.entity.CreditCardAccount;
import framework.service.Report;

import java.util.Date;

public class CreditCardReport implements Report {

    private Date from;
    private Date to;
    private CreditCardAccount account;

    public CreditCardReport(CreditCardAccount account, Date from, Date to) {
        this.account = account;
        this.from = from;
        this.to = to;
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();

        report.append("Credit card report of " + account.getAccountNumber() + " for " + to.getMonth());

        return report.toString();
    }
}
