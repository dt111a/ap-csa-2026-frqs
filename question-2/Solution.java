public class Bottle {
    double capacity; 
    double currentAmount; 

    public Bottle(double x) {
        capacity = x; 
        currentAmount = capacity; 
    }

    public double updateAmount(double change) {
        currentAmount -= change; 
        if (currentAmount < (capacity*0.25)) {
            currentAmount = capacity; 
        }
        return currentAmount; 
    }
}
