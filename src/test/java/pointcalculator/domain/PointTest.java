package pointcalculator.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    @DisplayName("정상 생성")
    void 정상_생성() {
        assertDoesNotThrow(()-> new Point(0,0));
        assertDoesNotThrow(()-> new Point(0,24));
        assertDoesNotThrow(()-> new Point(24,0));
        assertDoesNotThrow(()-> new Point(24,24));
    }

    @Test
    @DisplayName("비정상 생성")
    void 비정상_생성() {
        assertThrows(IllegalArgumentException.class, ()-> new Point(-1,0));
        assertThrows(IllegalArgumentException.class, ()-> new Point(0,25));
        assertThrows(IllegalArgumentException.class, ()-> new Point(24,-1));
        assertThrows(IllegalArgumentException.class, ()-> new Point(-1,25));
    }
}