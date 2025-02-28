package come.yedam.api;

public class Member {
	String memberId;
	int memPoint;
	
	Member(){}
	
	Member(String id, int point) {
		memberId = id;
		memPoint = point;
	}

	@Override
	public int hashCode() {
//	return super.hashCode(); // Objectd의 hashcode는 주소값.
	 return memPoint;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// memberID 같을 경우 .. 논리적으로 같은객체.
		if (obj instanceof Member) {             
			Member m2 = (Member) obj;
			if (this.memberId == m2.memberId //
					&& this.memPoint == m2.memPoint) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memPoint=" + memPoint + "]";
	}

}
