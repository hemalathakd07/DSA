import java.util.Scanner;

public class SentinalSearch {
  static int sentinalSearch(int[] array,int element){
    int i=0;
    int n=array.length;
    int last=array[n-1];
    array[n-1]=element;

    while(array[i]!=element){
      i++;
    }
    array[n-1]=last;

    if(i<n-1|| array[n-1]==element){
      return i;
    }else{
      return -1;
    }
  }

  public static void main(String[] args) {
    int[] array={5,110,21,54,23};
    System.out.println("Enter an element to find it's index:");
    Scanner scanner=new Scanner(System.in);
    int element=scanner.nextInt();
    int result=sentinalSearch(array,element);

    if(result!=-1){
      System.out.println(element+" is found in the index "+result);
    }else{
      System.out.println(element+" is not found in the giiven array");
    }
  }
}