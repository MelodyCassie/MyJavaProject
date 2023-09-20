package FunctionsAssignmentAndPractices;

public class FunctionForCopies {
    public static int calculateCopyPrices(int numberOfCopies){
       int pricePerCopy = 0;
        if(numberOfCopies>=1 && numberOfCopies<=4){
            pricePerCopy = 2000;
            return pricePerCopy * numberOfCopies;
        }
        if(numberOfCopies>=5 && numberOfCopies<=9){
            pricePerCopy = 1800;
            return pricePerCopy * numberOfCopies;
        }
        if(numberOfCopies>=10 && numberOfCopies<=29){
            pricePerCopy = 1600;
            return pricePerCopy * numberOfCopies;
        }
        if(numberOfCopies>=30 && numberOfCopies<=49){
            pricePerCopy = 1500;
            return pricePerCopy * numberOfCopies;
        }
        if(numberOfCopies>=50 && numberOfCopies<=99){
            pricePerCopy = 1300;
            return pricePerCopy * numberOfCopies;
        }
        if(numberOfCopies>=100 && numberOfCopies<=199){
            pricePerCopy = 1200;
            return pricePerCopy * numberOfCopies;
        }
        if(numberOfCopies>=200 && numberOfCopies<=499){
            pricePerCopy = 1100;
            return pricePerCopy * numberOfCopies;
        }
        if(numberOfCopies>=500){
            pricePerCopy = 1000;
            return pricePerCopy * numberOfCopies;
        }
        return pricePerCopy;
    }

    public static void main(String[] args) {
        int purchase = calculateCopyPrices(1);
        System.out.println(purchase);

    }


}
