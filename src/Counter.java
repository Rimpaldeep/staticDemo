public class Counter {
        static int count = 0;
        int instanceCount = 0;

   public void incrementCounter() {
       count++;
       instanceCount++;
    }
    public void countPrinter() {
        System.out.println(count);
        System.out.println(instanceCount);
    }

    }
