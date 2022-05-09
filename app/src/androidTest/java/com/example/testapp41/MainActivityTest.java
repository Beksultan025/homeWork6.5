package com.example.testapp41;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);


    @Test
    public void plusCase (){
        onView(withId(R.id.et_number)).perform(typeText(withId(R.id.et_number).toString()));
        onView(withId(R.id.et_number1)).perform(typeText(withId(R.id.et_number1).toString()));
        onView(withId(R.id.btn_go)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("0")));
    }

    @Test
    public void divide(){
        onView(withId(R.id.et_number)).perform(typeText(withId(R.id.et_number).toString()));
        onView(withId(R.id.et_number1)).perform(typeText(withId(R.id.et_number1).toString()));
        onView(withId(R.id.btn_go)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("0")));
    }

}
