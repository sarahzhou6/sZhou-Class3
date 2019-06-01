/*public class Lesson {
  // FACTORIAL RECURSIVE
 static int factorial(int n){
  if (n == 0)
    return 1;
  else
    return(n * factorial(n-1));
 }
 public static void main(String args[]){
  int i,fact=1;
  int number=5;
  fact = factorial(number);
  System.out.println(number+"! : "+fact);
 }

 //FACTORIAL ITERATIVE
 public int factorial(int n){
   int total = 1;
   while (n > 1){
     total = total * n;
     n --;
   }
   return total;
 }

 //FIBONACCI RECURSIVE
 static int n1=0,n2=1,n3=0;
 static void printFibonacci(int count){
    if(count>0){
         n3 = n1 + n2;
         n1 = n2;
         n2 = n3;
         System.out.print(" " + n3);
         printFibonacci(count-1);
     }
 }
 public static void main(String args[]){
  int count=7;
  System.out.print(n1 + " " + n2);
  printFibonacci(count-2);
 }

 //FIBONACCI ITERATIVE
 public static void fibonacci(int n){
   if(n==1){
     System.out.println(0);
   }
   else if (n==2){
     System.out.println(1);
   }
   else{
     int first = 0;
     int second = 1;
     int third = 0;
     for(int i=2; i<n; i++){
       third = first + second;
       first = second;
       second = third;
     }
     System.out.println(third);
   }
 }
 // check to see if a string is a palindrome
 public static void main(String args[]){
  int r,sum=0,temp;
  int n=12321;

  temp=n;
  while(n>0){
   r=n%10;
   sum=(sum*10)+r;
   n=n/10;
  }
  if(temp==sum)
   System.out.println(temp + " is a palindrome");
  else
   System.out.println("not palindrome");
}

public static boolean checkPal(String str){
        if(str.length() == 0){
                return true;
        }
        for(int i = 0; i < str.length()/2; i ++){
                if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                        return false;
                }
        }
        return true;
}
public static boolean rCheckPal(String str){
        if(str.length() <= 1){
                return true;
        }
        if(str.charAt(0) == str.charAt(str.length() - 1)){
                rCheckPal(str.substring(1, str.length() - 1));
        }
        return false;
}

}









import java.util.Arrays;
public class lesson{
  public static void main(String[] args){
    //args has your terminal options
    System.out.println(Arrays.toString(args));
  }
}

*/
// javac lesson.java
// java lesson 1 2 3 4 5 6 7
// -> [1,2,3,4,5,6,7]
/*
    Object
      \
   Throwable (Can be used with the throw command)
    /                     \
Error              Exception (checked)
(unchecked)             \
                  RuntimeException (unchecked)


*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Lesson{
  public static void main(String[]args){
    String fileName = "file.txt";
    try{
      File f = new File(fileName);//can combine
      Scanner in = new Scanner(f);//into one line
/*
      //read line by line
      while(in.hasNext()){
        String line = in.nextLine();
        //do something with line
        System.out.println(line);
      }
*/

      //read word by word
      while(in.hasNext()){
        String word = in.next();
        //do something with word
        System.out.println(word);
      }

        //NOW read the file here...

    }catch(FileNotFoundException e){
      System.out.println("File not found: " + fileName);
      //e.printStackTrace();
      System.exit(1);
    }
  }
}







/*
U A I F L Q B I D R T V D S S
D R H N N N K W R N E A P H F
 U J Y M B O A X U S L O G J N
 N U X D L Z E P C A P X V V I
 B O D S J O T X S C L I X R D
 C A C L Y Y S I O T A N U E B
 K H X N M P P R E S L U E T C
 E K O I K I N T F S T T B S S
 S G D C V C D I U B X Z H B I
 H O N F O Z Y P F K S W J O W
 Z E O W V L E A R H R E R L R
 Q W X A T R A O Z M S J E U N
 Z C N Y M V N T O Z U I F L L
 N T W A Y A S Q E L I D F Q X
 X H N T K S O H J W O P J Z X

FIND THE FOLLOWING WORDS:
FISH        LOBSTER    PIZZA       CHOCOLATE
STEAK       SALAD      POPCORN     THOR
LOKI        ZOD        SUPERMAN

features of the program:

1. generate an N by M puzzle
    (A puzzle includes a list of words, and a grid of letters with those words hidden.)
2. add a bunch of words randomly
3. show the puzzle , or the solution. (have a puzzle have a unique ID so you can recall it later)
4. Use a plain text file as a list of words to add to the puzzle.
           This means we can swap the theme of the puzzle with different files.
5. Be able to reproduce the same puzzle/solution at a later date. This is a VERY useful feature.



data structure: 2-D characters array
what functions should this class contain??
1. ranodm letter generator
2. addWordVertical, addWordHorizontal, addWordDiagonal

javac Wordsearch

java WordSearch rows cols filename
java WordSearch rows cols filename randomSeed
java WordSearch rows cols filename randomSeed answers

java WordSearch 4 4 words.txt
OR
java WordSearch 4 4 words.txt 103
|X Y F B|
|I A I F|
|D E S A|
|M E H R|
java WordSearch 4 4 words.txt 103 key
|    F  |
|  A I  |
|D   S  |
|M E H  |
Words: FAD, FISH, MEH (seed: 103)


*/
