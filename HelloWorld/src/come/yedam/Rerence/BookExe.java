package come.yedam.Rerence;

import java.util.Scanner;

/*
 * 도서명,저자,출판사,판매가격 
 * 
*/
public class BookExe {
	// 저장공간에 값을 초기값을 생성.
	public static void main(String[] args) {

	
		Book[] bookRepository = new Book[100];

		

		//초기데이터
	   bookRepository[0] = new Book("이것이 자바다", "신용권", "한빛미디어", 2000);
	   bookRepository[1] = new Book("자바스크랩", "김기초", "한빛미디어", 2000);
	   bookRepository[2] = new Book("혼자공부하는 자바", "김자바", "자바출판사", 2000);
 //end of init()
	   Scanner scn = new Scanner(System.in);
	
		boolean run = true;
		// 목록출력 void printList() {
			
		

		//도서등록.
		// 목록 (출판사)
		/*public static 
		 * 
		 * 
		 * 
		 * 
		*
	  // 1.전체목록 2.도서등록 3.조회(출판사) 9.종료  
	  ///
	  ///
	   */
		
		
   while (run) {
	  System.out.println("1.전체목록 2.도서등록 3.조회(출판사) 4.금액수정 5.상세조회 9.종료");
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
         break;
        
    	case 4 : //수정.
    		System.out.print("도서명 입력>>");
    		name = scn.nextLine();
    		System.out.print("가격 입력>>");
    		price = Integer.parseInt(scn.nextLine());
    		// 도서명으로 검색 => 입력값으로 필드변경.
    		boolean isExist = false; // 변수 
    		for (int i = 0; i < bookRepository.length; i++) {
    			if (bookRepository[i] != null && bookRepository[i].BookName().equals(name)) {
                    bookRepository[i].setBookprice(price); // 가격 수정
                    System.out.println("수정 완료");
                    
                    
                    isExist = true;
                    break; // 수정 완료되면 반복문 종료
                }
            }
    		
    		if (!isExist) {
    		System.out.println("찾는 도서가 없습니다.");
    		} break;
    	
    	case 5 : // 상세조회
    		System.out.print("도서명 입력>>");
    		name = scn.nextLine();
    		Calculator cal = new Calculator();
    		cal.getBookInfo(name,bookRepository).showDetailInfo();
            System.out.println("====================");
    		break;
    	
    	
    	
    	
    	case 9:		
    		System.out.println("프로그램을 종료합니다.");
    		run = false;
    		break;
    		default :
    			System.out.println("메뉴를 다시 선택하세요.");
    		
     
         }
         
   }
    
   } // end of main
}
