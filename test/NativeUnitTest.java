import org.junit.jupiter.api.Test;
import tdd.Native;

import static org.junit.jupiter.api.Assertions.*;

class NativeUnitTest {
    @Test
    public void nativeSetNameTest(){
        Native yuko = new Native();
        yuko.setName("explore");
        assertEquals("explore", yuko.getName());
    }
    @Test
     public void nativeSetIdNumber(){
        Native yuko = new Native();
        yuko.setIdNumber("8888");
        assertEquals("8888", yuko.getIdNumber());
}

    @Test
    public void setEmailTest(){
        Native yuko = new Native();
        yuko.setEmail("aw@aw.com");
        assertEquals("aw@aw.com", yuko.getEmail());
    }

}