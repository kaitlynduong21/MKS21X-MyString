public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i ++) {
      data[i] = s.charAt(i);
    }
  }

  public char charAt(int index) {
    if (index < 0 || index >= length()) {
      throw new IndexOutOfBoundsException("Index cannot be " + index);
    }
    return data[index];
  }

  public int length() {
    return data.length;
  }

  public CharSequence subSequence(int start, int end){
    if (start < 0 || end >= length() || start > end) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    String sub = "";
    for (int i = start; i < start + end - 1; i++) {
      sub += charAt(i);
    }
    return sub;
  }

  public String toString() {
    String s = "";
    for (int i = 0; i < data.length; i++) {
      s += charAt(i);
  }
  return s;
}

public int compareTo(CharSequence s) {
  for (int i = 0; i < s.length() && i < this.length() ; i ++) {
    //System.out.println(i); to debug
    if (s.charAt(i) > this.charAt(i)) {
      return -1;
    }
    if (s.charAt(i) < this.charAt(i)) {
      return 1;
    }
  }
  return this.length() - s.length();
}
}
