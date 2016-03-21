package AtividadeInterface;

public class ExK extends DesenhoAbstrato{
	
	public static int altura = 10;
	
	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return "K";
	}
	

	@Override
	public void desenhar() {
		identificar();
		
		System.out.println("K)\n\n");
		
	
		for (int linha= 0; linha < altura; linha++){
			for( int coluna = 0; coluna < altura; coluna++){
				
				if ( coluna >= linha ||coluna < altura -1 - linha)  {
					System.out.print(" ");
				}else{
					System.out.print("#");
				}
			}

			System.out.print("\n");
		}

		
	}



}
// operador ternario 