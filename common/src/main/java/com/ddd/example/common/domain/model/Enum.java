package com.ddd.example.common.domain.model;

import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Author xuyifan
 * Date on 7/11/2018 9:00 PM
 */
public class Enum<K, V> {

    private static Map<Class<? extends Enum>, ConcurrentHashMap<Object, Enum>> map = new ConcurrentHashMap<>();

    @Getter
    private K name;
    @Getter
    private V value;

    public Enum(@NotNull K name, @NotNull V value) {
        this.name = name;
        this.value = value;
        register();
    }

    private void register() {
        ConcurrentHashMap<Object, Enum> childEnums = map.get(this.getClass());
        if (childEnums == null) {
            childEnums = new ConcurrentHashMap<>();
            synchronized (Enum.class) {
                if (map.containsKey(this.getClass())) {
                    childEnums = map.get(this.getClass());
                } else {
                    map.put(this.getClass(), childEnums);
                }
            }
        }
        childEnums.put(this.name, this);
    }

    public static Enum getEnum(@NotNull Class<? extends Enum> clazz, @NotNull Object code) {
        return findClassMap(clazz).get(code);
    }

    private static ConcurrentHashMap<Object, Enum> findClassMap(Class type) {
        ConcurrentHashMap<Object, Enum> data = map.get(type);
        if (data == null) {
            try {
                Class.forName(type.getName());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            data = map.get(type);
        }
        return data;
    }

    public static Collection<Enum> values(Class type) {
        return findClassMap(type).values();
    }

}
