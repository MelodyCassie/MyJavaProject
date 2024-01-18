package javaChapterExercises;

public class AutoPolicy {
    private int accNumber;
    private String makeAndModel;
    private String carStateAbbreviation;


    public AutoPolicy(int carAccNumber, String makeAndModel, String carStateAbbreviation) {
        this.accNumber = carAccNumber;
        this.makeAndModel = makeAndModel;
        this.carStateAbbreviation = carStateAbbreviation;

    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getCarStateAbbreviation() {
        return carStateAbbreviation;
    }

    public void setCarStateAbbreviation(String carStateAbbreviation) {
        this.carStateAbbreviation = carStateAbbreviation;
    }

    public boolean isNoFaultState() {
        boolean noFaultState;
        switch (getCarStateAbbreviation()){
            case "MA" : case "NJ" : case "NY" : case "PA" :
                noFaultState = true;
                break;
            default:
                noFaultState = false;

        }
        return noFaultState;
    }
}
