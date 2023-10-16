import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int input;
    int width = 1;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number: ");
    input = scan.nextInt();

    if(input % 2 == 1){  /*run this section if the input is an odd number*/
      while(width < input){  /*Width is increasing*/
        for(int j = 0; j < (input-width)/2; j++){  /*Prints the proper number of blank spaces before the stars*/
          System.out.print(" ");
        }
        for(int i = 0; i < width; i++){  /*Prints the proper number of stars*/
          System.out.print("*");
        }
        System.out.print('\n');
        width = width + 2;  /*Prints a new line and adds 2 to the current width before repeating previous statements*/
      }
      if(width >= input){ /*Width is equal to input*/
        for(int i = 0; i < input; i++){  /*Prints the max line of stars equal to the input*/
          System.out.print("*");
        }
      }

      width = input-2;  /*Set width to 2 less than the max to begin the bottom half of the diamond*/

      System.out.print('\n');

      while(width > 0){ /*Width is decreasing*/
        for(int j = 0; j < (input-width)/2; j++){  /*Prints the proper number of blank spaces before the stars*/
          System.out.print(" ");
        }
        for(int i = 0; i < width; i++){  /*Prints the proper number of stars*/
          System.out.print("*");
        }
        System.out.print('\n');
        width = width - 2;  /*Prints a new line and subtracts 2 from the current width before repeating previous statements*/
      }
    }
    else{  /*run this section if the input is an even number*/

      width = 1;
      while(width < 2){  /*Prints the one-star wide line*/
        for(int j = 0; j < (input-width); j++){
          System.out.print(" ");  /*Prints the proper number of blank spaces before the stars*/
        }
        for(int i = 0; i < width; i++){
          System.out.print("*");  /*Prints the proper number of stars*/
        }
        System.out.print('\n');
        width = 2;
      }

      while(width < input){  /*Width is increasing*/
        for(int j = 0; j < (input-width); j++){
          System.out.print(" ");  /*Prints the proper number of blank spaces before the stars*/
        }
        for(int i = 0; i < width; i++){
          System.out.print("* ");  /*Prints the proper number of stars*/
        }
        System.out.print('\n');
        width = width + 2;  /*Prints a new line and adds 2 to the current width before repeating previous statements*/
      }
      if(width >= input){ /*Width is equal to input*/
        for(int i = 0; i < input; i++){
          System.out.print("* ");  /*Prints the proper number of stars*/
        }
      }

      width = input-2;

      System.out.print('\n');

      while(width > 0){  /*Width is decreasing*/
        for(int j = 0; j < (input-width); j++){
          System.out.print(" ");  /*Prints the proper number of blank spaces before the stars*/
        }
        for(int i = 0; i < width; i++){
          System.out.print("* ");  /*Prints the proper number of stars*/
        }
        System.out.print('\n'); /*Prints a new line and subtracts 2 from the current width before repeating previous statements*/
        width = width - 2;
      }

      width = 1;
      while(width < 2){  /*Prints the one-star wide line*/
        for(int j = 0; j < (input-width); j++){
          System.out.print(" ");  /*Prints the proper number of blank spaces before the stars*/
        }
        for(int i = 0; i < width; i++){
          System.out.print("*");  /*Prints the proper number of stars*/
        }
        width = 2;
      }
    }
    scan.close();
  }
}
