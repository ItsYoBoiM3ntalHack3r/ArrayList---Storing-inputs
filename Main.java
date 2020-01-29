import java.util.*;


//Take 10 integer inputs from a user and store them in an ArrayList and print them on screen.
class Main {
  public static void main(String[] args) {
    //creates array list
    ArrayList<Integer> nums = new ArrayList<Integer>();
    for(int x = 0; x<10; x++){
    System.out.println("Input an integer");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    //Adds the input in the array list
    nums.add(num);
  }
  /* Since you cannot just print the whole array list by printing the name of the list
  you would need to use a for loop that would go throughout the array list and print each 
  element
  */
  for(int numb:nums) {
     System.out.print(numb + " ");
  } 
}
}