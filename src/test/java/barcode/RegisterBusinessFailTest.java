package barcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegisterBusinessFailTest {

    @Test
    @DisplayName("Firstname มีค่าเป็น null จึงเกิด exception")
    public void case01() {
        RegisterBusiness registerBusiness = new RegisterBusiness();
        Exception exception = assertThrows(ArgumentNullException.class, () ->
                registerBusiness.register(null, new Speaker())
        );
        assertEquals("First name is required.", exception.getMessage());
    }

    @Test
    @DisplayName("Lastname มีค่าเป็น null จึงเกิด exception")
    public void case02() {
        RegisterBusiness registerBusiness = new RegisterBusiness();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Panchanok");

        Exception exception = assertThrows(ArgumentNullException.class, () ->
                registerBusiness.register(null, speaker)
        );
        assertEquals("Last name is required.", exception.getMessage());
    }

    @Test
    @DisplayName("Email มีค่าเป็น null จึงเกิด exception")
    public void case03() {
        RegisterBusiness registerBusiness = new RegisterBusiness();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Panchanok");
        speaker.setLastName("Kanwilai");

        Exception exception = assertThrows(ArgumentNullException.class, () ->
                registerBusiness.register(null, speaker)
        );
        assertEquals("Email is required.", exception.getMessage());
    }
}
