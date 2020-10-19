public class Demo {
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
