package Insertion;
import java.util.Scanner;

public class InsertionAtEndUsingNewArray {
  void insertion(int[] array,int[] newArray,int element){
    for(int i=0;i<array.length;i++){
      newArray[i]=array[i];
    }
    newArray[newArray.length-1]=element;
  }
  public static void main(String[] args) {
    InsertionAtEndUsingNewArray obj=new InsertionAtEndUsingNewArray();
    int[] array={1,2,3,4,5};
    int[] newArray=new int[array.length+1];

    System.out.println("Enter an element");
    Scanner scanner=new Scanner(System.in);
    int element=scanner.nextInt();

    obj.insertion(array,newArray,element);

    for(int i:newArray){
      System.out.print(i+"\t");
    }

    scanner.close();

  }
  
}