public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        if (x.length()>=2 && (x.substring(x.length()-2)).equals("ly"))
            return true;
        else
            return false;
    }

    public String conCat(String s1, String s2) {
        if (s1.equals(s2))
            return s1+=s2.substring(1);
        if (s1.isEmpty() || s2.isEmpty())
            return s1+=s2;
        String c1l = s1.substring(s1.length()-1);
        String c2f = s2.substring(0,1);
        if (c1l.equals(c2f))
            return s1+=s2.substring(1);
        else
            return s1+=s2;
    }

    public String withoutX(String s1) {
        if (s1.substring(s1.length()-1).equals("x"))
            s1=s1.substring(0,s1.length()-1);
        if (s1.substring(0,1).equals("x"))
            s1=s1.substring(1);
        return s1;
    }

    public String fizzString(String s1) {
        String result="";
        if (s1.substring(0,1).equals("f"))
            result+="Fizz";
        if (s1.substring(s1.length()-1).equals("b"))
            result+="Buzz";
        return result;
    }

    public String fizzString2(int x) {
        String fOrB="";
        if (x%3==0)
            fOrB+="Fizz";
        if (x%5==0)
            fOrB+="Buzz";
        if (fOrB.isEmpty())
            return ""+x+'!';
        else
            return fOrB+'!';
    }

}
