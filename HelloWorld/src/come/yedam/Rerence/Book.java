package come.yedam.Rerence;

/*
 * 도서명,저자,출판사,판매가격 
 * 
*/ // 1.전체목록 2.도서등록 3.조회(출판사) 9.종료  

public class Book {
	//필드
	String BookName;
	String writer;
	String publisher;
	int salesprice;
	
	
	//생성자
	Book(){}
	Book(String BookName, String writer, String publisher, int salesprice) {
		this.BookName = BookName;
		this.writer = writer;
		this.publisher = publisher;
	    this.salesprice = salesprice;
	}
	// 제목, 저자, 가격
      String showBookInfo() {
    	  return BookName + " " + writer + " " + publisher + " " + salesprice;
      }
	
	
	
	
	
	
	void prinInfo() {
	  System.out.printf("도서명,저자,출판사,판매가격"
			  ,BookName,writer,publisher,salesprice);
  }

 


}