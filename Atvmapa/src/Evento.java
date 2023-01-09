

public class Evento {
	  private String nome;
	    private String data;
	    private int valor;
	    private int capacidade;
	    private int capacidadeTotal = capacidade;

	    public Evento(String nome, String data, int valor, int capacidade){
	        this.nome = nome;
	        this.data = data;
	        this.valor = valor;
	        this.capacidade = capacidade;
	    }

	    public String getNome(){
	        return nome;
	    }

	    public String getData(){
	        return data;
	    }

	    public int getValor(){
	        return valor;
	    }

	    public int getCapacidade(){
	        return capacidade;
	    }

	    public void setNome(String nome){
	        this.nome = nome;
	    }

	    public void setData(String data){
	        this.data = data;
	    }

	    public void setValor(int valor){
	        this.valor = valor;
	    }

	    public void setCapacidade(int capacidade){
	        this.capacidade = capacidade;
	    }

	    public int  quantidadeIngressosvendidos(){
	        return capacidade - capacidadeTotal;
	    }



	    public void venderIngresso(String nomes, String cpfs, int tipos){

	        if (capacidade > 0){
	            Pista pessoa = new Pista();
	            Ingresso ingresso = new Ingresso();
	        
	            pessoa.setNome(nomes);
	            pessoa.setCpf(cpfs);

	            double valor = ingresso.calculaValor(tipos);

	            this.capacidade --;


	            String ingressos = "";
	            if (tipos == 1){
	                 ingressos = "Pista";
	            }else if (tipos == 2){
	                ingressos = "Vip";
	            }else{
	                ingressos = "Camarote";
	            }

	            System.out.println("Ingresso vendido :" + nomes + " CPF: " + cpfs + " Tipo: " + ingressos + " Valor: " + valor);
	        }else{
	            System.out.println("Todos ingressos vendidos. :(");

	    	    public void venderIngresso(String nomes, String cpfs, int tipos){
	    	    	
	    	    	
	    	    }
	           
	        }

	    }
}
