import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void hasWrongLength(){
        //given
        String str="A8";
        //when
        boolean bo=Main.hasLength3To10(str);
        //then
        boolean expected=false;
        Assertions.assertEquals(expected,bo);
    }

    @Test
    void isTooLong(){
        //given
        String str="A8ASDFASFJASDIOFJASIDFJ$%";
        //when
        boolean bo=Main.hasLength3To10(str);
        //then
        boolean expected=false;
        Assertions.assertEquals(expected,bo);
    }

    @Test
    void hasCorrectLength10(){
        //given
        String str="A8ASDFASFZ";
        //when
        boolean bo=Main.hasLength3To10(str);
        //then
        boolean expected=true;
        Assertions.assertEquals(expected,bo);
    }

    @Test
    void hasCorrectLength3(){
        //given
        String str="A8A";
        //when
        boolean bo=Main.hasLength3To10(str);
        //then
        boolean expected=true;
        Assertions.assertEquals(expected,bo);
    }

    @Test
    void hasNumber(){
        //given
        String str="A8A";
        //when
        boolean bo=Main.hasNumber(str);
        //then
        boolean expected=true;
        Assertions.assertEquals(expected,bo);
    }

    @Test
    void hasNoNumber(){
        //given
        String str="AZSFGH+#(A";
        //when
        boolean bo=Main.hasNumber(str);
        //then
        boolean expected=false;
        Assertions.assertEquals(expected,bo);
    }

    @Test
    void istSchlecht(){
        String str="Passwort";
        boolean bo=Main.isBad(str);
        boolean exp=true;
        Assertions.assertEquals(exp,bo);
    }

    @Test
    void istSchlecht2(){
        String str="Passwort13";
        boolean bo=Main.isBad(str);
        boolean exp=false;
        Assertions.assertEquals(exp,bo);
    }

    @Test
    void istSchlechtZahl(){
        String str="12345";
        boolean bo=Main.isBad(str);
        boolean exp=true;
        Assertions.assertEquals(exp,bo);
    }

    @Test
    void isPerfectNo(){
        String str="#Pass34";
        boolean bo=Main.isPerfect(str);
        boolean exp=false;
        Assertions.assertEquals(exp,bo);
    }

    @Test
    void isPerfectYes(){
        String str="PASg4";
        boolean bo=Main.isPerfect(str);
        boolean exp=true;
        Assertions.assertEquals(exp,bo);
    }

}