/* Aayan Faisal
    6/30/2026
    JDK 26
    Practice with setters and getters
 */
package dogcreator;

public class Dog {
    //instance variables
    private String name=null;
    private double weight=0;
    
    public Dog(String newName, double newWeight){
        name=newName;
        weight=newWeight;
    }
    public void setName(String newName){
        name=newName;
    }
    public void setWeight(double newWeight){
        if(newWeight>0){
            weight=newWeight;
        }else{
            System.out.println("Weight cannot be zero or negative");
        }
    }
    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }
    public String compare(Dog dogCompare){
        String message=null;
        if(dogCompare.weight>this.weight){
            message = dogCompare.name+" weighs more than "+this.name;
        }else if(dogCompare.weight<this.weight){
            message = this.name+" weighs more than "+dogCompare.name;
        }else{
            message = "The dogs weights are equal.";
        }
        return message;
    }
}
