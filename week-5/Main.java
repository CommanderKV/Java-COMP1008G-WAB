public class Main {
    public static void main(String[] args) {
        Component component1 = new Component("motherboard","Asus",429.99);
        System.out.println("component1 Expected output: motherboard-Asus, price: $429.99");
        System.out.println("component1 Actual output:   "+component1+"\n");

        Component component2 = new Component("processor","Intel",519.99);
        System.out.println("component2 Expected output: processor-Intel, price: $519.99");
        System.out.println("component2 Actual output:   "+component2+"\n");

        Component component3 = new Component("case","Cooler Master",289.99);
        System.out.println("component3 Expected output: case-Cooler Master, price: $289.99");
        System.out.println("component3 Actual output:   "+component3+"\n");

        Component component4 = new Component("fan","Arctic",52.99);
        System.out.println("component4 Expected output: fan-Arctic, price: $52.99");
        System.out.println("component4 Actual output:   "+component4+"\n");

        Component component5 = new Component("video card","Nvidia",2100.99);
        Component component6 = new Component("keyboard","Logitech",86.99);
        Component component7 = new Component("mouse","Logitech",36.99);
        Component component8 = new Component("speakers","Bose",36.99);
        Component component9 = new Component("NIC","3Com",76.99);
        Component component10 = new Component("RAM","XTREEM",210.42);
        Component component11 = new Component("sound card","Asus",323.00);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(component1);
        shoppingCart.addItem(component2);
        shoppingCart.addItem(component3);
        shoppingCart.addItem(component4);
        shoppingCart.addItem(component5);
        shoppingCart.addItem(component6);
        shoppingCart.addItem(component7);
        shoppingCart.addItem(component8);
        shoppingCart.addItem(component9);
        shoppingCart.addItem(component10);
        shoppingCart.addItem(component11);

        System.out.println("\nThe shopping cart: "+shoppingCart);
        System.out.println("The items in the cart are: "+shoppingCart.getComponentNames());

        //Bonus
        System.out.printf("%n%s%n",shoppingCart.getTableSummary());
        ShoppingCart emptyCart = new ShoppingCart();
        System.out.println("\n\nEmpty Shopping Cart Table");
        System.out.printf("%n%s%n",emptyCart.getTableSummary());
    }
}
