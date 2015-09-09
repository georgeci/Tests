package com.georgeci.tests.test;

import android.test.ActivityInstrumentationTestCase2;

import com.georgeci.tests.*;
import com.georgeci.tests.R;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

//@RunWith(CRunner.class)
//@RunWith(Cucumber.class)
@CucumberOptions(features = "features")//, glue = {"classpath:com.georgeci.tests.test"})
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public MainActivityTest() {
        super(MainActivity.class);
    }


//    @Override
//    protected void setUp() throws Exception {
//        super.setUp();
//        getActivity();
//    }

    @Given("^a$")
    public void givenLoginTryCounter() {
//        String checkString = String.format(getActivity().getResources().getString(R.string.login_try_left), counterValue);
//        onView(withId(R.id.lblCounter)).check(matches(withText(checkString)));
        onView(withId(R.id.btn1)).check(matches(withText("qwe")));
    }

    @When("^b$")
    public void clickOnBackButton() {
//        ViewActions.pressBack();
        onView(withId(R.id.btn1)).check(matches(withText("qwe")));
    }

    @Then("^c$")
    public void checkLoginTryCounter() {
//        givenLoginTryCounter(counterValue);
        onView(withId(R.id.btn1)).check(matches(withText("qwe")));
    }

//    @SmallTest
//    public void testView1() {
//        onView(ViewMatchers.withId(com.georgeci.tests.R.id.btn1))
//                .perform(ViewActions.click());
////        onView(withId(R.id.btn1))            // withId(R.id.my_view) is a ViewMatcher
////                .perform(ViewActions.click())               // click() is a ViewAction
////                .check(ViewMatchers.isDisplayed().matches()); // matches(isDisplayed()) is a ViewAssertion
////        Espresso.onView(ViewMatchers.withId(R.id.btn1)).perform(ViewActions.swipeRight());
////        ListView lvDrawerMenu = (ListView) getActivity().findViewById(com.eleks.espresso.example.app.R.id.lvDrawerMenu);
////        Preconditions.checkNotNull(lvDrawerMenu, "lvDrawerMenu is null");
////        final int count = lvDrawerMenu.getAdapter().getCount();
////        Preconditions.checkPositionIndex(2, count, "No 1 index " + count + " size");
////        Object obj = lvDrawerMenu.getItemAtPosition(2);
////        Espresso.onView(Matchers.allOf(ViewMatchers.withId(com.eleks.espresso.example.app.R.id.tvItem), ViewMatchers.hasSibling(ViewMatchers.withText(obj.toString())))).perform(ViewActions.click());
//    }
//    @SmallTest
//    public void testView2() {
//        onView(ViewMatchers.withId(com.georgeci.tests.R.id.btn2))
//                .perform(ViewActions.click());
////        Spoon.screenshot(getActivity(), "btn2");
////        onView(withId(R.id.btn1))            // withId(R.id.my_view) is a ViewMatcher
////                .perform(ViewActions.click())               // click() is a ViewAction
////                .check(ViewMatchers.isDisplayed().matches()); // matches(isDisplayed()) is a ViewAssertion
////        Espresso.onView(ViewMatchers.withId(R.id.btn1)).perform(ViewActions.swipeRight());
////        ListView lvDrawerMenu = (ListView) getActivity().findViewById(com.eleks.espresso.example.app.R.id.lvDrawerMenu);
////        Preconditions.checkNotNull(lvDrawerMenu, "lvDrawerMenu is null");
////        final int count = lvDrawerMenu.getAdapter().getCount();
////        Preconditions.checkPositionIndex(2, count, "No 1 index " + count + " size");
////        Object obj = lvDrawerMenu.getItemAtPosition(2);
////        Espresso.onView(Matchers.allOf(ViewMatchers.withId(com.eleks.espresso.example.app.R.id.tvItem), ViewMatchers.hasSibling(ViewMatchers.withText(obj.toString())))).perform(ViewActions.click());
//    }


}
