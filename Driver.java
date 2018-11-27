import java.util.*;

public class Driver {
  public static void main(String[] args) {

//TEJAS DRIVER
  System.out.println("Tejas's Driver (Thank you Tejas!)");

    String refStr = "antidisestablishmentarianism";
    MyString testStr = new MyString(refStr);
    int c = 0;
    if (testStr.length() != refStr.length()) {
      System.out.println(++c + ". length() is " + testStr.length() + " instead of " + refStr.length());
    }

    for (int i = -1; i <= testStr.length(); i++) {
      try {
        if (testStr.charAt(i) != refStr.charAt(i)) {
          System.out.println(++c + ". charAt() is returning the wrong char");
          break;
        }
        if (i < 0 || i >= testStr.length()) {
          System.out.println(++c + ". charAt(" + i + ") should throw an IndexOutOfBoundsException");
        }
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(++c + ". charAt() should not throw an ArrayIndexOutOfBoundsException");
      } catch (IndexOutOfBoundsException e) {
      }
    }

    if (!testStr.toString().equals(refStr)) {
      System.out.println(++c + ". testStr converts to " + testStr + " instead of " + refStr);
    }

    if (!testStr.subSequence(1,7).equals(refStr.subSequence(1,7))) {
      System.out.println(++c + ". subSequence(1,7) is not " + refStr.subSequence(1,7));
    }

    if (testStr.compareTo(refStr) != 0) {
      System.out.println(++c + ". compareTo() should return 0 in this case");
    }

    refStr += "abcd";

    //System.out.println(testStr.length()); to debug
    //System.out.println(refStr.length()); debugging purposes

    if (testStr.compareTo(refStr) >= 0) {
      System.out.println(++c + ". compareTo() should return a negative in this case");
    }

    refStr = refStr.substring(0,20);

    if (testStr.compareTo(refStr) <= 0) {
      System.out.println(++c + ". compareTo() should return a positive in this case");
    }

    if (c == 0) {
      System.out.println("\nYour MyString passed all the tests. Good work!");
    } else {
      System.out.println("\nYour MyString failed " + c + " tests. Keep trying!");
    }

  //ETHAN Driver

  System.out.println("\nEthan's Driver (Thank you Ethan!)\n");

  MyString b,d;
  String a,ca;

  // A list of test cases. Add anything to this list, and it will run through a complete test case on that MyString.
  String[] cases = {
    "",
    "mario",
    "luigi",
    "qwertyuiopasdfghjklzxcvbnm",
    "helpimtrappedinastringfactory"
  };
  // For compareTo(), every string will be compared to every other String (in both directions).

  for (int i = 0; i < cases.length; i++) {
    a = cases[i];
  // Testing Constructor / MyString.toString()
    try {
      b = new MyString(a);
      if (!a.equals(b.toString())) {
          System.out.println("Error in Constructor / toString():");
          System.out.println("\tInput:       \""+a+"\"");
          System.out.println("\tYour result: \""+b+"\"");
          return;
      }
    } catch (Exception e) {
      System.out.println("Unwanted Exception in Constructor:");
      System.out.println("\tInput: \""+a+"\"");
      System.out.println("\nStack Trace:\n");
      e.printStackTrace();
      return;
    }
  // Testing MyString.length()
    if (b.length() != a.length()) {
        System.out.println("Error in length():");
        System.out.println("\tInput:          \""+b+"\"");
        System.out.println("\tDesired result: "+a.length());
        System.out.println("\tYour result:    "+b.length());
        return;
    }
  // Testing MyString.charAt()
    for (int j = 0; j < a.length(); j++) {
      try {
        if (a.charAt(j) != b.charAt(j)) {
          System.out.println("Error in charAt():");
          System.out.println("\tInput:          \""+b+"\".charAt("+j+")");
          System.out.println("\tDesired result: '"+a.charAt(j)+"'");
          System.out.println("\tYour result:    '"+b.charAt(j)+"'");
          return;
        }
      } catch (Exception e) {
        System.out.println("Unwanted Exception in charAt()");
        System.out.println("\tInput:          \""+b+"\".charAt("+j+")");
        System.out.println("\tDesired result: '"+a.charAt(j)+"'");
        System.out.println("\nStack Trace:\n");
        e.printStackTrace();
        return;
      }
    }
  // Testing MyString.subSequence()
      for (int j = 0; j < a.length(); j++) {
        for (int k = j; k <= a.length(); k++) {
          try {
            if (!a.subSequence(j,k).equals(b.subSequence(j,k).toString())) {
              System.out.println("Error in subSequence():");
              System.out.println("\tInput:          \""+b+"\".subsequence("+j+", "+k+")");
              System.out.println("\tDesired result: \""+a.subSequence(j,k)+"\"");
              System.out.println("\tYour result:    \""+b.subSequence(j,k)+"\"");
              return;
            }
          } catch (Exception e) {
            System.out.println("Unwanted Exception in subSequence()");
            System.out.println("\tInput:          \""+b+"\".subsequence("+j+", "+k+")");
            System.out.println("\tDesired result: \""+a.subSequence(j,k)+"\"");
            System.out.println("\nStack Trace:\n");
            e.printStackTrace();
            return;
          }
        }
      }
  // Testing MyString.compareTo()
    for (int j = 0; j < cases.length; j++) {
      ca = cases[j];
      d = new MyString(ca);
      try {
        if (Math.signum(a.compareTo(ca)) != Math.signum(b.compareTo(d))) {
          System.out.println("Unwanted Exception in compareTo()");
          System.out.println("\tInput:          \""+b+"\".compareTo(\""+d+"\")");
          System.out.println("\tDesired result: "+sgn(a.compareTo(ca)));
          System.out.println("\tYour result:    "+sgn(b.compareTo(d)));
          return;
        }
      } catch (Exception e) {
        System.out.println("Unwanted Exception in compareTo()");
        System.out.println("\tInput:          \""+b+"\", \""+d+"\"");
        System.out.println("\tDesired result: "+sgn(a.compareTo(ca)));
        System.out.println("\nStack Trace:\n");
        e.printStackTrace();
        return;
      }
    }
  }
  System.out.println("Your code passed every test. Well done!");

  //GEORGE DRIVER
    System.out.println("George's Driver (Thank you George!)");

        String ans = "";
        Random rng = new Random();
        int length = 1000 + Math.abs(rng.nextInt()) % 10000;
        for (int idx = 0; idx < length; idx++) {
            ans += (char)('A' + Math.abs(rng.nextInt()) % 26);
        }
        MyString test = new MyString(ans);

        //Testing charAt regularly
        for (int idx = 0; idx < length; idx++) {
            if (ans.charAt(idx) != test.charAt(idx)) {
                System.out.println("Failed charAt()\n@line 25");
                System.exit(1);
            }
        }
        System.out.println("Yayyy! Passed charAt()");

        //Testing charAt Exceptions
        for (int idx = 0; idx < 10; idx++) {
            try {
                char here = test.charAt(-1 * Math.abs(rng.nextInt()) - 1); //negative indices
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Awww you failed charAt() exception");
                e.printStackTrace();
                System.exit(1);
            } catch (IndexOutOfBoundsException e) {
            } catch (Exception e) { //who knows what kind of erros you'll make :))
                System.out.println("Awww you failed charAt() exception");
                e.printStackTrace();
                System.exit(1);
            }
        }
        for (int idx = 0; idx < 10; idx ++) {
            try {
                char here;
                if (idx == 0) { //idx > length indices
                    here = test.charAt(length);
                } else {
                    here = test.charAt(length + Math.abs(rng.nextInt()));
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Awww you failed charAt() exception");
                e.printStackTrace();
                System.exit(1);
            } catch (IndexOutOfBoundsException e) {
            } catch (Exception e) { //who knows what kind of errors you'll make :))
                System.out.println("Awww you failed charAt() exception");
                e.printStackTrace();
                System.exit(1);
            }
        }

        //testing length
        if (ans.length() == test.length()) {
            System.out.println("Yayy! you can find the length of a MyString");
        } else {
            System.out.println("Awww you didn't find the length correctly :(\n@line69");
            System.exit(1);
        }

        //testing subSequence helpmeimdying over 1000 times
        for (int idx = 0; idx < 1001; idx++) {
            int startIdx = Math.abs(rng.nextInt()) % length;
            int endIdx = startIdx + Math.abs(rng.nextInt()) % (length - startIdx);
            CharSequence ansSub = ans.substring(startIdx, endIdx);
            CharSequence testSub = test.subSequence(startIdx, endIdx);
            for (int subidx = 0; subidx < ansSub.length(); subidx++) {
                if (ansSub.charAt(subidx) != testSub.charAt(subidx)) {
                    System.out.println("Awww you can't subSequence correctly :o\n@line72");
                    System.exit(1);
                }
            }
        }
        System.out.println("Yayyy you're so good at subSequencing!!");

        //testing subsSequence exceptions sighhh
        for (int idx = 1; idx < 10; idx++) {
            try {
                int start = 1 + Math.abs(rng.nextInt()) % (length - 1); //insures start > 0
                int end = start - Math.abs(rng.nextInt()) % start - 1;
                CharSequence testSub = test.subSequence(start, end); //tests start > end, but start and end are okay by themselves
                System.out.println("YOu faILeD to catch startIdx > endIdx\n@line95");
                System.exit(1);
            } catch (IndexOutOfBoundsException e) {
            }
        }

        for (int idx = 0; idx < 10; idx++) {
            try { //tests negative starts basically subS(negative, anything ok)
                CharSequence testSub = test.subSequence(-1 * Math.abs(rng.nextInt()) - 1, Math.abs(rng.nextInt() % length));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Awww you failed subS exception");
                e.printStackTrace();
                System.exit(1);
            } catch (IndexOutOfBoundsException e) {
            } catch (Exception e) { //who knows what kind of errors you'll make :))
                System.out.println("Awww you failed subS exception");
                e.printStackTrace();
                System.exit(1);
            }
        }

        for (int idx = 0; idx < 20; idx++) {
            try { //tests if either thing is out of bounds aka subS(bad/okay, bad)
                if (idx < 10) { //tests subS(okay, bad) 10 times
                    CharSequence testSub = test.subSequence(Math.abs(rng.nextInt()) % length, length + Math.abs(rng.nextInt()));
                } else { //tests subS(bad, bad) 10 times
                    int start = length + Math.abs(rng.nextInt()) % length;
                    int end = start + Math.abs(rng.nextInt()) + length;
                    CharSequence testSub = test.subSequence(start, end);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Awww you failed subS exception");
                e.printStackTrace();
                System.exit(1);
            } catch (IndexOutOfBoundsException e) {
            } catch (Exception e) { //who knows what kind of errors you'll make :))
                System.out.println("Awww you failed subS exception");
                e.printStackTrace();
                System.exit(1);
            }
        }
        System.out.println("Yayy you can throw an eXcEptIoN for subSequence");
        //I have wasted 1 hour of my life so far end me now

        //testing toString Yayyy
        String ansString = ans.toString();
        String testString = test.toString();
        for (int idx = 0; idx < ansString.length(); idx++) {
            if (ansString.charAt(idx) != testString.charAt(idx)) {
                System.out.println("Booo, you're toString failed :((\n@line143");
                System.exit(1);
            }
        }
        System.out.println("WooHuú you can find the tóString of a Mystring!!");

        //testing compareTo
        //btw I'm assuming you're toString works by the way.
        String ans1 = ""; //say bye bye to the ans you used to know and love ;((
        String ans2 = "";
        length = 1000 + Math.abs(rng.nextInt()) % 10000;
        for (int idx = 0; idx < length; idx++) {
            ans1 += (char)('A' + Math.abs(rng.nextInt()) % 26);
            ans2 += (char)('A' + Math.abs(rng.nextInt()) % 26);
        }
        MyString test1 = new MyString(ans1);
        MyString test2 = new MyString(ans2);

        if (sign(test1.compareTo(test2)) != sign(ans1.compareTo(ans2))) { //some of you found the actually value
            System.out.println("YOu failed the comparing of two strings which are called Mystring :(\n@line162");
            System.exit(1);
        }

        //now testing the thingies thats stated in the compareto method details
        if (sign(test1.compareTo(test1)) != 0) { // x = x
            System.out.println("YOu failed the comparing of two strings which are called Mystring :(\n@line169");
            System.exit(1);
        }

        if (sign(test1.compareTo(test2)) != -1 * sign(test2.compareTo(test1))) { //tests if x > y, y < x
            System.out.println("You are disgrace to famiry for compareTo\n@line174");
            System.exit(1);
        }

        String test3String = "";
        for (int idx = 0; idx < length; idx++) {
            test3String += (char)('A' + Math.abs(rng.nextInt()) % 26);
        }
        MyString test3 = new MyString(test3String); //say hello to test3!!

        if (test1.compareTo(test2) >= 0) { //tests if x >= y and y >= z, then x >= z
            if (test2.compareTo(test3) >= 0) {
                if (test1.compareTo(test3) < 0) {
                    System.out.println("You are disgrace to famiry for compareTo\n@line187");
                    System.exit(1);
                }
            }
        } else {
            if (test2.compareTo(test3) < 0) { //tests if x < y and y < z, then x < z
                if (test1.compareTo(test3) >= 0) {
                    System.out.println("You are disgrace to famiry for compareTo\n@line194");
                    System.exit(1);
                }
            }
        }

        test2 = new MyString(ans1);

        if (sign(test1.compareTo(test3)) != sign(test2.compareTo(test3))) {
            System.out.println("You are disgrace to famiry for compareTo\n@line203");
            System.exit(1);
        }

        System.out.println("Congradulations!! you can do the logic of this lab!!"); //But can you do the exceptions?

        //testing compareTo Exceptions
        try {
            test2 = null;
            test3 = null;
            test2.compareTo(test1);
            test1.compareTo(test3);
            System.out.println("You were incapable of catching nulls for compareTo\n@line216");
            System.exit(1);
        } catch (NullPointerException e) {
        }

        System.out.println("Congradulations!! YOU CAN DO ALL OF THE LAB GIVE YOURSELF A TAP ON THE BACK");

}

public static int sign(int val) {
    if (val > 0) {
        return 1;
    } else if (val == 0) {
        return 0;
    } else {
        return -1;
    }
}

private static String sgn(int i) {
  if (i > 0) return "something positive";
  if (i < 0) return "something negative";
  return "0";
  }
}
