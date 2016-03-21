package AtividadeInterface;

public class ExG extends DesenhoAbstrato{
	
	public static int altura = 8;

	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return "G";
	}
	@Override
	public void desenhar() {
		
		System.out.println("G)\n\n");
		identificar();
		
		int a = altura -1;
		for (int linha= 0; linha < altura; linha++){
			for( int coluna = 0; coluna < altura; coluna++){
				
				if (linha == altura -1|| linha == 0 || coluna == a ){
					System.out.print("#");
				}else{
					System.out.print(" ");
				}
			}
			a--;
			System.out.print("\n");
		}

		
	}


	

}