import java.util.InputMismatchException;
public class Libraria
{
DataBases libraria=new DataBases();
public void run(){
 		
 
		libraria.displayFirstMenu();
 
	
 
		exit:
 
			while(libraria.b != 0){	
				
            					
		if(libraria.b == 1 && libraria.LibriList.size() > 0){
 
						libraria.displayBookList();
						libraria.b = 7;
					}
 
					if(libraria.b == 1 && libraria.LibriList.size() == 0){
						System.out.println("<ERROR> Libraria eshte e zbrazet! Ju luutem shtoni nje liber separi!");
						libraria.b = 7;
					}
					
		if(libraria.b == 2){
					
						libraria.addBook();
						libraria.displaySecondMenu();
					}
					
		if(libraria.b == 3){
						if(libraria.LibriList.size() > 0)
                  {
							libraria.addUser();
                     libraria.borrowBook();
                     libraria.displaySecondMenu();							
						}						
					}
					
		if(libraria.b== 4){
						libraria.returnBook();
                  libraria.displaySecondMenu();
                  
                  
					}
					
		if(libraria.b  == 5){
						libraria.removeBook();
							if(libraria.LibriList.size() > 0)
                     {
								libraria.displaySecondMenu();
                       
							}
						
						else
                  {	System.out.println("<ERROR> The array is Empty! Please add a book first!");
							 libraria.displayFirstMenu();}
                  }
							
						
				
            
					
		if(libraria.b == 6){
						libraria.emptyLibrary();						
					}
					
		if(libraria.b == 7){
						if(libraria.LibriList.size() > 0){
							libraria.displaySecondMenu();
						}else if(libraria.LibriList.size() == 0){							
							libraria.displayFirstMenu();
						}
					}
     if(libraria.b == 8){
					
						libraria.addStudent();
						libraria.displaySecondMenu();
					}
     if(libraria.b == 9&& libraria.LexuesiList.size() > 0){
 
						libraria.displayStudentList();
						libraria.b = 7;
					}
 
					if(libraria.b == 9 && libraria.LexuesiList.size() == 0){
						System.out.println("<ERROR> Libraria eshte e zbrazet! Ju lutem shtoni nje liber se pari!");
						libraria.b = 7;
					}


					
					if(libraria.b == 0){
						break exit;
					}}
			
      System.out.println();
		System.out.println(" Ju keni dalur nga librari! ");
 
		}
 
 public static void main(String[] args){
 
		System.out.println("> Mire se vini ne librari!");
 
		Libraria newBook = new Libraria();
		newBook.run();
 
	}


}