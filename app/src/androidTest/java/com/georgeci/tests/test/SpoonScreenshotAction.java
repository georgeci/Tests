package com.georgeci.tests.test;

import android.app.Activity;
import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;
import android.support.test.runner.lifecycle.Stage;
import android.test.InstrumentationTestCase;
import android.view.View;

import com.squareup.spoon.Spoon;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

/**
 * Created by georgeci on 11.09.2015.
 */
public final class SpoonScreenshotAction implements ViewAction {

    private final InstrumentationTestCase mInstrumentationTestCase;
    private final Activity mCurrentActivity;
    private final String mDescription;

    public SpoonScreenshotAction(final InstrumentationTestCase aInstrumentationTestCase,
                                 final String aDescription) throws Throwable {
        mInstrumentationTestCase = aInstrumentationTestCase;
        mDescription = aDescription;
        mCurrentActivity = getCurrentActivity();
    }

    @Override
    public Matcher<View> getConstraints() {
        return Matchers.any(View.class);
    }

    @Override
    public String getDescription() {
        return "Taking a screenshot using spoon.";
    }

    @Override
    public void perform(final UiController aUiController, final View aView) {
        Spoon.screenshot(mCurrentActivity, mDescription);
    }

    private Activity getCurrentActivity() throws Throwable {
        mInstrumentationTestCase.getInstrumentation().waitForIdleSync();
        final Activity[] activity = new Activity[1];
        mInstrumentationTestCase.runTestOnUiThread(new Runnable() {
            @Override
            public void run() {
                activity[0] = ActivityLifecycleMonitorRegistry.getInstance()
                        .getActivitiesInStage(Stage.RESUMED).iterator().next();
            }
        });
        return activity[0];
    }

}
