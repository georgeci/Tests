package com.georgeci.tests.test;

import android.os.Bundle;
import android.support.test.runner.AndroidJUnitRunner;
import android.support.test.runner.MonitoringInstrumentation;

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

//public class CRunner extends MonitoringInstrumentation {
//
//    private final CucumberInstrumentationCore mInstrumentationCore = new CucumberInstrumentationCore(this);
//
//    @Override
//    public void onCreate(Bundle arguments) {
//        super.onCreate(arguments);
//
//        mInstrumentationCore.create(arguments);
//        start();
//    }
//
//    @Override
//    public void onStart() {
//        super.onStart();
//
//        waitForIdleSync();
//        mInstrumentationCore.start();
//    }
//}/
