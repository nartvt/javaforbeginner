package  program.com.Exercise13;

public class Main {

  public static void main(String[] args) {
    Exercise13_ArraysInput input = new Exercise13_ArraysInput();
    int option = 0;
    int []arrays = {};
    do {
      option = input.menu();
      if (option > 10 || option < 1) {
        System.out.println("Doesn't this option, please try again !");
      } else {
        if (option == 10) {
          System.out.println("EXIT PROGRAM !");
          break;
        } else {
          input.optionChoose(option, arrays);
        }
      }
    } while (option != 10);
    input.closeScanner();
    System.exit(1);
     
  }
}
