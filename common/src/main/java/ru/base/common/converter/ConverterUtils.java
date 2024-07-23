package ru.base.common.converter;

import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

public class ConverterUtils {

    private ConverterUtils() {}

    /**
     * Заполняет поле если оно пришло в DTO
     * @param consumer ссылка на set метод
     * @param exists ссылка на метод, который проверяет наличие в DTO нужного поля
     * @param value значение, которое установится в поле
     * @author Makhanov
     */
    public static <T> void fillField(Consumer<T> consumer, BooleanSupplier exists, T value) {
        if (exists.getAsBoolean()) {
            consumer.accept(value);
        }else {
            consumer.accept(null);
        }
    }

}
