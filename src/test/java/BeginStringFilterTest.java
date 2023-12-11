import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginStringFilterTest {

    @Test
    public void testFilterApply() {//проверка, что строка str начинается с подстроки pattern
        String str = "Мама мыла раму";
        BeginStringFilter filter1 = new BeginStringFilter("Мама");
        BeginStringFilter filter2 = new BeginStringFilter("мыла");
        boolean res1 = filter1.apply(str);
        boolean res2 = filter2.apply(str);

        assertTrue(res1);
        assertFalse(res2);

    }

    @Test
    void testFilterApply1(){//проверка, что строка начинается с определенного символа
        String str = "Абрикосы и бананы";
        BeginSymbol filter1 = new BeginSymbol('А');
        BeginSymbol filter2 = new BeginSymbol('у');
        boolean res1 = filter1.apply(str);
        boolean res2 = filter2.apply(str);

        assertTrue(res1);
        assertFalse(res2);
    }

    @Test
    void testFilterApply2(){//проверка, что строка только из чисел
        String str1 = "2764";
        String str2 = "без партии";
        NumeralFilter filter1 = new NumeralFilter();
        boolean res1 = filter1.apply(str1);
        boolean res2 = filter1.apply(str2);

        assertTrue(res1);
        assertFalse(res2);

    }
}