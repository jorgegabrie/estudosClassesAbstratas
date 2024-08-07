package entities;

public class Individual extends TaxPayers {
    private Double healthExpenditures;

    public Individual(){
        super();
    }
    public Individual(String name, Double anualIncome, Double healthExpenditures){
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }
    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if (getAnualIncome() < 20000){
            return getAnualIncome() * 15/100;
        } else {
            return getAnualIncome() * 25/100 - (getHealthExpenditures()/2);
        }
    }
}
