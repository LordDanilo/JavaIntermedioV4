public class Ejercicio8{
    public String verificarNumero(int numero){
        String res;
        boolean esPrimo = true;
        if(numero==1){
            esPrimo = false;
        }
        for(int div=2; div<=(numero/2) && (esPrimo==true); div++){
            if(numero%div == 0){
                esPrimo = false;
            }
        }
        if(esPrimo == true){
            res = "Es Primo";
        }else{
            res = "Es Compuesto";
        }
        return res;
    }

    public String verificarNumeroRec(int numero){
        String res;
        boolean esPrimo;
        if(numero==1){
            esPrimo = false;
        }else{
            esPrimo = verificarNumeroRec(numero,2);
        }

        if(esPrimo == true){
            res = "Es Primo";
        }else{
            res = "Es Compuesto";
        }
        return res;
    }

    private boolean verificarNumeroRec(int numero, int div){
        boolean res;
        if(div>(numero/2)){
            res = true;
        }else{
            if(numero%div == 0){
                res = false;
            }else{
                res = verificarNumeroRec(numero,div+1);
            }
        }
        return res;
    }
}
