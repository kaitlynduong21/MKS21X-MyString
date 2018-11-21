public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char (s.length());
    for (int i = 0; i < s.length; i ++) {
      data[i] = s.charAt(i);
    }
  }

  public char charAt(int index) {
    return ;
  }

  public int length() {
    return ;
  }

  public CharSequence subSequence(int start, int end){
    CharSequence sub = new CharSequence[end - start];
    for (int i = start; i < data.length - end; i++) {
      sub += charAt(i);
    }
    return s;
  }

  public String toString() {
    String s = new String ();
    for (int i = 0; i < data.length; i++) {
      s += charAt(i);
  }
  return s;
}
