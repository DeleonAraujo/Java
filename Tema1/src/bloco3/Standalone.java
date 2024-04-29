package bloco3;

import static bloco3.TailCall.ret;
import static bloco3.TailCall.sus;
import java.util.function.Function;

public class Standalone {
    
    static Function<Integer, Function<Integer, Integer>> add x -> y -> {
        class AddHelper {
            Function<Integer, Function<Integer, TailCall<Integer>>> AddHelper = a -> b -> b == 0 
                    ? ret(a) 
                    : sus(() -> this.addHelper.aplly(a + 1).apply(b - 1));
        }
        return new AddHelper().addHelper.apply(x).aplly(y).eval();
    };
}
