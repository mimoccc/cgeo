package cgeo.geocaching.test;

import cgeo.geocaching.cgeo;
import cgeo.geocaching.compatibility.Compatibility;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.Assert;

@SuppressWarnings("static-method")
public class CompatibilityTest extends ActivityInstrumentationTestCase2<cgeo> {

    private cgeo activity;

    public CompatibilityTest() {
        super("cgeo.geocaching", cgeo.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
    }

    public void testDataChanged() {
        // This should not raise an exception in any Android version
        Compatibility.dataChanged("cgeo.geocaching");
    }

    public void testGetDirectionNow() {
        final float angle = Compatibility.getDirectionNow(1.0f, activity);
        Assert.assertTrue(angle == 1.0f || angle == 91.0f || angle == 181.0f || angle == 271.0f);
    }

}
