/* Aayan Faisal
    6/30/2026
    JDK 26
    Practice with setters and getters
 */
package dogcreator;

public class DogCreator {

    public static void main(String[] args) {
        Dog dog1=new Dog("Ollie",18);
        Dog dog2=new Dog("Ernie", 25);
        Dog dog3=new Dog("Little Girl", 300);
        System.out.println("Name: "+dog1.getName());
        System.out.println("Weight: "+dog1.getWeight());
        System.out.println("Name: "+dog2.getName());
        System.out.println("Weight: "+dog2.getWeight());
        System.out.println("Name: "+dog3.getName());
        System.out.println("Weight: "+dog3.getWeight());
        
        System.out.println(dog1.compare(dog2));
        System.out.println(dog1.compare(dog3));
        System.out.println(dog3.compare(dog2));
        
        dog3.setWeight(23);
        System.out.println(dog3.getName()+" now weighs "+dog3.getWeight());
        System.out.println(dog1.compare(dog3));
        System.out.println(dog3.compare(dog2));
    }
}
