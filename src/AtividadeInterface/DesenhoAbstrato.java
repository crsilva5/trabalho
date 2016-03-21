package AtividadeInterface;

public abstract class DesenhoAbstrato implements Desenho {
	
	public void identificar() {

		System.out.println("========================");
		System.out.println(getNome());
		System.out.println("========================");
		System.out.println("\n");
	}
	
	protected abstract String getNome();
		
	
	//public abstract void Desenhar(); 
}
//teste java