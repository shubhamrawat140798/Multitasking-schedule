/*Schedule a task using schedule*/
import java.util.concurrent.*;

public class Schedule{
    public static void main(String[] args)
    {
         ScheduledExecutorService scheduler=Executors.newSingleThreadScheduledExecutor();
         Runnable task= new Runnable() {
             public void run()
             {
                 System.out.println("Hi");
             }
         };
         int delay=3;
         scheduler.schedule(task,delay,TimeUnit.SECONDS);
         scheduler.shutdown();
    }
}
