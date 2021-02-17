class Taller4{
    public static void main(String[] args){
        for(int i = 20; i < 40; i++){
        lon inicio = System.currentTimeMillis();
        System.out.println(fibonacci(6));
        long fin = System.currentTimeMillis();
        long total = fin - inicio;
        System.out.println("El tiempo total fue de " + total " ms");
    }
    }
public static int fibonacci(int n){
    if(n == 0) {return 0;
    } else{
        return fibonacci(n-1) +fibonacci(n-2)
    }
}
}