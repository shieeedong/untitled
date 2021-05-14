import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService service = Executors.newCachedThreadPool();
//        System.out.println(service);
//        for (int i = 0; i < 2; i++) {
//            service.execute(() -> {
//                try {
//                    TimeUnit.MILLISECONDS.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName());
//            });
//        }
//        System.out.println(service);
//
//        TimeUnit.SECONDS.sleep(80);
//
//        System.out.println(service);
        String a="abcde";
        String b="abc";
        Map<String,String> a1=new HashMap<>();

        System.out.println(a.indexOf(b));
        System.out.println(b.indexOf(a));
        System.out.println("ab".indexOf("abc"));
        System.out.println("abcdef".indexOf("bc"));
    }

}
