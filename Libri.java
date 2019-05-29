public class Libri{
   public String titulli,statusi,huamarresi,dataEHuazimit,dataEKthimit;
   private String autori,IDeLibrit;
   public Libri(String titulli1,String autori1,String IDeLibrit1)
   {  titulli=titulli1;
      autori = autori1;
      IDeLibrit = IDeLibrit1;
      huamarresi = "Askush";
      dataEHuazimit="Asnje";
      dataEKthimit="Asnje";
      statusi = " Ne dispozicion";}

   public String paraqitLibrin(){
   
      String Libri ="----------------------------"+
         			"     Titulli - "+titulli+
         			"     Autori - "+autori+
                  "     ID e librit - " + IDeLibrit+
         			"     Statusi - "+statusi+
         			"     Huamarresi - "+huamarresi+
         			"     Data e huazimit - "+dataEHuazimit+
         			"     Data e kthimit - "+dataEKthimit+
         			"\n----------------------------";
      return Libri;	
   }
}

