package src.product;

public class ProductModel {
    private String barCode;
    private String name;
    private int priceInCents;
    private int stock;

    ProductModel(String code, String name, int price, int stock){
        this.barCode = code;
        this.name = name;
        this.priceInCents = price;
        this.stock = stock;
    }

    public String getBarCode(){
        return this.barCode;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPriceInCents(int price){
        this.priceInCents = price;
    }

    public int getPriceInCents(){
        return this.priceInCents;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public int getStock(){
        return this.stock;
    }
}
