interface RBI {
    String parentBank = "RBI";
    double rateOfInterest();

    default void policyNote() {
        System.out.println("RBI has a new Policy issued in 2023");
    }

    static void regulations() {
        System.out.println("RBI has updated new regulations in 2024.");
    }
}

class SBI implements RBI {
    public double rateOfInterest() {
        return 7.6;
    }
}

class Karur implements RBI {

    public double rateOfInterest() {
        return 7.4; }
}

public class Week73 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        Karur karur = new Karur();

        sbi.policyNote();
        RBI.regulations();

        System.out.println("SBI rate of interest: " + sbi.rateOfInterest() + " per annum.");
        System.out.println("Karur rate of interest: " + karur.rateOfInterest() + " per annum.");
    }
}
