//This is a Tic Tac Toe Game

import java.util.Scanner; //Import Scanner Object
import java.util.ArrayList;
import java.util.Random; //Imports Randomizer



public class TicTacToe {

  static int Player1;
  static int Player2;
  public static void main(String[] args) {
    MyMenu();
    TicGame();
  }

  //This is the main menu Function
  static void MyMenu() {
    Scanner Scan = new Scanner(System.in);
    System.out.println("Welcome to Tic Tac Toe!");
    System.out.println("Press 1 to play");
    System.out.println("Press 2 to quit");
    System.out.println("Please Enter an option");
    String decision_string = Scan.nextLine();
    int decision =  Integer.valueOf(decision_string);

    if(decision == 1){
      TicGame();
    }
    else if(decision == 2){
      System.out.println("See you next time!");
      System. exit(0);
    }
    else{
      System.out.println("Please enter a valid number!");
      System.out.println();
      System.out.println();
      MyMenu();
    }
  }

  static void TicGame(){
    Random rand = new Random();
    System.out.println("Lets Begin!");
    System.out.println();
    System.out.println();
    int turn = rand.nextInt(1);
    String turnsout;
    //Have a While loop that repeats the board and placement method
    boolean game_win = false; //Initialize variables
    String[] Alex= {" "," "," "," "," "," "," "," "," "}; //keeps track of where everything is
    while(game_win == false){
      if(turn == 1){
        turnsout = "X"; //X goes first
        turn = turn-1; //next is O
      }else{
        turnsout = "O"; // O Goes first
        turn = turn+1; //next is X
      }
      Board(Alex);
      placement(turnsout,Alex);
      if(scoreCheck(Alex) != " "){
        break;
      }
    }

    if(scoreCheck(Alex) == "Player 1"){
      Board(Alex);
      System.out.println("Player 1 wins!");
      Player1 = Player1 + 1;
      score();
      MyMenu();
    }
    if(scoreCheck(Alex) == "Player 2"){
      Board(Alex);
      System.out.println("Player 2 wins!");
      Player2 = Player2 + 1;
      score();
      MyMenu();
    }
    if(scoreCheck(Alex) == "Draw"){
      Board(Alex);
      System.out.println("Its a Draw!");
      score();
      MyMenu();
    }

  }

  static void Board(String [] Alex){
    System.out.println("     |     |     ");
    System.out.println("  " + Alex[6] + "  |  " + Alex[7] + "  |  " + Alex[8] + "  ");
    System.out.println("_____|_____|_____");
    System.out.println("     |     |     ");
    System.out.println("  "+ Alex[3] + "  |  " + Alex[4] + "  |  " + Alex[5] + "  ");
    System.out.println("_____|_____|_____"); 
    System.out.println("     |     |     ");
    System.out.println("  " + Alex[0] + "  |  " + Alex[1] + "  |  "+ Alex[2] + "  ");
    System.out.println("     |     |     ");
  }
  
