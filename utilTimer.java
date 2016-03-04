package utils.mb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class utilTimer {
  public static void main(String args[]) {
	  System.out.println("App Timer started");
    ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Hello World Timer");
      }
    };
    Timer timer = new Timer(500, actionListener);
    System.out.println("Timer: " + timer.toString());
    timer.start();
  }
}