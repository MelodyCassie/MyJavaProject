package EstoreApplication;

import java.util.List;

public class BillingInformation {
    private List<BillingInformation> billingInformations;
    private String receiverPhoneNumber;

    public BillingInformation(List<BillingInformation> billingInformation, String receiverPhoneNumber) {
        this.billingInformations = billingInformation;
        this.receiverPhoneNumber = receiverPhoneNumber;
    }
    public void setBillingInformation(List<BillingInformation> billingInformation){
        this.billingInformations = billingInformation;
    }
    public List<BillingInformation> getBillingInformation(){
        return billingInformations;
    }
    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
    }
    public String getReceiverPhoneNumber(){
        return receiverPhoneNumber;
    }
}
