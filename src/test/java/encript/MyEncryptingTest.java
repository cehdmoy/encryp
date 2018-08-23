package encript;

import org.junit.Assert;
import org.junit.Test;

public class MyEncryptingTest {

    @Test
    public void isClassThere()
    {
     new MyEncrypting();
    }

    @Test
    public void isAbleToCallMethod() {
        MyEncrypting myEncrypting = new MyEncrypting();
        myEncrypting.encryps("Hola");

    }

    @Test
    public void checkHolaCase() {
        MyEncrypting myEncrypting = new MyEncrypting();
        String encryptedMessage = myEncrypting.encryps("Hola");
        Assert.assertEquals("Ipk`",encryptedMessage);
    }

    @Test
    public void checkByyeCase() {
        MyEncrypting myEncrypting = new MyEncrypting();
        String encryptedMessage = myEncrypting.encryps("Chao");
        Assert.assertEquals("Di`n",encryptedMessage);
    }

    @Test
    public void checkHola__HOLACase() {
        MyEncrypting myEncrypting = new MyEncrypting();
        String encryptedMessage = myEncrypting.encryps("Hola__HOLA");
        Assert.assertEquals("Ipk```GNMB",encryptedMessage);
    }

    @Test
    public void checkHola__HOLABCase() {
        MyEncrypting myEncrypting = new MyEncrypting();
        String encryptedMessage = myEncrypting.encryps("Hola__HOLAB");
        Assert.assertEquals("Ipk```GNMBA",encryptedMessage);
    }

    @Test
    public void checkHola__HOLABBCCase() {
        MyEncrypting myEncrypting = new MyEncrypting();
        String encryptedMessage = myEncrypting.encryps("Hola__HOLABBC");
        Assert.assertEquals("Ipk```GNMBAAD",encryptedMessage);
    }
}
