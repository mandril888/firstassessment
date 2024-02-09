import java.math.BigDecimal;

public class SalesPerson extends Employee {
    private double commissionRate;

    public SalesPerson(String name, BigDecimal salary, Employee supervisor, double commissionRate) {
        super(name, salary, supervisor);
        setCommissionRate(commissionRate);
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}
