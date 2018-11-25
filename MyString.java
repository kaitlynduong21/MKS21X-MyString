public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i ++) {
      data[i] = s.charAt(i);
    }
  }

  public char charAt(int index) {
    if (index < 0 || index > length()) {
      throw new IndexOutofBoundsException("Index cannot be " + index);
    } else {
      return data[index];
    }
  }

  public int length() {
    return data.length;
  }

  public CharSequence subSequence(int start, int end){
    if (start < 0 || end > length() || start > end) {
      throw new IndexOutofBoundsException("Index out of bounds");
    }
    String sub = "";
    for (int i = start; i < length() - end; i++) {
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
}
