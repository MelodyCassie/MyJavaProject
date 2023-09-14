package tdd;

public class PetrolPurchase{

    private String name;
    private String location;
    private String petrolType;
    private int quantityPurchaseLiter;
    private double pricePerLiter;
    private double percentageDiscount;

    public PetrolPurchase(String name, String location,
                          String petrolType, int quantityPurchaseLiter,
                          double pricePerLiter, double percentageDiscount) {

    }

    public PetrolPurchase() {

    }
    public void setName(String name){
        this.name = name;
    }

    public void setLocation(String location){
        this.location = location;
    }
    public void setPetrolType(String petrolType){
        this.petrolType = petrolType;
    }
    public void setQuantityPurchaseLiter(int quantityPurchaseLiter){
        this.quantityPurchaseLiter = quantityPurchaseLiter;
    }
    public void setPricePerLiter(double pricePerLiter){
        this.pricePerLiter = pricePerLiter;
    }
    public void setPercentageDiscount(double percentageDiscount){
        this.percentageDiscount = percentageDiscount;
    }


    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public String getPetrolType(){
        return petrolType;
    }
    public int getQuantityPurchaseLiter(){
        return quantityPurchaseLiter;
    }
    public double getPricePerLiter() {
        return pricePerLiter;
    }
    public double getPercentageDiscount(){
        return percentageDiscount;
    }

    public double getPurchaseAmount(){

        double netAmount = (quantityPurchaseLiter * pricePerLiter) - (percentageDiscount);
        return netAmount;
    }

}
