import java.util.*;
public class BrokenKeyboard {
        public static char keyboard(String s){
            LinkedList<Character> texto = new LinkedList <>();
            int cont = 0;

            for(char c : s.toCharArray()){
                if(c == '['){
                    cont = 0;
                }else if(c == ']'){
                    cont = texto.size();
                }else
                    texto.add(cont++, c);
            }

            StringBuilder t = new StringBuilder();
            for(char l : texto)
                t.append(l);

            System.out.println(t.toString());
            return 0;
        }

    public static void main(String[] args) {
        String s = "This_is_a_[Beiju]_text";
        System.out.println(keyboard(s));
    }
}
//O(n) 
// s is the String used in the brokenkeyboard
// c are the characters in the string s