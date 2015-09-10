package com.georgeci.tests.test;

import android.support.test.espresso.ViewAction;
import android.test.InstrumentationTestCase;

import junit.framework.TestCase;

/**
 * Created by georgeci on 11.09.2015.
 */
public final class CustomViewActions {

    private CustomViewActions() { }

    public static ViewAction takeSpoonScreenshot(final InstrumentationTestCase aTestCase,
                                                 final String aDescription) throws Throwable {
        return new SpoonScreenshotAction(aTestCase, aDescription);
    }

}
