//Gary Henry 
//11/10/2021
//CIS219, Tuesdays and Thursdays 3:30pm to 5:30pm
//Project 1
public class Main {// Main Class, runs main method, holds persistent vars y[], random and arrayLoc
    public static void main(String[] args) {// main method, runs the numOne, checkNum, and printArray method in a loop equal to y array size (20 times)
        do { //loop
        int x = numOne(1);//get random number, assign it to variable x
        checkNum(x);//check the number against the array, change accordingly
        arrayLoc++;//increment array location forward
         }
        while(arrayLoc < y.length);//run this loop while array location is less than array size
        
        printArray(); //calls print array method, prints entire array
    }
    //create persistent array
    public static int[] y = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    //create persistent random
    public static int random;
    //create persistent variable that tracks current location in array y
    public static int arrayLoc;
    //numOne method uses int variable to hold data, passed from main method
    public static int numOne(int x){ //numOne method that generates a random number
            int range = 31;// int here sets range for random number
			random = (int) (Math.random() * range);  //generate random number between 1 and 30
            y[arrayLoc] = random; //sets array location equal to random number that was generated
            x = random; //sets variable x equal to random number
            return x; //return value of x 
    }
    public static int checkNum(int x){ //checkNum method checks the value of x against the array values
    int range = 31; //set range value
        for (int check = arrayLoc; check > -1; check--) { //loops through the array 
            if (y[check] == x) { //if x = previous array entry
                do{ //loop
                    random = (int) (Math.random() * range); //get new random number
                    check = arrayLoc; //reset search location of check for array
                 y[check] = random;  //assign new random number to array location
                } while(x == y[check]); //loop while x equals a previous array value
                    x = random; //set x equal to the new validated random
            }
                if (y[arrayLoc] == 0){ //checks if the array entry is 0, if it is then rerun the checkNum method to get a new number
                checkNum(x); //calls the checkNum method using the variable x
                } 
        }
        return x; //return value of x 
}
    public static void printArray(){ //prints the current array location to the screen 
        for(int i: y){ //loops through the array, print each value
            System.out.println(i);
        }
        }
}