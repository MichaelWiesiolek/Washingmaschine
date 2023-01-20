package WashingMaschine;




public class Wash {
    public static void main(String[] args) {
        materials("WOOL");
        materials("POLYESTER");
        materials("MIXED");
    }

    private static void materials(String laundry) {
    }

    void laundry(String laundryType){
        switch (laundryType){
            case "WOOl":
                System.out.println("Program WOOL");
                break;
            case "POLYESTER":
                System.out.println("Program POLYESTER");
                break;
            case "MIXED":
                System.out.println("Program Mieszany");
                break;
            default:
                System.out.println("Error 1000");
        }
    }

    }

