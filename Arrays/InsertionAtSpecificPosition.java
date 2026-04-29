import java.util.Scanner;

public class InsertionAtSpecificPosition {
  void insertion(int[] array,int size,int position,int element){
    
    if(size<array.length){
      for(int i=size;i>=position;i--){
        array[i]=array[i-1];
      }
      array[position-1]=element;
    }else{
      System.out.println("Array is full!");
    }

  }

  void traversal(int[] array,int size){
    for(int i=0;i<size;i++){
      System.out.print(array[i]+"\t");
    }
  }
  public static void main(String[] args) {
    InsertionAtSpecificPosition obj=new InsertionAtSpecificPosition();
    int[] array=new int[10];
    int size=5;
    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter array elements:");
    for(int i=0;i<size;i++){
      array[i]=scanner.nextInt();
    }
    int position=3;
    System.out.println("Enter an element:");
    int element=scanner.nextInt();
    if (position < 1 || position > size + 1) {
            System.out.println("Invalid position!");
            return;
  }else if (size >= array.length) {
            System.out.println("Array is full!");
  }else{
            obj.insertion(array,size,position,element);
            size++;
        }
    

    obj.traversal(array,size);

    scanner.close();
    
  }
}