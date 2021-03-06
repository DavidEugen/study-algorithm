package com.study.algorithm.stack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CheckingBracketsTest {

    @Test
    @DisplayName("Stack 이용해서 브라켓 짝 검사")
    void checkingBracketsTest() {
        //given
        CheckingBrackets checkingBrackets = new CheckingBrackets();
        String trueCase = "[{1 + 2 * (2 + 2)} - (1 - 3)]";
        String trueCase2 = "((()))";
        String falseCase = "[{1 + 2 * (2 + 2)} - [1 - 3)]";
        String falseCase2 = "(()))";
        String falseCase3 = "((())";

        //when//then
        Assertions.assertThat(checkingBrackets.check(trueCase)).isEqualTo(true);
        Assertions.assertThat(checkingBrackets.check(trueCase2)).isEqualTo(true);
        Assertions.assertThat(checkingBrackets.check(falseCase)).isEqualTo(false);
        Assertions.assertThat(checkingBrackets.check(falseCase2)).isEqualTo(false);
        Assertions.assertThat(checkingBrackets.check(falseCase3)).isEqualTo(false);
    }
}