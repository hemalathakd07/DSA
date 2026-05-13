package Insertion;
public class InsertionAtBeginningUsingNewArray {
  void insertion(int[] array,int[] newArray,int element){
    newArray[0]=element;
    for(int i=0;i<array.length;i++){
      newArray[i+1]=array[i];
    }
  }

  public static void main(String[] args) {
    int[] array={1,2,3,4,5};
    int[] newArray=new int[array.length+1];
    int element=0;
    InsertionAtBeginningUsingNewArray obj=new InsertionAtBeginningUsingNewArray();
    obj.insertion(array,newArray,element);

  for(int i:newArray){
    System.out.print(i+"\t");
  }
  
  }
}