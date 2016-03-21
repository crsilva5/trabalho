package AtividadeInterface;

public class ExL extends DesenhoAbstrato{
	
	public static int altura = 8;
	
	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return "L";
	}

	@Override
	public void desenhar() {
		identificar();
		
		System.out.println("L)\n\n");
		
	
		for (int linha= 0; linha <= altura; linha++){
			for( int coluna = 0; coluna <= altura; coluna++){
				
				if ( linha > coluna )  {
					System.out.print(" ");
				}else{
					System.out.print(coluna + " ");
				}
			}

			System.out.print("\n");
		}
		
	}


	
}
