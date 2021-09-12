package fruit;

import java.util.Comparator;

public class Fruit {
	
	int no;
	String name;
	int price;
	public Fruit(int i, String string, int j) {
		this.no = i;
		this.name = string;
		this.price = j;
	}
	
	@Override
	public String toString() {
		return "Student [no="+this.no+", name="+this.name+", price="+this.price+"]";
	}
}

class FruitComparator implements Comparator<Fruit>{
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
}

class FruitComparatorDesc implements Comparator<Fruit>{
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.name.compareTo(o1.name);
	}
}