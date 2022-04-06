import java.util.Array;
public class DNA {

	public static void main(String[] args) {
		
		String dna[] = new String [3];
		
		  dna[0] = "ATGCGATACGCTTGA";
		  dna[1] = "ATGCGATACGTGA";
		  dna[2] = "ATTAATATGTACTGA";
		  
		  for(int i = 0; i < dna.length; i++) {
			  
		   int length = dna[i].length();
		   String end = dna[i].substring(dna[i].length()-3);
		   int start = dna[i].indexOf("ATG");
		   
		   if (length % 3 == 0  && start == 0 && end.equals("TGA")) {
		   System.out.println(dna[i] + ":" + " The dna contains protein.");
		   
		   } else { 
			   System.out.println(dna[i] + ":" + " The dna contains no protein.");
			  
			  
		 }
		
		  }
	}

		  
	

