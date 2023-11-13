import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import BookServiceHW.*;
import static org.assertj.core.api.Assertions.assertThat;
public class BookServiceHW {
    @Test
    void BookServiceTest(){
        Book book = new Book("1", "Book1", "Author1");
        Book book2 = new Book("2", "Book2", "Author2");
        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);
        InMemoryBookRepository repositoryMock = mock(InMemoryBookRepository.class);
        when(repositoryMock.findById("1"))
                .thenReturn(book);
        when(repositoryMock.findAll()).thenReturn(books);
        BookService service = new BookService(repositoryMock);
        assertThat(book).isEqualTo(service.findBookById("1"));
        assertThat(books).isEqualTo(service.findAllBooks());
    }

}
