package afrrica.semicolon.mp3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions. *;
public class DateTest {
    @Test
    void DayCanBeCreated(){
        Date dateCargo=new Date(02,12,2021);
        assertEquals(02,dateCargo.getDay());
    }
    @Test
    void MonthCanBeCreated(){
      Date dateCargo=new Date(15,11,2013);
      assertEquals(11,dateCargo.getMonth());
    }
    @Test
    void yearCanBeCreated(){
        Date dateCargo=new Date(1,6,2020);
        assertEquals(2020,dateCargo.getYear());
    }
    @Test
    void DateCanBeCreated(){
        Date dateCargo=new Date(12,11,2021);
    assertNotNull(dateCargo.getDate());
        System.out.println(dateCargo.getDay()+ "/" +dateCargo.getMonth()+ "/" +dateCargo.getYear());
    }
}
