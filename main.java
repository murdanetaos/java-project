import java.text.DecimalFormat;

class Candle {
    String name;
    int quantity;
    double burnTime;
    double dollarPerBurnTime;
    double price;

    Candle(String name, int quantity, double burnTime, double price) {
        this.name = name;
        this.quantity = quantity;
        this.burnTime = burnTime;
        this.price = price;
        this.dollarPerBurnTime = price / burnTime;
    }

    double getSubtotal() {
        return price * quantity;
    }
}

public class main {
    public static void main(String[] args) {
        Candle candle1 = new Candle("Luscious Lavender", 3, 5, 7.50);
        Candle candle2 = new Candle("Fragrant Floral's", 5, 7, 18.75);
        Candle candle3 = new Candle("Spicy N' Dicey", 2, 12, 11.98);

        // Additional candles
        Candle candle4 = new Candle("Ocean Breeze", 4, 8, 14.99);
        Candle candle5 = new Candle("Sweet Serenity", 1, 10, 9.99);

        int totalBurnTime = (int) (candle1.burnTime * candle1.quantity +
                candle2.burnTime * candle2.quantity +
                candle3.burnTime * candle3.quantity +
                candle4.burnTime * candle4.quantity +
                candle5.burnTime * candle5.quantity);

        double totalDollarPerBurnTime = (candle1.price + candle2.price + candle3.price
                + candle4.price + candle5.price) / totalBurnTime;

        double totalPrice = candle1.getSubtotal() + candle2.getSubtotal() + candle3.getSubtotal()
                + candle4.getSubtotal() + candle5.getSubtotal();

        DecimalFormat df = new DecimalFormat("#.##");
        String formattedTotalDollarPerBurnTime = df.format(totalDollarPerBurnTime);

        System.out.println("Receipt\n");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // Print details for candle1, candle2, candle3 (existing candles)
        System.out.println(candle1.name);
        // ...
        System.out.println(candle2.name);
        // ...
        System.out.println(candle3.name);
        // ...
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        // Print details for candle4, candle5 (additional candles)
        System.out.println(candle4.name);
        // ...
        System.out.println(candle5.name);
        // ...
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("Total Burn Time: " + totalBurnTime);
        System.out.println("Total Dollar per Burn Time: $" + formattedTotalDollarPerBurnTime);
        System.out.println("Total Price: $" + totalPrice);
    }
}