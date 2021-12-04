public class Ejercicio3{
    public int contarDigPares(int numero){
        int res = 0;
        while(numero>0){
            int dig = numero%10;
            if(dig%2==0){
                res++;
            }
            numero = numero/10;
        }
        return res;
    }
    public int contarDigParesRec(int numero){
        int res;
        if(numero==0){
            res = 0;
        }else{
            int dig = numero%10;
            int valor = 0;
            if(dig%2==0){
                valor = 1;
            }
            res = valor+contarDigParesRec(numero/10);
        }
        return res;
    }
}
