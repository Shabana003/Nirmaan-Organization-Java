package Day14;

public class LibraryManagement {
	public static void main(String[] args) {
		Book b1=new Book();
		b1.setId(1000);
		b1.setName("Avengers");
		b1.setAuthor("Kalaivani");
		b1.setPrice("Rs.500");
		System.out.println(b1.getId());
		System.out.println(b1.getName());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getPrice());
		System.out.println(b1);
		Book b2=new Book();
		b2.setId(2000);
		b2.setName("Ben 10");
		b2.setAuthor("Loki");
		b2.setPrice("Rs.550");
		System.out.println(b2.getId());
		System.out.println(b2.getName());
		System.out.println(b2.getAuthor());
		System.out.println(b2.getPrice());
		System.out.println(b2);
	}

}
