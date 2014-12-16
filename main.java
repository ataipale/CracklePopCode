
public class Solution {
  public static void main(String[] args) {
    for (int n=1; n<101; n++) {
      String toprint=""; 
      if(n % 3==0) {
        toprint+="Crackle";
      } if (n % 5==0) {
        toprint+="Pop";
      }
      if (toprint.length == 0) {
         System.out.println(n);
      } else {
        System.out.println(toprint);
      }
    }
  }
}
