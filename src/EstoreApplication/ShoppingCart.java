package EstoreApplication;

import java.util.List;

public class ShoppingCart {
    private List <Items> items;
    public ShoppingCart(List<Items> items){
        this.items = items;
    }
    public void setItems(List<Items> items){
        this.items = items;
    }
    public List<Items> items(){
        return items;
    }
}
