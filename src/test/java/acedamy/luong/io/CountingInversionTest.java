package acedamy.luong.io;

import acedamy.luong.Utils.CollectionUtils;
import acedamy.luong.algorithmspecialist.week1.CountingInversion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CountingInversionTest {

    @Test
    public void countTingInversionI() {
        Assert.assertEquals(0, CountingInversion.countInversionI(CollectionUtils.arrayIntOf(1)));
        Assert.assertEquals(0, CountingInversion.countInversionI(CollectionUtils.arrayIntOf(1,2)));
        Assert.assertEquals(1, CountingInversion.countInversionI(CollectionUtils.arrayIntOf(2,1)));
        Assert.assertEquals(2, CountingInversion.countInversionI(CollectionUtils.arrayIntOf(2,1,4,3)));
        Assert.assertEquals(3, CountingInversion.countInversionI(CollectionUtils.arrayIntOf(2,4,1,3)));
        Assert.assertEquals(7, CountingInversion.countInversionI(CollectionUtils.arrayIntOf(2,4,0,7,1,3)));
    }
}
