import java.util.concurrent.*;

public class Test {


    public static void main(String[] args) {




        //test   dddddddddddddd
        
        // teset22222222
        


        ExecutorService executorService = Executors.newFixedThreadPool(1);

        executorService.submit()

        Executors.newScheduledThreadPool()

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,
                3,20, TimeUnit.DAYS,
                new LinkedBlockingDeque<Runnable>(30),new CustomRejectedExecutionHandler());

        threadPoolExecutor.getRejectedExecutionHandler(new RejectedExecutionHandler(){

            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

            }
        });
    }
}
