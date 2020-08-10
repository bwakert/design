package testoptional;

import org.junit.Test;

import java.util.Optional;



public class TestOptional {

    @Test
    public void whenCreateEmptyOptional_thenNull() {
        String string ="bb";
        Optional<String> optional  = Optional.ofNullable(string);
        optional.isPresent();
        System.out.println(optional.get());
        System.out.println("结束-------");
    }
}
