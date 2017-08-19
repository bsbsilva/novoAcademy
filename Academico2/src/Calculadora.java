
public class Calculadora<mencao> {
	
	// Determina a menção com  base na nota
	public String calcularMencao (double nota){
		String mencao = "";
		
		if (nota >= 9) {
			mencao = "SS";
		} else {
			if (nota >= 7 ) {
				mencao = "MS";
			} else {				
			if (nota >= 5) {
				mencao = "MM";			
			} else {
				if (nota >= 3) {
					mencao = "MI";					
				} else {
					if (nota >= 0.1) {
						mencao = "II";						
					} else {
						mencao = "SR";
						if (mencao == "SS" || mencao == "MS"  || mencao == "MM") {
							mencao = "Aprovado";
							
							
						} else {
                               mencao = "Reprovado";
                               
						
                              return mencao;
	
					
	
	
				
			
						
		
		
	
						}
					}
				}
			}
			}
		}
		return mencao;
	}
}

			
	
	
	
	
	
	
	
	









