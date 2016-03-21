package AtividadeInterface;

public class ExJ extends DesenhoAbstrato{
	
	public static int altura = 10;

	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return "J";
	}
	@Override
	public void desenhar() {
		identificar();
		
		System.out.println("J)\n\n");
		
	
		for (int linha= 0; linha < altura; linha++){
			for( int coluna = 0; coluna < altura; coluna++){
				
				if ( coluna < linha ||coluna >= altura - linha)  {
					System.out.print(" ");
				}else{
					System.out.print("#");
				}
			}

			System.out.print("\n");
		}

		
	}

	// EX:J

}
// operador ternario 