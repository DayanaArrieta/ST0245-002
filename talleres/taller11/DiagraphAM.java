import java.util.ArrayList;

public class DiagraphAM extends diagraph {

    private int[][] matriz;

    public DiagraphAM(int size) {
        super(size);
        matriz = new int[size][size];
        for(int i = 0; i<size; i++){
            matriz[i][0]=i;
            matriz[0][i]=i;

        }
    }

    public void addArc(int source, int destination, int weight) {
        matriz[source][destination] = weight;

    }

    public ArrayList<Integer> getSuccessors(int vertex) {
            ArrayList<Integer> n = new ArrayList<>();
            for(int i =1 ; i <size; i++){
                if(matriz[vertex][i]!=0){
                    n.add(matriz[0][i]);
                }
            }
            return n;
    }

    public int getWeight(int source, int destination) {
        return matriz[source][destination];
    }

}