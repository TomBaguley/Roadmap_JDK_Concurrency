public class SleepMessages {
    public void execute() throws InterruptedException{
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for (int i = 0; i <importantInfo.length; i++){
            //pause for 4 seconds
            Thread.sleep(4000);
            System.out.println(importantInfo[i]);
        }
    }
}
