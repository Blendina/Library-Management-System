import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DataBases
{    
     static ArrayList<Lexuesi> LexuesiList = new ArrayList<Lexuesi>();
     static ArrayList<Libri> LibriList = new ArrayList<Libri>();
     private int  a;
     public int b ;
     private String  titulli, autori,huamarresi, 
     emri ,mbiemri, shkolla,IDeLexuesit, vitiILindjes,IDeLibrit, status1 = "E lire",status2 = "E huazuar"; 
     private Scanner c = new Scanner(System.in);
     private Scanner d = new Scanner(System.in);
     
    
   
	  public void displayFirstMenu(){
		System.out.println("> Zgjedhni njerin nga opsionet e meposhtme duke shtypur numrin perkates:\n"+
		                   ">************************************************************************\n"+
		                   "2- Shto nje liber ne librari\n"+
		                   "6- Kontrollo librarine.\n"+
		                   "7- Kthehu ne menyne kryesore\n"+
                         "8- Shtoni nje lexues ne librari\n"+
                         "0- Dil");
		System.out.println();
		System.out.println("> Shtyp opsionin tend ketu: ");
		String cho = d.nextLine();//User inputs a b (integer).
     if (cho.equals("2")||cho.equals("6")||cho.equals("7")||cho.equals("8")||cho.equals("0")){b=new Integer(cho).intValue();}
    else{  System.out.println("Numri qe shtypet nuk eshte valid, provoni perseri");
    System.out.println();
    this.displayFirstMenu(); }

	}
 
	public  void displaySecondMenu(){
		System.out.println("> Zgjidh njerin nga opsionet e meposhtme duke shtypur numrin perkates: "+"\n"+
		                   ">****************************************************************"+"\n"+
		                   "1- Kontrollo listen e librarise\n"+
		                   "2- Shto nje liber ne librari\n"+
                         "3- Huazo nje liber nga libraria\n"+
		                   "4- Ktheje nje liber ne librari\n"+
		                   "5- Fshije nje liber nga libraria\n"+
		                   "6- Fshij cdo gje nga libraria\n"+
		                   "7- Kthehu ne menyne kryesore\n"+
                         "8- Shto nje lexues ne librari\n"+
                         "9- Kontrollo listen e lexueseve\n"+
                         "0- Dil.");
		System.out.println();
		System.out.println("> Shtypni njerin nga opsionet e mesiperme: ");
		String ch = d.nextLine();//User inputs a b (integer).
      if (ch.equals("1")||ch.equals("2")||ch.equals("3")||ch.equals("4")||ch.equals("5")||ch.equals("6")
      ||ch.equals("7")||ch.equals("8")||ch.equals("9")||ch.equals("0")){b=new Integer(ch).intValue();}
  else{  //System.out.println("The number u typed is invalid,try again");
    System.out.println();
    this.displaySecondMenu(); }
   		}


	
     
 
   public  void addBook(){
		 //create new book object with status "Available."
      System.out.println("> Shtype titullin e librit: ");
		titulli = c.nextLine();
 
		System.out.println("> Shtype emrin e autorit: ");
		autori = c.nextLine();
 
      System.out.println("> Shtype ID-ne e librit: ");
		IDeLibrit = c.nextLine();
       
		Libri newLibri=new Libri(titulli, autori,IDeLibrit);
		LibriList.add(newLibri);//add the book to the BookList ArrayList.
		System.out.println("---------------------------------------------------------");
		System.out.println("> E keni shtuar nje liber ne librari me sukses!\n");
		System.out.println("---------------------------------------------------------");	
	}
   
      
  public void displayBookList(){
		if (LibriList.size() == 0){//If the library is empty, it goes back to main menu and b.
			System.out.println(">-------------------------------------------------------------");
			System.out.println("> Libraria eshte e zbrazet!Ju lutem shtoni nje liber fillimisht\n");
			System.out.println(">-------------------------------------------------------------");
			displayFirstMenu();//Display to main menu.
			b = d.nextInt();//Register new b.
 
		} else {					
			for (int i = 0; i < LibriList.size(); i++){
				System.out.printf("\n>Indeksi ilibrit: [%s] \n",i+1);
				System.out.println(LibriList.get(i).paraqitLibrin());	
				System.out.println(">-------------------------------------------------------------");
			}		
		}			
	}

 public  void addStudent(){
		 //create new book object with status "Available."
      System.out.println("> Shtyp emrin e lexuesit: ");
		emri = c.nextLine();
 
		System.out.println("> Shtype mbiemrin e lexuesit ");
		mbiemri = c.nextLine();
 
		System.out.println("> Shtype shkollen e lexuesit");
		shkolla= c.nextLine();
 
		System.out.println("> Shtype vitin e lindjes te lexuesit: ");
		vitiILindjes = c.nextLine();
      
      System.out.println("> Shtype numrin e ID-se se lexuesit: ");
		IDeLexuesit = c.nextLine();
       
		Lexuesi newLexuesi=new Lexuesi(emri,mbiemri,shkolla,vitiILindjes,IDeLibrit);
		LexuesiList.add(newLexuesi);//add the book to the BookList ArrayList.
		System.out.println("---------------------------------------------------------");
		System.out.println("> Me sukses keni shtuar nje liber ne librari!\n");
		System.out.println("---------------------------------------------------------");	
	}

 public void displayStudentList(){
		if (LexuesiList.size() == 0){//If the library is empty, it goes back to main menu and b.
			System.out.println(">-------------------------------------------------------------");
			System.out.println("> Libraria eshte e zbrazet!Ju lutem shtoni nje liber fillimisht\n");
			System.out.println(">-------------------------------------------------------------");
			displayFirstMenu();//Display to main menu.
			b = d.nextInt();//Register new b.
 
		} else {					
			for (int i = 0; i < LexuesiList.size(); i++){
				System.out.printf("\n>Indeksi i lexuesit: [%s] \n",i+1);
				System.out.println(LexuesiList.get(i).paraqitLexuesin());	
				System.out.println(">-------------------------------------------------------------");
			}		
		}			
	}

 
   public void borrowBook(){
		System.out.println("---------------------------------------------------------");
		System.out.println("> Ketu jane te gjith librat e regjistruar ne librari: ");
		System.out.println("---------------------------------------------------------");		
		displayBookList();
 
		borrowLoop1:
		while(b == 3){
			System.out.println("\n\n> Zgjedhe nje liber te lire nga lista e mesiperme dhe shkruaj poshte numrin e indeksit te saj: ");
			a = d.nextInt()-1;//register user's book b.
			if(a > LibriList.size()){
				System.out.println("> The number of the book you entered is not in the list!");
            System.out.println();
            this.borrowBook();
			}else{
				break borrowLoop1;  
			}
		}		
 
		borrowLoop2:
		while(b == 3){
			//Check if the book to be borrowed is available.
			if (LibriList.get(a).statusi.equalsIgnoreCase(status1) && LibriList.size() >= a){
				//Print the borrowed book information and change the book status to borrowed.
				LibriList.get(a).statusi = "E huazuar";
				System.out.printf("\n> Ju e keni zgjedhur librin ne vijim: %s\n", LibriList.get(a).paraqitLibrin());
 
				//add the user name to the book borrower variable:
				LibriList.get(a).huamarresi = huamarresi;
				LibriList.get(a).dataEHuazimit = "Sot.";
				LibriList.get(a).dataEKthimit = "Brenda tre javeve.";
				System.out.println("> Ju duhet ta ktheni librin brenda tre javeve!");
				b = 7;
				break borrowLoop2;
 
			}else if(LibriList.get(a).statusi.equalsIgnoreCase(status2) && LibriList.size() >= a){
				System.out.println("> Libri qe deshironi te huazoni nuk eshte ne dispozicion!");
				b = 7;
				break borrowLoop2;
			}else if(a > LibriList.size()-1){
				System.out.println("> Numri qe shtypet nuk eshte ne liste!");
				b = 7;
				break borrowLoop2;
			}
		}
	}
   
 public void returnBook(){
		System.out.println("> Shtypni titullin e librit qe deshironi ta ktheni: ");
		String returnBookTitle = c.nextLine();
		int x = 0;
		while (x < LibriList.size()){//Search for the book by title, if it exists change it's status,
									//it's borrower and borrowDate.
			if (LibriList.get(x).titulli.equalsIgnoreCase(returnBookTitle)){
				LibriList.get(x).statusi = "E lire";
				LibriList.get(x).huamarresi = "Asnje";
				LibriList.get(x).dataEHuazimit = "Asnje";
            LibriList.get(x).dataEKthimit = "Asnje";
				System.out.println("> Me sukses keni kthyer librin ne librari!");
				break;//if a title is found, break out of the loop and display b menu.
			}
			
	else{
			System.out.println("> Nuk ka libra te till me kete emer ne librari." +
					" Sigurohuni qe e keni shkruar emrin e titullit mir ose zgjidhni qe te shtoni nje liber " +
					"ne librari nga menyja kryesore. ");					
			}
         x = x+1;
		}
		displaySecondMenu();
		
	}
 
   public void removeBook(){
		int i = 0;
		System.out.println("---------------------------------------------------------");
		System.out.println("> Ketu jane te gjithe librat e regjistruar ne librari: ");
		System.out.println("---------------------------------------------------------");
 
	
    displayBookList();
		System.out.println("\n\n> Zgjedhe nje liber te lire nga lista e mesiperme dhe shkruaj poshte numrin e indeksit te saj: ");
		int a = d.nextInt()-1;//register user's book b
		               
                if( a >= LibriList.size())
            	{System.out.println("<Gabim> Ju lutem shtypeni nje numer le librit nga lista: ");
               this.removeBook();}


			else	if (a >= 0 && a < LibriList.size() && LibriList.get(a).statusi.equalsIgnoreCase("I lire")){
         //Check if the book to be borrowed is available.
					//Print the borrowed book information and change the book status to borrowed.
					System.out.printf("\n>Ju keni zgjedhur qe ta fshini librin e ardhshem: %s\n", LibriList.get(a));
               LibriList.remove(a);
					System.out.println("\n> The Book  "+(a+1)+" is deleted.\n");}
				else if (a >= 0 && a< LibriList.size() && LibriList.get(a).statusi.equalsIgnoreCase("E huazuar"))
            System.out.printf("\n> Libri %s nuk eshte fshire,sepse nuk eshte i lire");
     		}		
	
 
 public void emptyLibrary(){
		System.out.println("> WARNING < Ju keni vendosur qe te fshini te gjithe librat ne librari! ");
		System.out.println("> A jeni i/e sigurte?? Shtypni po ose jo: ");
		String confirmation = c.nextLine();
		try{
			if(confirmation.equalsIgnoreCase("po")){
				System.out.println("> Libraria eshte duke u fshire...");
				LibriList.clear();
				System.out.println("> Libraria eshte e zbrazet!");
				b = 7;
			}
		}catch(InputMismatchException error){
			System.out.println("<Gabim> Sigurohuni qe te shtypni po ose jo sakte: ");
			b = 6;
		}
	}
 
 
	public void addUser(){
		System.out.println("> Shtypni emrin e lexuesit: ");
		huamarresi = c.nextLine().trim();
      for(int i=0;i<LexuesiList.size();i++){
      if(LexuesiList.get(i).emri.equalsIgnoreCase(huamarresi)){}
      else{System.out.println("<Gabim> Nuk ka nje lexues te till te regjistrurar ne librari: ");
      this.addUser();}
			}
	}}