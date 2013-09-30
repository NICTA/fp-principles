class Strings {
  static void method(CharSequence x, CharSequence y) {
    System.out.println(x);
    System.out.println(y);
  }

  static void stringconcat(String i) {
    // has the program changed?
    
    method("abc".concat(i), "abc".concat(i));
  }

  public static void main(String[] args) {
    stringconcat("xyz");
  }
}