  public static void placement(String turnsout, String[] Alex)
  {
    //import Scanner
    Scanner Scan = new Scanner(System.in); //BREAK POINT
    //Checks if Coord is valid
    boolean valid = false;
    //Uses turnsout as the input
    String ins = turnsout;

    while(valid == false){

      //handles type error
      if(ins == "X")
      {
        System.out.println("Player 1 GO! (X)");
      }else if(ins == "O"){
        System.out.println("Player 2 GO! (O)");
      }
      System.out.println("Please put your coordinates in the form of a double digit number");
      System.out.println("For example if you are in the top left it would be 13");
      System.out.println("Please enter a number.");
      String coord_String = Scan.nextLine();
      int coord =  Integer.valueOf(coord_String);

      
      //Created an array list with all 9 possible locations
      //if the user enters an invalid location they will be asked to enter a valid location
      ArrayList<Integer> validP = new ArrayList<>();
      validP.add(11);
      validP.add(12);
      validP.add(13);
      validP.add(21);
      validP.add(22);
      validP.add(23);
      validP.add(31);
      validP.add(32);
      validP.add(33);

      //Checks if the coordinate is valid or not
      while(!validP.contains(coord)){
        System.out.println("That is not a valid location, please try again.");
        System.out.println("Please put your coordinates in the form of a double digit number");
        System.out.println("For example if you are in the top left it would be 13");
        String x_string = Scan.nextLine();
        int x =  Integer.valueOf(x_string);
        if(validP.contains(x)){
          coord = x;
          break;
        }
      }


      if(coord == 11){
        if(Alex[0]=="X" || Alex[0] == "O"){
          System.out.println("Someone is already here!");
          System.out.println("Please enter a new coordinate");
          String y_String = Scan.nextLine();
          int y = Integer.valueOf(y_String);
          if(validP.contains(y)){
            coord = y;
          }else{
            while(!validP.contains(y)){
              System.out.println("Someone is already here!");
              System.out.println("Please enter a new coordinate");
              y_String = Scan.nextLine();
              y = Integer.valueOf(y_String);
              if(validP.contains(y)){
                coord = y;
                break;
              }
            }
          }
        }if(coord == 11){
        valid = true;
        Alex[0] = ins;}
      }

      if(coord == 12){
        if(Alex[1]=="X" || Alex[1] == "O"){
          System.out.println("Someone is already here!");
          System.out.println("Please enter a new coordinate");
          String y_String = Scan.nextLine();
          int y = Integer.valueOf(y_String);
          if(validP.contains(y)){
            coord = y;
          }else{
            while(!validP.contains(y)){
              System.out.println("Someone is already here!");
              System.out.println("Please enter a new coordinate");
              y_String = Scan.nextLine();
              y = Integer.valueOf(y_String);
              if(validP.contains(y)){
                coord = y;
                break;
              }
            }
          }
        }if(coord == 12){
        valid = true;
        Alex[1] = ins;}
      }

      if(coord == 13){
        if(Alex[2]=="X" || Alex[2] == "O"){
          System.out.println("Someone is already here!");
          System.out.println("Please enter a new coordinate");
          String y_String = Scan.nextLine();
          int y = Integer.valueOf(y_String);
          if(validP.contains(y)){
            coord = y;
          }else{
            while(!validP.contains(y)){
              System.out.println("Someone is already here!");
              System.out.println("Please enter a new coordinate");
              y_String = Scan.nextLine();
              y = Integer.valueOf(y_String);
              if(validP.contains(y)){
                coord = y;
                break;
              }
            }
          }
        }if(coord == 13){
        valid = true;
        Alex[2] = ins;}
      }

      if(coord == 21){
        if(Alex[3]=="X" || Alex[3] == "O"){
          System.out.println("Someone is already here!");
          System.out.println("Please enter a new coordinate");
          String y_String = Scan.nextLine();
          int y = Integer.valueOf(y_String);
          if(validP.contains(y)){
            coord = y;
          }else{
            while(!validP.contains(y)){
              System.out.println("Someone is already here!");
              System.out.println("Please enter a new coordinate");
              y_String = Scan.nextLine();
              y = Integer.valueOf(y_String);
              if(validP.contains(y)){
                coord = y;
                break;
              }
            }
          }
        }if(coord == 21){
        valid = true;
        Alex[3] = ins;}
      }

      if(coord == 22){
        if(Alex[4]=="X" || Alex[4] == "O"){
          System.out.println("Someone is already here!");
          System.out.println("Please enter a new coordinate");
          String y_String = Scan.nextLine();
          int y = Integer.valueOf(y_String);
          if(validP.contains(y)){
            coord = y;
          }else{
            while(!validP.contains(y)){
              System.out.println("Someone is already here!");
              System.out.println("Please enter a new coordinate");
              y_String = Scan.nextLine();
              y = Integer.valueOf(y_String);
              if(validP.contains(y)){
                coord = y;
                break;
              }
            }
          }
        }if(coord == 22){
        valid = true;
        Alex[4] = ins;}
      }


      if(coord == 23){
        if(Alex[5]=="X" || Alex[5] == "O"){
          System.out.println("Someone is already here!");
          System.out.println("Please enter a new coordinate");
          String y_String = Scan.nextLine();
          int y = Integer.valueOf(y_String);
          if(validP.contains(y)){
            coord = y;
          }else{
            while(!validP.contains(y)){
              System.out.println("Someone is already here!");
              System.out.println("Please enter a new coordinate");
              y_String = Scan.nextLine();
              y = Integer.valueOf(y_String);
              if(validP.contains(y)){
                coord = y;
                break;
              }
            }
          }
        }if(coord == 23){
        valid = true;
        Alex[5] = ins;}
      }

      if(coord == 31){
        if(Alex[6]=="X" || Alex[6] == "O"){
          System.out.println("Someone is already here!");
          System.out.println("Please enter a new coordinate");
          String y_String = Scan.nextLine();
          int y = Integer.valueOf(y_String);
          if(validP.contains(y)){
            coord = y;
          }else{
            while(!validP.contains(y)){
              System.out.println("Someone is already here!");
              System.out.println("Please enter a new coordinate");
              y_String = Scan.nextLine();
              y = Integer.valueOf(y_String);
              if(validP.contains(y)){
                coord = y;
                break;
              }
            }
          }
        }if(coord == 31){
        valid = true;
        Alex[6] = ins;}
      }

      if(coord == 32){
        if(Alex[7]=="X" || Alex[7] == "O"){
          System.out.println("Someone is already here!");
          System.out.println("Please enter a new coordinate");
          String y_String = Scan.nextLine();
          int y = Integer.valueOf(y_String);
          if(validP.contains(y)){
            coord = y;
          }else{
            while(!validP.contains(y)){
              System.out.println("Someone is already here!");
              System.out.println("Please enter a new coordinate");
              y_String = Scan.nextLine();
              y = Integer.valueOf(y_String);
              if(validP.contains(y)){
                coord = y;
                break;
              }
            }
          }
        }if(coord == 32){
        valid = true;
        Alex[7] = ins;}
      }

      if(coord == 33){
        if(Alex[8]=="X" || Alex[8] == "O"){
          System.out.println("Someone is already here!");
          System.out.println("Please enter a new coordinate");
          String y_String = Scan.nextLine();
          int y = Integer.valueOf(y_String);
          if(validP.contains(y)){
            coord = y;
          }else{
            while(!validP.contains(y)){
              System.out.println("Someone is already here!");
              System.out.println("Please enter a new coordinate");
              y_String = Scan.nextLine();
              y = Integer.valueOf(y_String);
              if(validP.contains(y)){
                coord = y;
                break;
              }
            }
          }
        }if(coord == 33){
        valid = true;
        Alex[8] = ins;}
      }

      //break condition
      if(valid == true){
        break;
      }
    }
  }

