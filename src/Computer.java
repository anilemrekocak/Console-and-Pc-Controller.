
public class Computer implements GameControllerPlaystion, GameControllerxbox {

    public boolean powerOn; // Cihazın gücünün açık veya kapalı olduğunu tutan değişken

    public Computer(){
        powerOn = false;

    }

    @Override
    public void Pass() {

    }

    @Override
    public void Shot() {

    }

    public void open() {
        if (powerOn) {
            throw new IllegalStateException("Computer is already powered on.");
        }
        System.out.println("Computer is powering on...");
        powerOn = true;
    }

    @Override
    public void vpass() {

    }


    public void shutdown(){
        if (!powerOn){
            throw new IllegalStateException("Computer is already powered off.");
        }

        System.out.println("Computer is already powered off");
        powerOn = false;
    }

    public void addcontroller(){

    }


    public void playGame(){
        System.out.println("Game is Started");

        if (!powerOn){
            throw new IllegalStateException("is already shotdown");
        }
    }
}
