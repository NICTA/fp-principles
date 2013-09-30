class Strings {
  static void method(CharSequence x, CharSequence y) {
    System.out.println(x);
    System.out.println(y);
  }

  static void stringconcat(String i) {
    // is concat a function?
    String expr = "abc".concat(i);
    method(expr, expr);
  }

  public static void main(String[] args) {
    stringconcat("xyz");
  }
}