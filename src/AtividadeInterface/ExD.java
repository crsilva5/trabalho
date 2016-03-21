package AtividadeInterface;

	public class ExD extends DesenhoAbstrato{
		
		public static int altura = 8;
		
		@Override
		protected String getNome() {
			// TODO Auto-generated method stub
			return "D";
		}
		

		@Override
		public void desenhar() {
			identificar();
			System.out.println("D)\n\n");

			int caracteres = altura -1;
			for (int linha= 0; linha <= altura; linha++){
				for( int coluna = 0; coluna <= altura; coluna++){
					if (coluna > caracteres){
						System.out.print("#");
					}else{
						System.out.print(" ");
					}
				}
				caracteres--;
				System.out.print("\n");
			}

			
		}


		// 4 exercicio criar em java

	}