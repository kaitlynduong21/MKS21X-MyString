public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i ++) {
      data[i] = s.charAt(i);
    }
  }

  public char charAt(int index) {
    try {
      return
    } catch (IndexOutofBoundsException e) {
      System.out.println("The index is out of bounds");
    }
  }

  public int length() {
  }

  public CharSequence subSequence(int start, int end){
    try {
    CharSequence sub = new CharSequence[end - start];
    for (int i = start; i < data.length - end; i++) {
      sub += charAt(i);
    }
    return sub;
  } catch (IndexOutofBoundsException e){ //to make sure start, end are not negative, end is not greater than the length, start is not greater than the end
    System.out.println("The index is out of bounds");
  }
  }

  public String toString() {
    String s = new String ();
    for (int i = 0; i < data.length; i++) {
      s += charAt(i);
  }
  return s;
}
}
