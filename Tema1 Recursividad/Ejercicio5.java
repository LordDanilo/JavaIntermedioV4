public class Ejercicio5{
    public int multiplicar(int n, int m){
        int res = 0;
        while(m>0){
            res = res+n;
            m--;
        }
        return res;
    }
    public int multiplicarRec(int n, int m){
        int res;
        if(m==0){
            res = 0;
        }else{
            res = n+multiplicarRec(n,m-1);
        }
        return res;
    }
}
