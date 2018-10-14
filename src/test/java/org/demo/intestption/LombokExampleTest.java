package org.demo.intestption;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LombokExampleTest {

    private LombokExample cut = new LombokExample();

    @Test
    public void useBlackMagic_ShowReturn1_WhenPassed1() {
        assertThat(cut.useBlackMagic(1)).isEqualTo(1);
    }

}
