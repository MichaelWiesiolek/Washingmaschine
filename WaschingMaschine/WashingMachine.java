package WaschingMaschine;

public interface WashingMachine {
    void start();
    void setDuration(int durationInSeconds);
    boolean isFinished();
    void setPower(int power);
    default String getName(){
        return "WashingMachine";
    }
}
