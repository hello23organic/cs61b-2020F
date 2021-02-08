
public class mystery {
   public static boolean mystery(int[] array) {
      int N = array.length;
      if (N % 2 != 0) {
         return false;
      }
      int curr = array[0];
      for (int i = 1; i + 1 < N; i += 2) { 
         if (curr != array[i]) {
            return false; 
         }
         curr = array[i + 1];
      }      
      return true;
}
   
   
   
   public static void main(String[] args) {
      
      int[] array = new int[]{4, 4, 5, 5, 10, 10, 7};
      boolean result = mystery.mystery(array);
      System.out.println(result);
   }
   
}