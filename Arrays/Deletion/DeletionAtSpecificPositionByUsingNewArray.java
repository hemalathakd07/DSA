package Deletion;
public class DeletionAtSpecificPositionByUsingNewArray {
    
  void deletion(int[] array,int[] newArray,int position){
    for(int i=0;i<position-1;i++){
      newArray[i]=array[i];
    }
    for(int i=position-1;i<newArray.length;i++){
      newArray[i]=array[i+1];
    }
  }

  void traversal(int[] array){
    for(int i=0;i<array.length;i++){
      System.out.print(array[i]+"\t");
    }
  }
  
  public static void main(String[] args) {

    int[] array={1,2,3,3,4,5};
    int[] newArray=new int[array.length-1];
    int position=3;
    DeletionAtSpecificPositionByUsingNewArray obj=new DeletionAtSpecificPositionByUsingNewArray();

    System.out.println("Array elements before deletion:");
    obj.traversal(array);
    obj.deletion(array,newArray,position);
    System.out.println("\nArray elements after deletion:");
    obj.traversal(newArray);

   
    
  }
}