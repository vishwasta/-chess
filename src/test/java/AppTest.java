import com.technogise.App;
import com.technogise.chess.Cell;
import org.junit.jupiter.api.Test;

import static com.technogise.chess.Piece.PAWN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

  @Test
  void shouldGetInputParametersFromString() {
    String test = "PAWN,D6";

    App.InputParameters result = App.getInputParmeters(test);

    assertEquals(PAWN, result.piece());
    assertEquals(new Cell(6,'D').getCellName(), result.cell().getCellName());
  }
}
