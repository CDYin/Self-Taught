public class ThreadTest {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.start();//pongping
        //t.start();//pingpong
        System.out.print("ping");
    }
    static void pong() {
        System.out.print("pong");
    }
}
