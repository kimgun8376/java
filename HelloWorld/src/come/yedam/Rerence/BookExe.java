package come.yedam.Rerence;

import java.util.Scanner;

/*
 * 도서명,저자,출판사,판매가격 
 * 
*/

public class BookExe {
   public static void main(String[] args) {
	   Book[] bookRepository = new Book[100];
	  //초기데이터
	   bookRepository[0] = new Book("이것이 자바다", "신용권", "한빛미디어", 2000);
	   bookRepository[1] = new Book("자바스크랩", "신용권", "한빛미디어", 2000);
             
	   
	   Scanner scn = new Scanner(System.in);
	
		boolean run = true;
 
	  // 1.전체목록 2.도서등록 3.조회(출판사) 9.종료  
   while (run) {
	  System.out.println("1.전체목록 2.도서등록 3.조회(출판사) 9.종료");
	 int menu = Integer.parseInt(scn.nextLine());

  
         switch (menu) {
    	case 1: //목력출력. 도서명. 저자. 가격
    		System.out.println("====================");
    		for (int i = 0; i < bookRepository.length; i++)  {
    			if (bookRepository[i] !=null) {
    				System.out.println(bookRepository[i].showBookInfo());
    			}
    		}
         System.out.println("====================");
         break ;
      
    	case 2: //입력
    		//등록하기
    System.out.print("도서명 입력 >>");   
    String name = scn.nextLine();
    System.out.print("저자 입력 >>");   
    String author = scn.nextLine();
    System.out.print("출판사 입력 >>");   
    String press = scn.nextLine();
    System.out.print("가격 입력 >>");   
    int price  = Integer.parseInt(scn.nextLine());
    
	for (int i = 0; i < bookRepository.length; i++)  {
		if (bookRepository[i] == null) {
		    bookRepository[i] = new Book(name, author, press, price);
	     break; // for 종료.
		
		}
	}
    	case 3: 
    		System.out.println("====================");
    		for (int i = 0; i < bookRepository.length; i++)  {
    			if (bookRepository[i] !=null) {
    				System.out.println(bookRepository[i].showBookInfo());
    			}
    		}
         System.out.println("====================");
   
   
         }
         
   }
   
   } // end of main
}
      
    
   