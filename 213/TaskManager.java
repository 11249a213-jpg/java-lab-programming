class TaskManager {
    public static void main(String[] args) {

        Thread counter = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        counter.start();
    }
}
