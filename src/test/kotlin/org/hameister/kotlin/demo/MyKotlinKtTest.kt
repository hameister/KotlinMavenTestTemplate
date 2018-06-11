package org.hameister.kotlin.demo

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Created by hameister on 11.06.18.
 */
class MyKotlinKtTest {
    @Test
    fun adder() {
     var sum = org.hameister.kotlin.demo.adder(1,1)
        assertThat(sum).isEqualTo(2)
    }

}