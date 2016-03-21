package AtividadeInterface;

public class ExE extends DesenhoAbstrato{
	
	public static int altura = 8;

	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return "E";
	}
	@Override
	public void desenhar() {
		identificar();
		
		System.out.println("E)\n\n");

		for (int linha= 0; linha < altura; linha++){
			for( int coluna = 0; coluna < altura; coluna++){
				
				if (coluna == 0 || coluna == altura - 1 || linha == 0 || linha == altura -1 ){
					System.out.print("#");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

		
	}

	// EX:E
}