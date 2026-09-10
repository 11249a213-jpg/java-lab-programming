class PaymentGateway implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Payment Processing...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        PaymentGateway payment = new PaymentGateway();

        Thread t = new Thread(payment);
        t.start();
    }
}
