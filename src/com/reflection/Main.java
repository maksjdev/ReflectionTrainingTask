package com.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        WithFinalField withFinalField = new WithFinalField();
        Field field = WithFinalField.class.getDeclaredField("finalField");
        ModifierChanger.setAbsolutelyAccessible(field);
        field.set(withFinalField, "changed");
        Method method = WithFinalField.class.getDeclaredMethod("getUserInformation");
        method.setAccessible(true);
        method.invoke(withFinalField);
        MethodAnnotations.getMethodAnnotation(method);

    }
}
