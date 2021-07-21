package exercicio9;

public class EquipamentoCorrigido extends Equipamento {

	private int mesCorrente;
	private int [] mesCompra;
	public EquipamentoCorrigido(int numeroEquipamentos, int mesCorrente) {
		super(numeroEquipamentos);
		this.mesCorrente = mesCorrente;
		this.mesCompra = new int [numeroEquipamentos];
		
	}
	public int getMesCompra(int numero) {
		return this.mesCompra[numero];	
	}
	public void setMesCompra(int numero, int mes) {
        this.mesCompra[numero] = mes;
    }
	public void corrige(int percentual) {
        for (int i = 0; i < this.getNumeroEquipamentos(); i++) {
            int corrigido = getValor(i);
            if (this.mesCompra[i] == this.mesCorrente)
            {
                corrigido *= percentual/100;
                setValor(i, corrigido);
            }
        }
        this.mesCorrente++;
    }
	 public int getMesCorrente(){
	        return this.mesCorrente;
	    }
	    
	    public void setMesCorrente(int mes){
	        this.mesCorrente = mes;
	    }
	    
	    public void substitui(EquipamentoCorrigido corrigido) {
	        
	        if (this.getNumeroEquipamentos() == corrigido.getNumeroEquipamentos()){
	            for (int i = 0; i < this.getNumeroEquipamentos(); i++) {
	                this.setMesCompra(i, corrigido.getMesCompra(i));
	                this.setValor(i, corrigido.getValor(i));
	                this.setMesCorrente(corrigido.getMesCorrente());
	            }
	        }    
	    }
	
}
