package AtividadeInterface;

public class ExF extends DesenhoAbstrato{
	
	public static int altura = 8;

	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return "F";
	}
	
	@Override
	public void desenhar() {
		identificar();
		
		System.out.println("F)\n\n");

		for (int linha= 0; linha < altura; linha++){
			for( int coluna = 0; coluna < altura; coluna++){
				
				if (linha == altura -1|| coluna == linha || linha == 0  ){
					System.out.print("#");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

		
	}



}