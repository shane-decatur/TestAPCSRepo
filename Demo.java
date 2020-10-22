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

  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        int tempInt = Math.round((int) ((maxValue + 1) * Math.random()));
        arr[i][j] = tempInt;
      }
    }
    return arr;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
    int[][] arr = new int[rows][];
    for (int i = 0; i < rows; i++) {
      int tempCol = Math.round((int) ((cols + 1) * Math.random()));
      arr[i] = new int[tempCol];
    }
    for (int x = 0; x < rows; x++) {
      for (int y = 0; y < arr[x].length; y++) {
        int tempVal = Math.round((int) ((maxValue + 1) * Math.random()));
        arr[x][y] = tempVal;
      }
    }
    return arr;
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
