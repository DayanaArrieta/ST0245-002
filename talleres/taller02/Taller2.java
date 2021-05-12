/**
 * This code has all three requests of the second workshop.
 * @author: Dayana Arrieta & Juan José Quintana.
 * @version: 03/02/2021
 */
public class Taller2{

    public static int gcd(int p, int q){
        int answ=p % q;
        if (answ  == 0)
        return q;
        return gcd(q, p%q);
    }

    public static boolean SumaGrupo(int[] nums, int target) {
        return SumaGrupo(0, nums, target);
    }

    private static boolean SumaGrupo(int start, int[] nums, int target) {
        if (start == nums.length)
            return target == 0;
        //else
        boolean pongo = SumaGrupo(start+1, nums, target - nums[start]);
        boolean noPongo = SumaGrupo(start+1, nums, target);
        return pongo || noPongo;
    }

    public static void combinations(String s) {
        combinationsAux("", s);
    }

    private static void combinationsAux(String prefix, String s) {
        if(s.length()==0) {
            System.out.println( prefix );
        }else{
            combinationsAux( prefix + s.charAt(0), s.substring(1));
            combinationsAux( prefix, s.substring( 1 ));
        }
    }

}
