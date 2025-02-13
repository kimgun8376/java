package com.yedam;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import come.yedam.interfaces.emp.Employee;

public class EmpAPP {
	static Scanner scn = new Scanner(System.in);
	private static Employee[] result;

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("1.등록 2.목록 3.수정(급여) 4.삭제 5.조회(조건:입사일자) 6.종료");
			System.out.print("선택>>");
			int menu = 0;

			try {
				menu = scn.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("메뉴를 확인하세요");
				scn.nextLine();
				continue;
			}
			scn.nextLine();

			Object dao;
			switch (menu) {
			case 1: // 추가. 사번.이름.전화번호.입사일.급여
				int empNo = 0;
				System.out.print("사번>>");
				empNo = Integer.parseInt(scn.nextLine());
				System.out.print("이름>> ");
				String eName = scn.nextLine();
				System.out.print("전화번호>> ");
				String tel = scn.nextLine();
				System.out.print("입사일자>> ");
				String hdate = scn.nextLine();
				System.out.print("급여>> ");
				String sal = scn.nextLine();
				break;
			case 2: // 목록
                 System.out.println("사번    이름   전화번호");
                 System.out.println("------------------");

			case 3: // 수정 (급여)
				System.out.print("입사일자>>");
				String hdate1 = scn.nextLine();
				if (hdate1.equals("")) {
					hdate1 = "1900-01-01";
				}				
				break;
			case 4: // 삭제
				try {
					remove();
				} catch (NumberFormatException e) {
					System.out.println("삭제완료");
				}
                break;

			case 5: //조회 (조건:입사일자)
				System.out.print("조회 입사일자>>");
				hdate1 = scn.nextLine();
				Employee emp = new Employee();
				emp.setEmpName(hdate1);
				System.out.println("사번  이 름   연락처   입사일자");
				System.out.println("-----------------------");
				for (Employee empl : result) {
					if (empl != null) {
						System.out.println(empl.empInfo());
					}
				}
				break;

			case 6:
				System.out.println("종료합니다");
				run = false;
				break;
			default:
				System.out.println("메뉴를 확인하세요");

			}

		} // end of while
		System.out.println("end of prog");
	}

	private static void remove() {
		
	}

}

	