package com.reflection;

import jdk.jfr.Name;

import java.lang.annotation.Documented;

public class ClassWithFinalField {

    final String finalField;

    public ClassWithFinalField(){
        finalField = "final";
    }


    @Deprecated
    private void getUserInformation() {
        System.out.println("Field: " + finalField);
    }
}
