package com.reflection;

public class WithFinalField {

    final String finalField;

    public WithFinalField(){
        finalField = "final";
    }

    @Deprecated
    private void getUserInformation() {
        System.out.println("Field: " + finalField);
    }
}
