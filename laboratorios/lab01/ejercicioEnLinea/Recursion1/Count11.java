/**
 * This class compute recursively the number of "11" substrings in the string
 * @author: Dayana Arrieta & Juan José Quintana.
 * @version: 26/02/2021
 */
public class Count11 {
    public int count11(String str) {
        if(str.length() > 1){
            if(str.substring(0,2).equals("11"))
                return 1 + count11(str.substring(2));
            return count11(str.substring(1));
        }

        return 0;
    }
}
