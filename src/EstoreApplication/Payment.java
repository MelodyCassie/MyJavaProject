package EstoreApplication;

import tdd.Car;

public class Payment {
    private String cardCvv;
    private int cardExpiration;
    private String cardNumber;
    private String nameOnCard;
    private CardType cardType;

    public Payment(String cardCvv, int cardExpiration, String cardNumber, String nameOnCard, CardType cardType) {

        this.cardCvv = cardCvv;
        this.cardExpiration = cardExpiration;
        this.cardNumber = cardNumber;
        this.nameOnCard = nameOnCard;
        this.cardType = cardType;

    }

    public static void main(String[] args) {
        CardType visaCard = CardType.VISACARD;
        Payment myPayment = new Payment("123", 12 / 25, "2838 3791 3717 4845", "Melly", CardType.VISACARD);
    }

}