package edu.grinnell.csc207.main;

import edu.grinnell.csc207.util.IOUtils;
import edu.grinnell.csc207.util.Quadratic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Interactively compute quadratic roots.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 * @author Your Name Here
 */
public class QR {
  /**
   * Do all the work.
   *
   * @param args
   *   Command-line arguments (ignored).
   *
   * @throws Exception
   *   If something goes wrong with the I/O or elsewhere.
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));
    int a = IOUtils.readInt(pen, eyes, "Please enter an integer: ");
    int b = IOUtils.readInt(pen, eyes, "Please enter an integer: ");
    int c = IOUtils.readInt(pen, eyes, "Please enter an integer: ");

    Quadratic temp = new Quadratic(a, b, c);
    try {
      pen.println(temp.smallerRoot());
    } catch (Exception e) {
      // TODO Auto-generated catch block
      pen.printf("Sorry, I could not compute a root \n");
    }
 

    try {
      eyes.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    pen.close();
  } // main(String[])

} // QR
