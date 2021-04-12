package afrrica.semicolon.mp3.RainOfFuns;
import static org.junit.jupiter.api.Assertions. *;
import org.junit.jupiter.api.Test;

public class InvoiceTest {
    @Test
    void AnInvoiceCanExist() {
        Invoice myInvoice = new Invoice("A1", "blue", 2, 10.0);
        assertNotNull(myInvoice.getInvoice());
    }

    @Test
    void InvoiceAmountCanBeCalculated() {
        Invoice myInvoice = new Invoice(2, 13.0);
        assertEquals(26, myInvoice.getInvoiceAmount());
    }

    @Test
    void ItemQuantityCannotBeNegative() {
        Invoice myInvoice = new Invoice(2, 10.0);
        assertEquals(20.0, myInvoice.getInvoiceAmount());
    }

    @Test
    void PriceValueCannotBeNegative() {
        Invoice myInvoice = new Invoice(0, -10.0);
        assertEquals(0.0, myInvoice.getInvoiceAmount());
    }
}

