import java.util.ArrayList;

public class Fish_classes_OOP {
    public static void main(String[] args) {

        Fishman2 fishman2 = new Fishman2();

        Salmon2 salmon2 = new Salmon2(2,3);
        Fishman2.youCaught(salmon2);
        Fishman2.youCaught(salmon2);
        Fishman2.youCaught(salmon2);
        Fishman2.youCaught(salmon2);
        Poisonfish2 poisonfish2 = new Poisonfish2(4,5);
        Fishman2.youCaught(poisonfish2);
        fishman2.myBasket();
        fishman2.fishDayInfo();


    }
}
class Fish2{
    private double fishLength;
    private double fishWeight;
    boolean poison;

    public Fish2(double fishLength, double fishWeight){
        this.fishLength = fishLength;
        this.fishWeight = fishWeight;
    }

    public double getFishLength() {
        return fishLength;
    }

    public void setFishLength(double fishLength) {
        this.fishLength = fishLength;
    }

    public double getFishWeight() {
        return fishWeight;
    }

    public void setFishWeight(double fishWeight) {
        this.fishWeight = fishWeight;
    }

    public boolean isPoison() {
        return poison;
    }

    public void setPoison(boolean poison) {
        this.poison = poison;
    }
    public String fishInfo(){
        return "Is poison? " + poison;
    }
}
class Salmon2 extends Fish2{

    public Salmon2(double fishLength, double fishWeight){
        super(fishLength,fishWeight);
        poison = false;

    }
    @Override
    public String fishInfo(){
        return super.fishInfo() + "\nYou fished a Salmon";
    }
}
class Poisonfish2 extends Fish2{

    public Poisonfish2(double fishLength, double fishWeight){
        super(fishLength,fishWeight);
        poison = true;
    }
    public String fishInfo(){
        return super.fishInfo() + "\nYou fished a Poison Fish";
    }
}
class Fishman2{
    int poison = 0;
    int eatable = 0;

    static ArrayList<Fish2> fishlist = new ArrayList();

    public static void youCaught(Fish2 fish2){
        fishlist.add(fish2);
    }
    public void myBasket() {
        System.out.println("In my Basket I have total of: " + fishlist.size());

        for (int i = 0; i < fishlist.size(); i++) {
            System.out.println(i + ": " + fishlist.get(i).fishInfo());
            System.out.println("The Length of the Fish is " + fishlist.get(i).getFishLength() +" cm" +
                    "\nand the Weight of the Fish is: " + fishlist.get(i).getFishWeight() +" kg");

            if (fishlist.get(i).isPoison()){
                poison++;
            }
            else{
                eatable++;
            }
        }
        System.out.println("The Eatable Fish are: " + eatable);
        System.out.println("The Poisonous Fish are: " + poison);
    }
    public void fishDayInfo(){
        if(eatable > poison *3){
            System.out.println("Great Day!");
        }
        else if(eatable <= poison *3 && eatable > poison *2){
            System.out.println("Good day!");
        }
        else if(eatable >= poison*2 && eatable > poison){
            System.out.println("Normal day!");
        }
        else if(eatable <= poison){
            System.out.println("Bad day!");
        }
        else if(poison *3 > eatable){
            System.out.println("Horrible day!");
        }
    }
}
