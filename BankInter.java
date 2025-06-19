interface InsuranceAgent {
    void calculatePremium();
    void calculateReturns();
}

public class Bankinter implements InsuranceAgent {

    private String agentName;
    private double agentSalary;

    public Bankinter(String name, double salary) {
        this.agentName = name;
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
        Bankinter bankAgent = new Bankinter("Allen", 50000);
        bankAgent.calculatePremium();
        bankAgent.calculateReturns();
    }
}
