package exceptions;

public class Shoes {
    private String brand;
    private String colour;
    private int price;

    public Shoes(String brand, String colour, int price) throws BlueColourException {
        this.brand = brand;
       this.setColour(colour);
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) throws BlueColourException {
        if(colour == "blue") throw new BlueColourException("blue is ugly");
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
