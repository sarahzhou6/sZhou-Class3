//Sums the numbers from 1 to 50 and prints out the sum one time in the end.
public class lesson {
    public static void printSums() {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}


//Prints out every even number that is one more or one less than a multiple of 5 from 1 to 100 inclusive.
public class lesson {
    public static void printSums() {
        int sum = 0;
        for (int x = 1; x <= 100; x++) {
            if (x % 5 == 1) or (x % 5 == 4)
            {
              System.out.println(x);
            }
        }
    }
}


//Given a defined variable of score in the beginning, print out a grade of F...
public class lesson {
    public static void main(String[] args) {
      int examScore = 72;
          char grade;
          if (examScore >= 90){
            grade = 'A';
          }
          else if (examScore >= 80){
            grade = 'B';
          }
          else if (examScore >= 70){
            grade = 'C';
          }
          else if (examScore >= 60){
            grade = 'D';
          }
          else {
            grade = 'F';
          }
          System.out.println(grade);
    }
}


//Prints out all numbers that are either multiples of 3 or multiples of 4, but not both.
public class lesson {
    public static void main(String args[]){
        int j = 0;
        int i = 0;
        while(j < 10){
          i ++;
          if {(i%3==0 or i%4==0) and (i%12 != 0)
            System.out.println(i);
          }
        }
    }
}
