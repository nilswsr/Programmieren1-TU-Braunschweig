package Uebung4;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FangenUndWerfenTest {
    @Test
    public void FangenUndWerfen_funkt() {
        assertEquals(4, FangenUndWerfen.twentyBy(5));
        assertEquals(2, FangenUndWerfen.twentyBy(10));
    }
}
