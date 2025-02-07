package come.yedam.collections;

class Box<E> {
	E item;

    void setItem(E item) {
    	this.item = item;
    }
    E getItem() {
    	return item;
    }
}


public class BoxExe {
	public static void main(String[] args) {
	   Box<Integer> box = new Box<Integer>();
	//   box.setItem("오렌지");
	   box.setItem(100);
	   
	   Integer result = (Integer) box.getItem(); // Object => String
	   System.out.println(result);
	}
}
