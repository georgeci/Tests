package com.georgeci.tests;

import android.support.test.espresso.action.ViewActions;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.SmallTest;

import com.squareup.spoon.Spoon;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

//@RunWith(AndroidJUnit4.class)
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public MainActivityTest() {
        super(MainActivity.class);
    }


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }


    @SmallTest
    public void testView1() {
        onView(withId(R.id.btn1))
                .perform(ViewActions.click());
//        onView(withId(R.id.btn1))            // withId(R.id.my_view) is a ViewMatcher
//                .perform(ViewActions.click())               // click() is a ViewAction
//                .check(ViewMatchers.isDisplayed().matches()); // matches(isDisplayed()) is a ViewAssertion
//        Espresso.onView(ViewMatchers.withId(R.id.btn1)).perform(ViewActions.swipeRight());
//        ListView lvDrawerMenu = (ListView) getActivity().findViewById(com.eleks.espresso.example.app.R.id.lvDrawerMenu);
//        Preconditions.checkNotNull(lvDrawerMenu, "lvDrawerMenu is null");
//        final int count = lvDrawerMenu.getAdapter().getCount();
//        Preconditions.checkPositionIndex(2, count, "No 1 index " + count + " size");
//        Object obj = lvDrawerMenu.getItemAtPosition(2);
//        Espresso.onView(Matchers.allOf(ViewMatchers.withId(com.eleks.espresso.example.app.R.id.tvItem), ViewMatchers.hasSibling(ViewMatchers.withText(obj.toString())))).perform(ViewActions.click());
    }
    @SmallTest
    public void testView2() {
        onView(withId(R.id.btn2))
                .perform(ViewActions.click());
        Spoon.screenshot(getActivity(), "btn2");
//        onView(withId(R.id.btn1))            // withId(R.id.my_view) is a ViewMatcher
//                .perform(ViewActions.click())               // click() is a ViewAction
//                .check(ViewMatchers.isDisplayed().matches()); // matches(isDisplayed()) is a ViewAssertion
//        Espresso.onView(ViewMatchers.withId(R.id.btn1)).perform(ViewActions.swipeRight());
//        ListView lvDrawerMenu = (ListView) getActivity().findViewById(com.eleks.espresso.example.app.R.id.lvDrawerMenu);
//        Preconditions.checkNotNull(lvDrawerMenu, "lvDrawerMenu is null");
//        final int count = lvDrawerMenu.getAdapter().getCount();
//        Preconditions.checkPositionIndex(2, count, "No 1 index " + count + " size");
//        Object obj = lvDrawerMenu.getItemAtPosition(2);
//        Espresso.onView(Matchers.allOf(ViewMatchers.withId(com.eleks.espresso.example.app.R.id.tvItem), ViewMatchers.hasSibling(ViewMatchers.withText(obj.toString())))).perform(ViewActions.click());
    }


}
