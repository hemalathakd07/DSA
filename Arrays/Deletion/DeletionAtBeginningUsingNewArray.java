package Deletion;
public class DeletionAtBeginningUsingNewArray {
  void deletion(int[] array,int[] newArray){
    for(int i=0;i<newArray.length;i++){
      newArray[i]=array[i+1];

    }
  }
  void traversal(int[] array){
    for(int i=0;i<array.length;i++){
      System.out.print(array[i]+"\t");
    }
  }
  public static void main(String[] args) {
    int[] array={0,1,2,3,4,5};
    int[] newArray=new int[array.length-1];
    System.out.println("Array elements before deletion:");
    DeletionAtBeginningUsingNewArray obj=new DeletionAtBeginningUsingNewArray();
    obj.traversal(array);

    obj.deletion(array,newArray);
    System.out.println("\nArray elements after deletion is ");
    obj.traversal(newArray);
    
    
  }
  
}
