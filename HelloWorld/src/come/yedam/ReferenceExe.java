package com.yedam;

import com.yedam.reference.ReferenceExe1;

public class ReferenceExe {
	public static void main(String[] args) {

		ReferenceExe1.main(args); // static 메소드는 클래스.메소드()

		ReferenceExe1 ref1;

		ref1 = new ReferenceExe1(); // 인스턴스를 생성해야지 사용가능.

		ref1.method1(); // public
//		ref1.method2(); // private
	}
}