  static String scoreCheck(String[] Alex){
    //define all win cases and draw cases
    String winner = " ";
    
    //3 in a row
    if(Alex[0] != " " && Alex[1] != " " && Alex[2] != " "){
      if(Alex[0] == "X" && Alex[1] == "X" && Alex[2] == "X"){
        winner = "Player 1";
      }if(Alex[0] == "O" && Alex[1] == "O" && Alex[2] == "O"){
        winner = "Player 2";
      }
    }
    if(Alex[3] != " " && Alex[4] != " " && Alex[5] != " "){
      if(Alex[3] == "X" && Alex[4] == "X" && Alex[5] == "X"){
        winner = "Player 1";
      }if(Alex[3] == "O" && Alex[4] == "O" && Alex[5] == "O"){
        winner = "Player 2";
      }
    }
    if(Alex[6] != " " && Alex[7] != " " && Alex[8] != " "){
      if(Alex[6] == "X" && Alex[7] == "X" && Alex[8] == "X"){
        winner = "Player 1";
      }if(Alex[6] == "O" && Alex[7] == "O" && Alex[8] == "O"){
        winner = "Player 2";
      }
    }

    //3 in a column
    if(Alex[0] != " " && Alex[3] != " " && Alex[6] != " "){
      if(Alex[0] == "X" && Alex[3] == "X" && Alex[6] == "X"){
        winner = "Player 1";
      }if(Alex[0] == "O" && Alex[3] == "O" && Alex[6] == "O"){
        winner = "Player 2";
      }
    }
    if(Alex[1] != " " && Alex[4] != " " && Alex[7] != " "){
      if(Alex[1] == "X" && Alex[4] == "X" && Alex[7] == "X"){
        winner = "Player 1";
      }if(Alex[1] == "O" && Alex[4] == "O" && Alex[7] == "O"){
        winner = "Player 2";
      }
    }
    if(Alex[2] != " " && Alex[5] != " " && Alex[8] != " "){
      if(Alex[2] == "X" && Alex[5] == "X" && Alex[8] == "X"){
        winner = "Player 1";
      }if(Alex[2] == "O" && Alex[5] == "O" && Alex[8] == "O"){
        winner = "Player 2";
      }
    }

    //3 across
    if(Alex[0] != " " && Alex[4] != " " && Alex[8] != " "){
      if(Alex[0] == "X" && Alex[4] == "X" && Alex[8] == "X"){
        winner = "Player 1";
      }if(Alex[0] == "O" && Alex[4] == "O" && Alex[8] == "O"){
        winner = "Player 2";
      }
    }
    if(Alex[2] != " " && Alex[4] != " " && Alex[6] != " "){
      if(Alex[2] == "X" && Alex[4] == "X" && Alex[6] == "X"){
        winner = "Player 1";
      }if(Alex[2] == "O" && Alex[4] == "O" && Alex[6] == "O"){
        winner = "Player 2";
      }
    }


    //Draw case
    if(winner == " "){
      boolean containsNoSpace = true;
      for (String element : Alex) {
          if (element.equals(" ")) {
              containsNoSpace = false;
              break; // No need to continue checking if we find a space
          }
      }if(containsNoSpace == true){
        winner = "Draw";
      }
    }
    return winner;
  }
  
  static void score(){
    System.out.println("Player 1's score is: " + Player1);
    System.out.println("Player 1's score is: " + Player2);
  }
}