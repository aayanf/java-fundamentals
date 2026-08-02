/* Aayan Faisal
    7/1/2026
    JDK 26
    Practice with creating class and setters and getters
 */
package customercreator;

public class Customer {
    private String name="null";
    private int creditScore=300;
    
    public Customer(String newName, int newCreditScore){
        name=newName;
        creditScore=newCreditScore;
    }
    
    public void setName(String newName){
        name=newName;
    }
    
    public String getName(){
        return name;
    }
    
    public void setCreditScore(int newCreditScore){
        if(newCreditScore>300)
            creditScore=newCreditScore;
        else
            creditScore=300;
    }
    
    public int getCreditScore(){
        return creditScore;
    }
    
    public String getCreditRating(){
        if (creditScore>=300 && creditScore<=629)
            return "Bad";
        else if(creditScore>629 && creditScore<=689)
            return "Fair";
        else if(creditScore>689 && creditScore<=719)
            return "Good";
        else 
            return "Excellent";
    }
}