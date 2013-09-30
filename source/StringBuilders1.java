class StringBuilders {
  static void method(CharSequence x, CharSequence y) {
    System.out.println(x);
    System.out.println(y);
  }

  static void sbappend(String i) {
    StringBuilder sb = new StringBuilder("abc");
    // is append a function?
    StringBuilder expr = sb.append(i);
    method(expr, expr);
  }

  public static void main(String[] args) {
    sbappend("xyz");
  }
}