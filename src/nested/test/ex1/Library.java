package nested.test.ex1;

import java.awt.print.Book;

public class Library {

    private Book[] books;
    private int cnt;

    public Library(int num) {
        books = new Book[num];
        cnt = 0;
    }

    public void addBook(String title, String author) {
        if (cnt < books.length) {
            books[cnt++] = new Book(title, author);
            return;
        }

        System.out.println("도서관 저장 공간이 부족합니다.");
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목: " + book.getTitle() + ", 저자: " + book.getAuthor());
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }
    }
}
