package org.demo.intestption;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Example1Test {

    private Example1 cut = new Example1();

    @Test
    public void ended_ShowReturnOK_WhenPassedSuccess() {
        assertThat(cut.ended(true)).isEqualTo("OK");
    }

    @Test
    public void ended_ShowReturnKO_WhenPassedFailure() {
        assertThat(cut.ended(false)).isEqualTo("KO");
    }

}
