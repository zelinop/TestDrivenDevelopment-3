/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testdrivendevelopment;

/**
 *
 * @author Mogamad Taariq Phillips - 220166153
 */

public class TimeDifference {

    int secs;
    int mins;
    int hrs;

    public TimeDifference(int hrs, int minutes, int seconds) {
        this.hrs = hrs;
        this.mins = minutes;
        this.secs = seconds;
    }

    public static void main(String[] args) {

        TimeDifference start = new TimeDifference(5, 18, 28);
        TimeDifference stop = new TimeDifference(18, 42, 51);
        TimeDifference diff;

        diff = difference(start, stop);

        System.out.printf("Time Difference:\nFrom %d:%d:%d to ", start.hrs, start.mins, start.secs);
        System.out.printf("%d:%d:%d ", stop.hrs, stop.mins, stop.secs);
        System.out.printf("\nis a %d:%d:%d difference\n", diff.hrs, diff.mins, diff.secs);
    }

    public static TimeDifference difference(TimeDifference start, TimeDifference stop)
    {
        TimeDifference diff = new TimeDifference(0, 0, 0);

        if(start.secs > stop.secs){
            --stop.mins;
            stop.secs += 60;
        }

        diff.secs = stop.secs - start.secs;

        if(start.mins > stop.mins){
            --stop.hrs;
            stop.mins += 60;
        }

        diff.mins = stop.mins - start.mins;
        diff.hrs = stop.hrs - start.hrs;

        return(diff);
    }
}
