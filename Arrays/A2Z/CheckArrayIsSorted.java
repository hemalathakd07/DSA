public class CheckArrayIsSorted {
  static boolean checkSort(int[] array){
    for(int i=1;i<array.length;i++){
      if(array[i]<array[i-1]){
        return false;
      }
    }
    return true;

  }
  public static void main(String[] args) {
    int[] array={1,2,3,4,5};
    System.out.println(checkSort(array));
  }
  
}
