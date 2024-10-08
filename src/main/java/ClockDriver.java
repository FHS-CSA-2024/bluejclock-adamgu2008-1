package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        
        System.out.println("Testing Clock Display: ");
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("\tEmpty Con. Test - " + test1Output);
        
        ClockDisplay test2 = new ClockDisplay(2, 45);
        String test2Output = test2.getTime();
        System.out.println("\tArg Con. Test - "+ test2Output);
        
        test2.setTime(5, 15);
        String test3Output = test2.getTime();
        System.out.println("\tSet Time Test - "+ test3Output);
        
        ClockDisplay tickTest1 = new ClockDisplay(3, 32);
        String tickTest1Output = tickTest1.getTime();
        System.out.println("\tTickTest1 Before increment - " + tickTest1Output);
        tickTest1.timeTick();
        tickTest1Output = tickTest1.getTime();
        System.out.println("\tTickTest1 after increment - " + tickTest1Output);
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        System.out.println("Testing Clock Display Seconds: ");
        ClockDisplaySeconds testA = new ClockDisplaySeconds();
        String testAOutput = testA.getTimeSec();
        System.out.println("\tEmpty Con. Test - " + testAOutput);
        
        ClockDisplaySeconds testB = new ClockDisplaySeconds(2, 45, 39);
        String testBOutput = testB.getTimeSec();
        System.out.println("\tArg Con. Test - "+ testBOutput);
        
        testB.setTime(5, 15, 12);
        String testCOutput = testB.getTimeSec();
        System.out.println("\tSet Time Test - "+ testCOutput);
        
        ClockDisplaySeconds tickTestA = new ClockDisplaySeconds(3, 32, 59);
        String tickTestAOutput = tickTestA.getTimeSec();
        System.out.println("\tTickTest1 Before increment - " + tickTestAOutput);
        tickTestA.timeTick();
        tickTestAOutput = tickTestA.getTimeSec();
        System.out.println("\tTickTest1 after increment - " + tickTestAOutput);
        
        
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
    }
}
