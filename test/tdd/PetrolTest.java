package tdd;

public class PetrolTest {
    public static void main(String[] args) {

        PetrolPurchase petrol = new PetrolPurchase();

        petrol.setName("Abc Petrol");
        String name = petrol.getName();
        System.out.println(name);

        petrol.setLocation("Australia");
        String location = petrol.getLocation();
        System.out.println(location);

        petrol.setPetrolType("Premium");
        String type = petrol.getPetrolType();
        System.out.println(type);

        petrol.setQuantityPurchaseLiter(100);
        int quantityPurchase = petrol.getQuantityPurchaseLiter();
        System.out.println(quantityPurchase);

        petrol.setPricePerLiter(5.8);
        double price = petrol.getPricePerLiter();
        System.out.println(price);

        petrol.setPercentageDiscount(10.0);
        double discount = petrol.getPercentageDiscount();
        System.out.println(discount);

















    }
}
