package server;

import java.util.concurrent.FutureTask;

/**
 * 传输任务调度器
 */
public interface TransferDispatcher {

    /**
     *
     * @return
     */
    FutureTask addToQueue();

    FutureTask getFromQueue();

}
