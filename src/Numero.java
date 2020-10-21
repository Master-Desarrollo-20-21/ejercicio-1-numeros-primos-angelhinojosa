public class Numero {
    

    public int sumaPrimos() {
        
        int suma = 0;
        for(int i =1; i<=50; i++){
            if (primo(i)){
                suma += i;
            }
        }
    
        return suma;
    }

    public int sumaPrimerosPrimos() {
        
        int suma = 0;
        int contador = 0;
        int numero = 0;

        while (contador <50){
            numero += 1;
            if (primo(numero)){
                suma += numero;
                contador += 1;
            }
        }
            
        return suma;
    }

    public boolean primo(int numero){
        boolean primo;
        int divisores = 0;

        for(int i=1; i<=numero; i++){
            if (numero % i == 0){
                divisores += 1;
            }
        }

         
        if (divisores == 2){
            primo = true;
        }else{
            primo = false;
        }
        
        return primo;
    }


}
