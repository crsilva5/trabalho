package AtividadeInterface;

public class ExN extends DesenhoAbstrato{
	
	public static int altura = 8;

	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return "N";
	}
	
	@Override
	public void desenhar() {
		identificar();
		
		System.out.println("N) \n\n");
		
	
		for (int linha= 0; linha < altura; linha++){
			for( int coluna = 0; coluna < altura; coluna++){
				
				if ( linha <= coluna )  {
					System.out.print(coluna + " ");
				}else{
					System.out.print(linha + " ");
				}
			}

			System.out.print("\n");
		}
		
	}

	// teste java
}
