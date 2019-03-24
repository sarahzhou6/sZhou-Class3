/*
public class lesson {
  public static void main (String[] args){
    System.out.println(args[1]);
    // args 0
  }
    public static int printSum(int a, int b) {
        int total = 0;
        for (int i = a; i <= b; i++) {
            total += i;
        }
        return(total);
    }
}
*/

//ARRAYS
/*
public class lesson {
    public static void main (String[] args){
        int [] arr = new int []{1,2,3,4,5,6,7,8,9};
        arr[0]=1;
        for (int i =0; i<arr.length; i++){
          System.out.println(arr[i]);
        }
    }
}
*/

// how to reverse the array (print out 9,8,7,6,5,4,3,2,1)

/*
public class lesson {
    public static void main (String[] args){
        int [] arr = new int []{1,2,3,4,5,6,7,8,9};
        arr[0]=1;
        for (int i =0; i<arr.length-1; i++){
              while (1 < 9)
              //ADD
                {
                  int temp = arr [i];
                  arr[i] = arr[8-i];
                  arr[8-i] = temp;
                }
              //
            System.out.println(arr[i]);
        }
    }
}
*/

public class lesson {
    public static void main (String[] args){
        int [][] arr2 = new int [10][10];
        int [][] grid = new int[][]{
                              //i,j position
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4[i].length; j++) {
            System.out.print(4[i][j]);
          }
        }
        // System.out.println(grid[1][2]);
                        //(grid [row][column]
    }
}
