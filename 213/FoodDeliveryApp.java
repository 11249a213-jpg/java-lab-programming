class FoodDeliveryApp {
    public static void main(String[] args) {

        Thread orderPlacement = new Thread(() -> {
            System.out.println("Order placement started...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Order placed successfully!");
        });

        Thread orderDelivery = new Thread(() -> {
            try {
                orderPlacement.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Order delivery started...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Order delivered successfully!");
        });

        orderPlacement.start();
        orderDelivery.start();
    }
}
