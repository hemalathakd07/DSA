public class OrderAgnosticBinarySearch {
  static int Search(int[] array,int element){
    int low=0,high=array.length-1;
    boolean isAscending=array[low]<=array[high];
    while(low<=high){
      int mid=low+(high-low)/2;
      if(array[mid]==element){
        return mid;
      }else{
        if(isAscending){
          if(array[mid]>element){
            high=mid-1;
          }
          else{
            low=mid+1;
          }
        }
        else{
          if(array[mid]>element){
            low=mid+1;
          }
          else{
            high=mid-1;
          }

        }
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    
  }
  
}
