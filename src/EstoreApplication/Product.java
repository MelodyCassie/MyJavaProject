package EstoreApplication;
public class Product {
    private int productId;
    private String productName;
    private double price;

    private ProductType productType;

    public Product(int productId, String productName, double price, ProductType productType){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.productType = productType;
    }
    public void setProductId(int productId){
        this.productId = productId;
    }
    public int getProductId(){
        return productId;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public String getProductName(){
        return productName;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void setProductType(ProductType productType){
        this.productType = productType;
    }
    public ProductType productType(){
        return productType;
    }



}
