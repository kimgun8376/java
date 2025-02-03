package com.yedam.reference;

public class MemberExe {
	Member[] members = { //
			new Member("user01", "1111", "홍길동"), //
			new Member("user02", "2222", "김민수"), //
			new Member("user03", "3333", "박석민") };

	public String login(String id, String password) {
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null //
					&& members[i].getMemberId().equals(id)//
					&& members[i].getPassword().equals(password)) {
				return members[i].getMemberName(); // id, password 일치.
			}
		}
		return null; // 일치하는 값이 없음.
	} // end of login().
}
