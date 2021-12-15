package org.iesfm.concurrency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CashierTask implements Runnable {

    private final static Logger log = LoggerFactory.getLogger(CashierTask.class);

    private Queue queue;

    public CashierTask(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        // Mientras queden clientes en la cola
        int count = 0;
        while (queue.getValue() > 0) {
            queue.dec();
            log.info("Cliente servido");
            count++;
        }
        log.info("Total" + count);
    }
}
