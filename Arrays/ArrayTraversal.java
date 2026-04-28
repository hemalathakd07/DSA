public class ArrayTraversal{
  void traversal(int[] array){
    for(int i=0;i<array.length;i++){
      System.out.print(array[i]+"\t");
    }
  }
  public static void main(String[] args) {
    ArrayTraversal obj=new ArrayTraversal();
    int[] arr={10,20,30,40,50};
    obj.traversal(arr);
  }
}