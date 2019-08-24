/*
 * @author Vansh Rishi
 * @version 1.0
 * */
package main;
import java.util.Scanner;

public class Gravity {
	public static void main(String[] args) {
		double distance =0,time=0,speed=0,g=9.8;
		Scanner t = new Scanner(System.in);
        time = t.nextDouble();
        speed = g * time;
        distance = 0.5 * g * time * time;
        System.out.println("The speed of object at " + time + " seconds after its release is " + speed + " and the distance the object has travelled in the time  " + time + " seconds after the release is " + distance);
        t.close();
	}
}
