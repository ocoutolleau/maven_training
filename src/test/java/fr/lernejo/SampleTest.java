package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    private final Sample sample = new Sample();

    @Test
    void add_1_and_1_should_be_2(){
        int result = sample.op(Sample.Operation.ADD, 1, 1);

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void fact_3_is_6(){
        int result = sample.fact(3);
        Assertions.assertThat(result).isEqualTo(6);
    }

}
