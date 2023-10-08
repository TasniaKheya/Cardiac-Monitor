package com.example.cardiacmonitor;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import android.os.SystemClock;

import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
@LargeTest

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mainActivityActivityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);



    @Test
    public void allActivityTest() {
        onView(withId(R.id.addButton)).perform(click());
        SystemClock.sleep(1000);
        /*
        To insert data
         */
        onView(withId(R.id.adateValue)).perform(ViewActions.typeText("12/10/2021"));
        SystemClock.sleep(1000);
        onView(withId(R.id.atimeValue)).perform(ViewActions.typeText("10:19"));
        SystemClock.sleep(1000);
        onView(withId(R.id.asystolicValue)).perform(ViewActions.typeText("120"));
        SystemClock.sleep(1000);
        onView(withId(R.id.adiastolicValue)).perform(ViewActions.typeText("90"));
        pressBack();
        SystemClock.sleep(1000);
        onView(withId(R.id.aheartRateValue)).perform(ViewActions.typeText("69"));
        pressBack();
        SystemClock.sleep(1000);
        onView(withId(R.id.acommentValue)).perform(ViewActions.typeText("UI test data insert"));
        pressBack();
        SystemClock.sleep(1000);
        onView(withId(R.id.saveButton)).perform(click());
        SystemClock.sleep(1000);




        /*
        To view data
         */
        // First scroll to the position that needs to be matched and click on it.
        onView(ViewMatchers.withId(R.id.recycler))
                .perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));



        SystemClock.sleep(1000);
        //onView(withId(R.id.backButton)).perform(click());
        SystemClock.sleep(1000);

        /*
        To update data
         */
        // Match the text in an item below the fold and check that it's displayed.
        onView(withId(R.id.editButton)).perform(click());
        SystemClock.sleep(1000);
        onView(withId(R.id.uDateValue)).perform(ViewActions.clearText());
        SystemClock.sleep(1000);
        onView(withId(R.id.uDateValue)).perform(ViewActions.typeText("11/10/2021"));
        SystemClock.sleep(1000);
        //onView(withId(R.id.uTimeValue)).perform(ViewActions.clearText());
        //onView(withId(R.id.uTimeValue)).perform(ViewActions.typeText("10:19"));
        onView(withId(R.id.uSystolicValue)).perform(ViewActions.clearText());
        SystemClock.sleep(1000);
        onView(withId(R.id.uSystolicValue)).perform(ViewActions.typeText("110"));
        SystemClock.sleep(1000);
        onView(withId(R.id.uDiastolicValue)).perform(ViewActions.clearText());
        SystemClock.sleep(1000);
        onView(withId(R.id.uDiastolicValue)).perform(ViewActions.typeText("80"));
        pressBack();
        SystemClock.sleep(1000);
        onView(withId(R.id.uHeartRateValue)).perform(ViewActions.clearText());
        SystemClock.sleep(1000);
        onView(withId(R.id.uHeartRateValue)).perform(ViewActions.typeText("69"));
        pressBack();
        SystemClock.sleep(1000);
        onView(withId(R.id.uCommentValue)).perform(ViewActions.clearText());
        SystemClock.sleep(1000);
        onView(withId(R.id.uCommentValue)).perform(ViewActions.typeText("Updated"));
        pressBack();
        SystemClock.sleep(1000);
        onView(withId(R.id.updateButton)).perform(click());

        SystemClock.sleep(1000);

        /*
        To delete data ;
        */
        SystemClock.sleep(2000);
        onView(withId(R.id.recycler)).perform(
                RecyclerViewActions.actionOnItemAtPosition(0, MyViewAction.clickChildViewWithId(R.id.deleteIm)));
        SystemClock.sleep(2000);


    }



}