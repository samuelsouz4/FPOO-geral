
public class MaiorValor {
	
	int n1 = 500;
	int n2 = 3000;
    int n3 = 8;
    
    /* SEM OOERADORES LOGICOS */
    public void verificarMaior1() {
    	
    	if(n1 > n2) {
    	  if(n1 > n3 ) {
          System.out.println("N1 � O MAIOR VALOR");   	
    	  }
    	}
    	
    	if(n1 > n2) {
      	  if(n1 > n3 ) {
            System.out.println("N1 � O MAIOR VALOR");   	
      	  }
      	}  
    	
    	if(n1 > n2) {
      	  if(n1 > n3 ) {
            System.out.println("N1 � O MAIOR VALOR");   	
      	  }
      	}  
    }
 //FIM DO M�TODO verificarMaior1
 
     public void verificarMaior2() {
     
     if((n1 > n2) && (n2 > n3)){
         System.out.println("n1 � maior valor");
     }
     
     if((n2 > n1) && (n2 > n3)){
         System.out.println("n2 � maior valor");
      }
     
     if((n3 > n2) && (n3 > n3)){
         System.out.println("n3 � maior valor");
     }
    
     
     
     
     }
 } 