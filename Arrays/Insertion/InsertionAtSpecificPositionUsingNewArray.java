package Insertion;
import java.util.Scanner;

public class InsertionAtSpecificPositionUsingNewArray {
  void insertion(int[] array,int[] newArray,int element,int position){
    for(int i=0;i<position-1;i++){
      newArray[i]=array[i];
    }
    newArray[position-1]=element;
    for(int i=position-1;i<array.length;i++){
      newArray[i+1]=array[i];
    }

  }
  public static void main(String[] args) {
    int[] array={1,2,4,5,6};
    int[] newArray=new int[array.length+1];
    InsertionAtSpecificPositionUsingNewArray obj=new InsertionAtSpecificPositionUsingNewArray();
    System.out.println("Enter an element:");
    Scanner scanner=new Scanner(System.in);
    int element=scanner.nextInt();
    System.out.println("Enter a position:");
    int position=scanner.nextInt();

    obj.insertion(array,newArray,element,position);

    System.out.println("Array elements after insertion:");
    for(int i:newArray){
      System.out.print(i+"\t");
    }
    scanner.close();
  }
}
