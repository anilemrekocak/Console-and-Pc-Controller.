public class Xbox implements GameControllerxbox{
    public boolean powerOn; // Cihazın gücünün açık veya kapalı olduğunu tutan değişken

    public Xbox() {
        powerOn = false; // Cihazın gücü varsayılan olarak kapalıdır (false). Constructor
    }

    @Override
    public void Pass() {
        // PlayStation oyun kumandası için Pass metodu
    }

    @Override
    public void Shot() {
        // PlayStation oyun kumandası için Shot metodu
    }

    @Override
    public void open() {
        if (powerOn) {
            throw new IllegalStateException("Xbox is already powered on.");
        }
        System.out.println("Xbox is powering on...");
        powerOn = true;
    }

    @Override
    public void vpass() {
        // PlayStation oyun kumandası için vpass metodu
    }

    // Cihazı kapatmak için kullanılan metot
    public void shutdown() {
        if (!powerOn) {
            throw new IllegalStateException("Xbox is already powered off.");
        }
        System.out.println("Xbox is shutting down...");
        powerOn = false;
    }

    public void addmethod(){

    }

    public void playGame(){
        System.out.println("Game is Started");

        if (!powerOn){
            throw new IllegalStateException("is already shotdown");
        }
    }
}