class StringBuilders {
  static void method(CharSequence x, CharSequence y) {
    System.out.println(x);
    System.out.println(y);
  }

  static void sbappend(String i) {
    StringBuilder sb = new StringBuilder("abc");
    // has the program changed?
    
    method(sb.append(i), sb.append(i));
  }

  public static void main(String[] args) {
    sbappend("xyz");
  }
}