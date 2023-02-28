public class Main {
    public static class Ronaldo{
        void run()
        {
            System.out.println("Ronaldo");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Ronaldo r=new Ronaldo();
        r.run();
        for(int i=0; i<5; i++)
        {
            System.out.println("Messi");
            Thread.sleep(2000);     //everytimes messi will print after two seconds
        }
    }

}
