public class Demo {
  public static String arrToString(int[] arr){
    String arrTo = "{";
    for (int i = 0; i <arr.length; i++) {
      arrTo += arr[i];
      if (i < arr.length - 1) arrTo += ", ";
    }
    return (arrTo + "}");
  }

  public static String arrayDeepToString(int[][] arr){
    String arrDeepTo = "{";
    for (int i = 0; i < arr.length; i++) {
      arrDeepTo += arrToString(arr[i]) + ", ";
    }
    return arrDeepTo + "}";
  }

  public static void printloop(int n) {
    for (int i=1;i<=n;i++) {
      for (int x=n-i;x>=0;x--) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    if (args.length != 0) {
      printloop(Integer.parseInt(args[0]));
    }
    else {
      printloop(5);
    }
  }
}
