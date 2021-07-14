import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaeserCipherTest {

    CaeserCipher cipher = new CaeserCipher();

    @Test
    void simpleCaesarEncode()
    {
       assertEquals("khoor", cipher.encode(3, "hello"));
    }

    @Test
    void simpleCaesarDecode(){
        assertEquals("hello", cipher.decode(3, "khoor"));
    }

}