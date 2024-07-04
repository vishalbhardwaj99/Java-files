
// class A implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i);
//             try {
//                 Thread.sleep(5);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(5);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

class Counter
{
    int count;
    public void increament()
    {
        count++;
    }
    
}

public class DemoThread {
    public static void main(String[] args) {

        Counter c = new Counter();

        Runnable obj1 = new Runnable()
        {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    c.increament();
                    // System.out.println(i);
                    // try {
                    //     Thread.sleep(5);
                    // } catch (InterruptedException e) {
                    //     e.printStackTrace();
                    // }
                }
            }
        };
        Runnable onj2 = () -> 
        {
                for (int i = 1; i <= 1000; i++) {
                    c.increament();
                    // System.out.println("hello");
                    // try {
                    //     Thread.sleep(5);
                    // } catch (InterruptedException e) {
                    //     e.printStackTrace();
                    // }
                }
        };


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(onj2);

        t1.start();
        t2.start();

        System.out.println(c.count);
    }
}