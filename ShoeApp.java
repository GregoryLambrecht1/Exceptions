package exceptions;

public class ShoeApp {
    public static void main(String[] args) throws BlueColourException {
        try {
            Shoes shoe1 = new Shoes("nike","blue",100);
        }catch (BlueColourException b) {
            System.out.println(b.getMessage());
            b.printStackTrace();
        }
    }
}
