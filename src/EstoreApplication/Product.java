package EstoreApplication;
public class Product {
    private int productId;
    private String productName;
    private double price;
    private String productDescription;

    private ProductType productType;
    private String productCategory;

    public Product(int productId, String productName, double price, ProductType productType,String productDescription,String productCategory){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.productType = productType;
        this.productDescription = productDescription;
        this.productCategory = productCategory;

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
    public void setProductDescription(String productDescription){
        this.productDescription = productDescription;
    }
    public String getProductDescription(){
        return productDescription;
    }
    public void setProductCategory(String productCategory){
        this.productCategory = productCategory;
    }
    public String getProductCategory(){
        return productCategory;
    }



}
