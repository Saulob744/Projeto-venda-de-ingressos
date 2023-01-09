
public class Ingresso {
	 private double ingPista;
	    private double ingVip;
	    private double ingCamarote;

	    double valorOriginal = 100;
	    

	    public double calculaValor(int tipo){
	        double valor;
	        if (tipo == 1){
	            return valorOriginal;
	        }else if (tipo == 2){
	            double percentual = 30.0 / 100.0; 
	            double valorFinal = valorOriginal + (percentual * valorOriginal);
	            return valorFinal;
	        }else{
	            double percentual = 60.0 / 100.0; 
	            double valorFinal = valorOriginal + (percentual * valorOriginal);
	            return valorFinal;
	        }
	    }

	    
	    double percentualSeis = 60.0 / 100.0; 
	    double valorFinalSeis = valorOriginal + (percentualSeis * valorOriginal);

	    double percentualTres = 30.0 / 100.0; 
	    double valorFinalTres = valorOriginal + (percentualTres * valorOriginal);
	   

	    public void imprimirValor(){
	            System.out.println("Valor pista: " + valorOriginal);
	            System.out.println("Valor vip: " +  valorFinalTres);
	            System.out.println("Valor camarote: " + valorFinalSeis);
	        }
   
   
}
