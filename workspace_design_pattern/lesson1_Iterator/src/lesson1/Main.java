package lesson1;

public class Main {

	public static void main(String[] args){
	//最大保存数を指定してインスタンス化
	BookShelf bookShelf = new BookShelf();
	bookShelf.appendBook(new Book("Around the World in 80 days"));
	bookShelf.appendBook(new Book("Bible"));
	bookShelf.appendBook(new Book("Cinderella"));
	bookShelf.appendBook(new Book("Daddy-Long-Legs"));
	Iterator it = bookShelf.iterator();

	while(it.hasNext()){
		Book book = (Book)it.next();
		System.out.println(book.getName());
	}

	}

}
