import java.util.Scanner;

public class DeletionAtBeginning {
  void deletion(int[] array,int size){
    for(int i=0;i<size;i++){
      array[i]=array[i+1];
    }
    array[size-1]=0;

  }
  public static void main(String[] args) {
    DeletionAtBeginning obj=new DeletionAtBeginning();
    int[] array=new int[10];
    int size=5;
    System.out.println("Enter array elements:");
    Scanner scanner=new Scanner(System.in);
    for(int i=0;i<size;i++){
      array[i]=scanner.nextInt();
    }

    obj.deletion(array,size);
    size--;
    
  
  for(int i=0;i<size;i++){
    System.out.print(array[i]+"\t");
  }
  scanner.close();
  
}
}
