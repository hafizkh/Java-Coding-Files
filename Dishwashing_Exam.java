public class Dishwashing_Exam {
    public static void main(String[] args) {
        Dishwasher dishwasher = new Dishwasher(1,false);
        dishwasher.printData();
        dishwasher.setProgram(3);
        System.out.println(dishwasher.setOn(true));


    }
}
class Dishwasher{
    int program;
    boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public boolean setOn(boolean on) {
        isOn = on;
        return on;
    }

    public int setProgram(int program){
        if(program == 1){
            System.out.println("normal");
        }
        else if(program == 2){
            System.out.println("auto");
        }
        else if (program == 3){
            System.out.println("Intensive");
        }
        return program;
    }
    public Dishwasher(int program, boolean isOn){
        this.isOn = isOn;
        this.program = program;
    }

    public void turnOnOff(){

        isOn = !isOn;

    }
    public void printData(){
        System.out.println("Is the dishwasher on: " + isOn+ "\n"+
                "program: "+program );
    }

}
