//Returns the same array with its elements in reverse order
public class hw {
    public static void Print(int[] arr){
        for (int i =0; i<arr.length/2; i++)
          {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
          }
        for (int j = 0; j < arr.length; j++){
        System.out.println(arr[j]);
        }
    }

//Prints out all the values of a 2-D integer array in a 2-D format
  public static void Print(int[][] arr){
    for (int i = 0; i < arr.length; i++){
      for (int j = 0; j < arr[i].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println(" ");
    }
  }


//Takes a integer in base base 10 and turns the number into binary and prints it out in the end.
  public static void binary (){
    int num = 1;
    StringBuilder result = new StringBuilder();
    while (num > 0) {
      int x = num % 2;
      result.append(Integer.toString(x));
      num /= 2;
    }
    System.out.println(result.reverse().toString());
  }

//Takes five integer command-line arguments and prints the median (the third largest one).
  public static void printMedian(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[i] = temp;
        }
      }
    }
    System.out.println(arr.length/2);
  }

//Write code that mimics this situation: your are in a locker room with 100 open lockers, numbered 1 to 100. Toggle all of the lockers that are even. By toggle, we mean close if it is open, and open if it is closed. Now toggle all of the lockers that are multiples of three. Repeat with multiples of 4, 5, up to 100. Print the position of the lockers that remain open.
  public static void printLocker () {
    int locker = 100;
    boolean[] lockers = new boolean[locker];
    for (int i = 0; i < locker; i++) {
        lockers[i] = true;
    }
    for (int i = 1; i < locker; i++) {
      for (int j = i + 1; j < locker; j += i + 1) {
             lockers[j-1] = !lockers[j-1];
      }
    }

    for (int i = 0; i < locker; i++) {
      if (lockers[i]) {
             System.out.println(i + 1);
      }
    }
  }
}
