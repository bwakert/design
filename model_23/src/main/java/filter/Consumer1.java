package filter;

import java.util.function.Consumer;

public class Consumer1 {

    public void  sum(Consumer<Integer> consumer){
         consumer.accept(10);
    }

}
