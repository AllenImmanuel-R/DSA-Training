interface InsuranceAgent {
    default void hello()
    {
        System.out.println("Hello from InsuranceAgent");
    }

    String agentName = "Insurance Agent";
    void calculatePremium();
    void calculateReturns();
}

public class BankInter implements InsuranceAgent {

    private double agentSalary;

    public BankInter(double salary) {
        this.agentSalary = salary;
    }

    public void calculatePremium() {
        System.out.println("Calculating premium for agent: " + agentName);
        double premium = agentSalary * 0.1;
        System.out.println("Premium: " + premium);
    }

    public void calculateReturns() {
        System.out.println("Calculating returns for agent: " + agentName);
        double returns = agentSalary * 0.05;
        System.out.println("Returns: " + returns);
    }

    public static void main(String[] args) {
        BankInter bankAgent = new BankInter(50000);
        bankAgent.hello();
        bankAgent.calculatePremium();
        bankAgent.calculateReturns();
    }
}
