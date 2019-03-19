package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        ClassWithFinalField withFinalField = new ClassWithFinalField();
        Field field = withFinalField.getClass().getDeclaredField("finalField");
        ModifierChanger.setAbsolutelyAccessible(field);
        field.set(withFinalField, "changed");
        Method method = withFinalField.getClass().getDeclaredMethod("getUserInformation");
        method.setAccessible(true);
        method.invoke(withFinalField);
        MethodAnnotations.getMethodAnnotation(method);

    }
}
