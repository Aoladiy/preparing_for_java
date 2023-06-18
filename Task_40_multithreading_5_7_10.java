import java.util.Timer;

import static java.lang.Thread.sleep;

public class Task_40_multithreading_5_7_10 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            int counter1;

            public void run() //Этот метод будет выполняться в побочном потоке
            {
                while (counter1 < 60) {
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    counter1++;
                    if (counter1 % 5 == 0) {
                        System.out.println("Поток 1 " + counter1 + "секунд");
                    }
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            int counter2;

            public void run() //Этот метод будет выполняться в побочном потоке
            {
                while (counter2 < 60) {
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    counter2++;
                    if (counter2 % 7 == 0) {
                        System.out.println("                               Поток 2 " + counter2 + "секунд");
                    }
                }

            }
        });
        Thread t3 = new Thread(new Runnable() {
            int counter3;

            public void run() //Этот метод будет выполняться в побочном потоке
            {
                while (counter3 < 60) {
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    counter3++;
                    if (counter3 % 10 == 0) {
                        System.out.println("                                                                    Поток 3 " + counter3 + "секунд");
                    }
                }

            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
