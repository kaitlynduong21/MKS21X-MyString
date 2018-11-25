public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i ++) {
      data[i] = s.charAt(i);
    }
  }

  public char charAt(int index) {
    if (index < 0 || index >= length()) { //if index is out of bounds
      throw new IndexOutOfBoundsException("Index cannot be " + index);
    }
    return data[index];
  }

  public int length() {
    return data.length;
  }

  public CharSequence subSequence(int start, int end){
    if (start < 0 || end > length() || start > end) {
      throw new IndexOutOfBoundsException("Index out of bounds"); //if index is out of bounds
    }
    String sub = "";
    if (start == end) { //accounts for whenever the start and end are the same in which case the subSequence would be empty
      return sub;
    }
    for (int i = start; i < end; i++) {
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
