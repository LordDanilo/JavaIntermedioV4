public class Ejercicio2{
    public int factorial(int numero){
        int res = 1; //3
        for(int n=numero; n>0; n=n-1){
            res = res*n;
        }
        return res;
    }

    public int factorialRec(int numero){
        int res; //3
        if(numero==0){
            res = 1;
        }else{
            res = numero*factorialRec(numero-1);
        }
        return res;
    }
}
