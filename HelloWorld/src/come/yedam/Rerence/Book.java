package come.yedam.Rerence;

/*
 * 도서명,저자,출판사,판매가격 
 * 
*/ // 1.전체목록 2.도서등록 3.조회(출판사) 9.종료  

public class Book {
	// 필드
	private String BookName;
	private String writer;
	private String publisher;
	private int salesprice;

	// public, default, private => 접근제한자(access modifier)

	// 생성자
	Book() {
	}

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

	void showDetailInfo() {
		// 도서명 :이것이 자바다 출판사 : 한빛미디어
		// 저 자 : 신용권 가 격 : 25000원
		String strFormat = "도서명: %10s\t출판사: %6s\n 저 자 : %3s\t\t 가 격: %5d 원\n"; // 변수 선언
		System.out.printf("", BookName, writer, publisher, salesprice);
	}

	// setter.
	void setBookprice(int bookprice) {
		if (salesprice < 0) {
			this.salesprice = 0;
			return;
		}
		this.salesprice = salesprice;
	}

	public void BookName(String BookName) {
		this.BookName = BookName;
	}

	public void writer(String writer) {
		this.BookName = writer;
	}

	public void publisher(String publisher) {
		this.BookName = publisher;
	}

	public void salesprice(String salesprice) {
		this.BookName = salesprice;
	}

//getter.
	public String BookName() {
		return BookName;
	}

	public String writer() {
		return BookName;
	}

	public String publisher() {
		return BookName;
	}

	public String salesprice() {
		return BookName;
	}
}