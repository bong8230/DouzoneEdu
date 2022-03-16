package Quiz_ex01;

import java.util.Vector;

public class BookManager {
	public static int getRentalPrice(Vector<Book> bookList, String kind) {
		int sum =0;
		for (Book i : bookList)
			if(i.getKind().equals(kind))
				sum+=i.getRentalPrice();
		return sum;
	}
}
