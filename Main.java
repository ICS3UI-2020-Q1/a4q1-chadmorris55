import java.util.Scanner;
/**
 * finds the largest integer out of the three given
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);

    //asks for and records users number
    System.out.println("Please enter an integer to count down to");
    int numEnd = input.nextInt();
    //place where the counting starts from
    int numStart = 100;
    System.out.println("Count Down:");
    while (numStart >= numEnd){
      System.out.println(numStart);
      numStart = numStart - 5;
    }
  }
}
