import java.util.Scanner;
public class Lexuesi{
   public String emri,mbiemri;
   private String shkolla, vitiILindjes,IDeLexuesit;
   public Lexuesi(String emri1, String mbiemri1, String shkolla1, String vitiILindjes1,String IDeLexuesit1 ){
      emri=emri1;
      mbiemri=mbiemri1;
      IDeLexuesit = IDeLexuesit1;
      shkolla=shkolla1;
      vitiILindjes=vitiILindjes1;
   }
   public String paraqitLexuesin(){
   
      String lexuesi ="----------------------------"+
         			"    Emri - "+emri+
         			"    Mbiemri - "+mbiemri+
                  "    ID e lexuesit - " + IDeLexuesit+
         			"    Shkolla - "+shkolla+ 
         			"    Viti i lindjes - "+vitiILindjes+
         			"\n----------------------------";
      return lexuesi;	
   }
   public String getName() { 
      return emri;
   }
}  
