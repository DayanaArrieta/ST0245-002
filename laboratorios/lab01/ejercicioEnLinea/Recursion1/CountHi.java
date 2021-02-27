/**
 * This class compute recursively the number of times lowercase "hi" appears in the string.
 * @author: Dayana Arrieta & Juan José Quintana.
 * @version: 26/02/2021
 */
public class CountHi {
    public int countHi(String str){
        if(str.length() < 2)
            return 0;
        if(str.substring(0,2).equals("hi"))
            return 1 + countHi(str.substring(1));
        else
            return  countHi(str.substring(1));
    }
}

