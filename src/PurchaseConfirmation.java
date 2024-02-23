import java.util.ArrayList;

public class PurchaseConfirmation {

    //region Setting the shoppingCart by a setter or through the constructor
    /*
    private ShoppingCart shoppingCart = null;

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public PurchaseConfirmation(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    */
    //endregion


    /**
     * Print all the product descriptions
     * And the Total purchase price
     */
    public void confirmationEmail(ShoppingCart shoppingCart)
    {
        double totPrice = 0;
        ArrayList<Product> items = shoppingCart.getItems();
        for( Product p : items )
        {
            System.out.println(p.getDescription());
            totPrice += p.getPrice();
        }
        System.out.println("Purchase Price : " + totPrice);
    }

}
