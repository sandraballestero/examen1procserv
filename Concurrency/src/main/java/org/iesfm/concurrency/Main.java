package org.iesfm.concurrency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {

    private final static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        log.info("Cuántos clientes hay en la fila");
        Queue queue = new Queue(scanner.nextInt());
        //int queue = 10;
        scanner.nextLine();

        Thread t1 = new Thread(new CashierTask(queue));
        t1.start();
        // CUANTO DEBERÍA SER queue? 9, en realidad sigue siendo 10
        Thread t2 = new Thread(new CashierTask(queue));
        t2.start();

        // Espero a que el t1 termine
        t1.join();
        // Espero a que el t2 termine
        t2.join();

        log.info("Cola vacía: " + queue.getValue());
    }
}
