import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
public class ChargeCardTest {
    @Test
    void testCargeCard(){
        CreditCard cardMock = mock(CreditCard.class);
        when(cardMock.getCardNumber()).thenReturn("2");
        when(cardMock.getCardHolder()).thenReturn("Sven Svon");
        when(cardMock.getExpiryDate()).thenReturn("11.11");
        when(cardMock.getCvv()).thenReturn("111");
        PaymentForm paymentForm = new PaymentForm(cardMock);
        paymentForm.pay(100);
        verify(cardMock, times(1)).charge(100);
    }
}
