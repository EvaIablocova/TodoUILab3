package org.example.todouilab3.DTOs;

import java.beans.PropertyEditorSupport;

public class EnumConverter extends PropertyEditorSupport {
    private final Class<? extends Enum> enumType;

    public EnumConverter(Class<? extends Enum> enumType) {
        this.enumType = enumType;
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(Enum.valueOf(this.enumType, text.toUpperCase()));
    }
}
