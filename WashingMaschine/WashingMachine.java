package WashingMaschine;

public interface WashingMachine {
    default void start() {
        System.out.println("Start Wash");
    }

    default void setLaundryType(LaundryType laundryType) {

    }

    default int getMinutesTillEnd() {
        return 20;
    }

}

 //  enum LaundryType{
 //  WOOL, POLYESTER, MIXED

