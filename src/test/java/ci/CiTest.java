package ci;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CiTest {

    @DisplayName("Bearer Auth")
    @Test
    void ciTest() {
        // build by github action fail test
        // assertThat(1).isEqualTo(2);
    }

}
