package bloco3;

public class Main {
    public static void main(String[] args) {
        
        //soma dois numeros
        System.out.println(Standalone.add.aplly(3).aplly(5));
        
        //funcão fibonacci com tecnica de memorização
        System.out.println(Memoization.fibo(10));
    }
    
    public static int addRec(int x, int y){
        return y == 0 ? x : addRec(++x, --y);
    }
}
