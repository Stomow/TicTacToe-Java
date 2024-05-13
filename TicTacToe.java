//This is a Tic Tac Toe

import java.util.Scanner; //Import Scanner Object


public class TicTacToe {
  public static void main(String[] args) {

    //Create a Scanner object
    int Alex =  MyMenu();    

    if(Alex == 1){
      TicGame();
    }
    else if(Alex == 2){
      System.out.println("See you next time!");
      System. exit(0);
    }
    else{
      System.out.println("Please enter a valid number!");
      System.out.println();
      System.out.println();
      Alex = MyMenu();
    }
  }

  //This is the main menu Function
  static int MyMenu() {
    Scanner Scan = new Scanner(System.in);
    System.out.println("Welcome to Tic Tac Toe!");
    System.out.println("Press 1 to play");
    System.out.println("Press 2 to quit");
    System.out.println("Please Enter an option");
    String decision_string = Scan.nextLine();
    int decision =  Integer.valueOf(decision_string);
    return decision;
  }


  static void TicGame(){
    System.out.println("Lets Begin!");
    System.out.println();
    System.out.println();
    
  }


  
}