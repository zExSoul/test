package com.ddd.example.common.validate;

import io.terminus.common.exception.JsonResponseException;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * 统一校验类
 * 抛出JsonResponseException
 * <p>
 * Author xuyifan
 * Date on 7/11/2018 12:01 PM
 */
@SuppressWarnings("all")
public class Validate implements Serializable {
    private static final long serialVersionUID = 1L;

    public Validate() {
        super();
    }

    public void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new JsonResponseException(message);
        }
    }

    public void isNull(Object object, String message) {
        if (object != null) {
            throw new JsonResponseException(message);
        }
    }

    public void isBlank(CharSequence text, String message) {
        if (StringUtils.isNotBlank(text)) {
            throw new JsonResponseException(message);
        }
    }

    public <T> T notNull(T object, String message) {
        if (object == null) {
            throw new JsonResponseException(message);
        } else {
            return object;
        }
    }

    public <T> T[] notEmpty(T[] array, String message) {
        if (array == null) {
            throw new JsonResponseException(message);
        } else if (array.length == 0) {
            throw new JsonResponseException(message);
        } else {
            return array;
        }
    }

    public <T extends Collection<?>> T notEmpty(T collection, String message) {
        if (collection == null) {
            throw new JsonResponseException(message);
        } else if (collection.isEmpty()) {
            throw new JsonResponseException(message);
        } else {
            return collection;
        }
    }

    public <T extends Map<?, ?>> T notEmpty(T map, String message) {
        if (map == null) {
            throw new JsonResponseException(message);
        } else if (map.isEmpty()) {
            throw new JsonResponseException(message);
        } else {
            return map;
        }
    }

    public <T extends CharSequence> T notEmpty(T chars, String message) {
        if (chars == null) {
            throw new JsonResponseException(message);
        } else if (chars.length() == 0) {
            throw new JsonResponseException(message);
        } else {
            return chars;
        }
    }

    public <T extends CharSequence> T notBlank(T chars, String message) {
        if (chars == null) {
            throw new JsonResponseException(message);
        } else if (StringUtils.isBlank(chars)) {
            throw new JsonResponseException(message);
        } else {
            return chars;
        }
    }

    public <T> T[] validIndex(T[] array, int index, String message) {
        notNull(array, message);
        if (index >= 0 && index < array.length) {
            return array;
        } else {
            throw new JsonResponseException(message);
        }
    }

    public <T extends Collection<?>> T validIndex(T collection, int index, String message) {
        notNull(collection, message);
        if (index >= 0 && index < collection.size()) {
            return collection;
        } else {
            throw new JsonResponseException(message);
        }
    }

    public <T extends CharSequence> T validIndex(T chars, int index, String message) {
        notNull(chars, message);
        if (index >= 0 && index < chars.length()) {
            return chars;
        } else {
            throw new JsonResponseException(message);
        }
    }

    public void validState(boolean expression, String message) {
        if (!expression) {
            throw new JsonResponseException(message);
        }
    }

    public void matchesPattern(CharSequence input, String pattern, String message) {
        if (!Pattern.matches(pattern, input)) {
            throw new JsonResponseException(message);
        }
    }

    public <T> void inclusiveBetween(T start, T end, Comparable<T> value, String message) {
        if (value.compareTo(start) < 0 || value.compareTo(end) > 0) {
            throw new JsonResponseException(message);
        }
    }

    public <T> void exclusiveBetween(T start, T end, Comparable<T> value, String message) {
        if (value.compareTo(start) <= 0 || value.compareTo(end) >= 0) {
            throw new JsonResponseException(message);
        }
    }

    public void isInstanceOf(Class<?> type, Object obj, String message) {
        if (!type.isInstance(obj)) {
            throw new JsonResponseException(message);
        }
    }

    public void isAssignableFrom(Class<?> superType, Class<?> type, String message) {
        if (!superType.isAssignableFrom(type)) {
            throw new JsonResponseException(message);
        }
    }

}
