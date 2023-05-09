
package conversordemonedas.logica;

public class Logica {
    private double valor, resultado;
    private int de, a;
    

    public Logica() {
       
        
    }
    
    // tipo de cambio
    public double convertir(){
        
        switch (de) {
            case 0:
                if(a==1){
                    resultado = valor * 0.91;
                }else if(a==2){
                    resultado = valor * 3.71;
                }else if(a==3){
                    resultado = valor * 0.79;
                }
                else if(a==0){
                    resultado = valor;
                }else if(a==4){
                    resultado = valor * 135.08;
                }else if(a==5){
                    resultado = valor * 1323.16;
                }
                break;
            case 1:
                if(a==1){
                    resultado = valor;
                }else if(a==2){
                    resultado = valor * 4.08;
                }else if(a==3){
                    resultado = valor * 0.87;
                }
                else if(a==0){
                    resultado = valor * 1.10;
                }else if(a==4){
                    resultado = valor * 148.57;
                }else if(a==5){
                    resultado = valor * 1454.02;
                }
                break;
            case 2:
                if(a==1){
                    resultado = valor * 0.25;
                }else if(a==2){
                    resultado = valor;
                }else if(a==3){
                    resultado = valor * 0.21;
                }
                else if(a==0){
                    resultado = valor * 0.27;
                }else if(a==4){
                    resultado = valor * 36.45;
                }else if(a==5){
                    resultado = valor * 356.94;
                }
                break;
            case 3:
                if(a==1){
                    resultado = valor * 1.15;
                }else if(a==2){
                    resultado = valor * 4.68;
                }else if(a==3){
                    resultado = valor;
                }else if(a==4){
                    resultado = valor * 170.40;
                }else if(a==5){
                    resultado = valor * 1668.90;
                }
                break;
            case 4:
                if(a==1){
                    resultado = valor * 0.0067;
                }else if(a==2){
                    resultado = valor * 0.027;
                }else if(a==4){
                    resultado = valor;
                }else if(a==0){
                    resultado = valor * 0.0074;
                }else if(a==3){
                    resultado = valor * 0.0059;
                }else if(a==5){
                    resultado = valor * 9.80;
                }
                break;
            case 5:
                if(a==1){
                    resultado = valor * 0.00069;
                }else if(a==2){
                    resultado = valor * 0.0028;
                }else if(a==5){
                    resultado = valor;
                }else if(a==0){
                    resultado = valor * 0.00076;
                }else if(a==4){
                    resultado = valor * 0.10;
                }else if(a==3){
                    resultado = valor * 0.00060;
                }                
                break;
                         
            
        }
        
        return resultado;
               
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResultado() {
        return resultado;
    }

    public int getDe() {
        return de;
    }

    public void setDe(int de) {
        this.de = de;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    

   
    
   
}
