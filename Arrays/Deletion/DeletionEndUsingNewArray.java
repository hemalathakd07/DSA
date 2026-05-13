package Deletion;
public class DeletionEndUsingNewArray {

  void deletion(int[] array,int[] newArray){
    for(int i=0;i<newArray.length;i++){
      newArray[i]=array[i];
    }
  }

  void traversal(int[] array){
    for(int i=0;i<array.length;i++){
    System.out.print(array[i]+"\t");
  }
}

  public static void main(String[] args){
    DeletionEndUsingNewArray obj=new DeletionEndUsingNewArray();
    int[] array={1,2,3,4,50};
    int[] newArray=new int[array.length-1];
    System.out.println("Array elements before deletion:");
    obj.traversal(array);
    

    obj.deletion(array,newArray);
    System.out.println("\nArray elements after deletion");
    obj.traversal(newArray);

  }
  
}
