package AtividadeInterface;

	public class ExC extends DesenhoAbstrato{
		
		public static int altura = 8;
		@Override
		protected String getNome() {
			// TODO Auto-generated method stub
			return "C";
		}	

		@Override
		public void desenhar() {
			identificar();
			
			System.out.println("C)\n\n");

			int zero = 0;
			for (int linha= 0; linha < altura; linha++){
				for( int coluna = 0; coluna < altura; coluna++){
					if (coluna >= zero){
					System.out.print("#");
				}else{
					System.out.print(" ");
				}
			}
				zero++;
				System.out.print("\n");
				}
			}

		// 3 exercicio criar em java
	
		}

