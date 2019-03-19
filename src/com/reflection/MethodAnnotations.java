package com.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodAnnotations {
    public static void getMethodAnnotation(Method m){
        Annotation[] annotations = m.getDeclaredAnnotations();
        System.out.println(Arrays.toString(annotations));
    }
}
