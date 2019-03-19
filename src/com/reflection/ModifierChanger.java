package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ModifierChanger {
    public static void setAbsolutelyAccessible(Field field) {
        try {
            field.setAccessible(true);
            Field modifiersField = Field.class.getDeclaredField("modifiers");
            /*
            В классе Field имеется приватное поле modifiers, в котором в виде
            битовой маски хранится список модификаторов поля.
            Выражением field.getModifiers() & ~Modifier.FINAL
            просто "снимаем" модификатор final с поля.
            */
            modifiersField.setAccessible(true);
            modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
