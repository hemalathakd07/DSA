public class largestElement {
  static int largest(int[] array){
    int largest_element=array[0];
    for(int i=0;i<array.length;i++){
      if(array[i]>largest_element){
        largest_element=array[i];
      }
    }
    return largest_element;
  }
  public static void main(String[] args) {
    int[] array={2,45,1,7,10};
    System.out.println(largest(array));
  }
  
}
