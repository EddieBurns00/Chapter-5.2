public class Probability implements ProbabilityCalc, Comparable<Probability>
{
    int favorable;
    double value;
    int total;
    
    public Probability(int tot, int fav) {
        this.total = tot;
        this.favorable = fav;
        this.value = ((double)favorable/total);
    }
    
    public double probabilityAND(Probability p2) {
        return this.value * p2.value;
        
    }
    
    public double probabilityOR(Probability p2, double overlap) {
        return (int) (this.value - p2.value);
        
    }
    
    public int compareTo(Probability p2) {

        if (this.value == p2.value) {
            return 0;
        }
        else if (this.value > p2.value) {
            return 1;
        }
        else {
            return -1;
        }
        
    }

}