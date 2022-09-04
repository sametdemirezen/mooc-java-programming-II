
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        history = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        history.add(initialBalance);
        
    }
    
    public String history(){
        return history.toString();
    }
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        history.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount){
        if (amount > super.getBalance()){
            amount = super.getBalance();
        }
        super.takeFromWarehouse(amount);
        history.add(super.getBalance());
        return amount;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName() +  "\n" +  
                "History: " + history.toString() + "\n"+
                "Largest amount of product: " + history.maxValue() + "\n" +
                "Smallest amount of product: " + history.minValue() +"\n"+
                "Average: " + history.average()       ); 
    }
}
