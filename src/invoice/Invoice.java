package invoice;

import java.util.ArrayList;

public class Invoice {
    private int invoices;
    private int customerId;

    public int getInvoice() {
        return invoices;
    }

    public void setInvoice(int invoices) {
        this.invoices = invoices;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoice=" + invoices +
                ", customerId=" + customerId +
                '}';
    }
}
