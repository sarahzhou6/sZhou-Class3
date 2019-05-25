public class bubbleSort{
  static int numswap=0;
  public static int[] bubbleSort(int[] arr){
      for(int n=0;n<arr.length-1;n++){
        for(int e=0;e<arr.length-n-1;e++) {
          if(arr[e]>arr[e+1]){
              int temp=arr[e];
              arr[e]=arr[e+1];
              arr[e+1]=temp;
          }
        }
      }
      return arr;
  }
  public static void main(String[] args) {
      int[] sample={5,3,4,2,6,1,7};
      sample=bubbleSort(sample);
      for(int n=0;n<sample.length;n++){
          System.out.println(sample[n]);
      }
  }
}
