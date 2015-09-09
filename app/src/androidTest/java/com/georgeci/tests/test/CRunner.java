package com.georgeci.tests.test;

import android.os.Bundle;
import android.support.test.runner.AndroidJUnitRunner;

import cucumber.api.android.CucumberInstrumentationCore;

public class CRunner extends AndroidJUnitRunner {
    private CucumberInstrumentationCore helper = new CucumberInstrumentationCore(this);

    @Override
    public void onCreate(Bundle arguments) {
        helper.create(arguments);
        super.onCreate(arguments);
    }

    @Override
    public void onStart() {
        helper.start();
//        super.onStart();
    }
}
