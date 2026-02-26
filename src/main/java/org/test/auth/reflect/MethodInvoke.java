package org.test.auth.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvoke {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        // Person personInstance=new Person();

        Class<?> clazz = Person.class;
        //initial a instance
        Constructor<?> constructor = clazz.getConstructor(String.class);
        Object personInstance = constructor.newInstance("11");

        //invoke a method
        //Class<?> clazz = Person.class;
        Method method = clazz.getMethod("sayHello");
        method.invoke(personInstance);

        Method methodWithArgs = clazz.getMethod("greet", String.class);
        methodWithArgs.invoke(personInstance, "World");

        // 获取所有接口
        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> i : interfaces) {
            System.out.println("Interface: " + i.getName());
        }


        // 获取父类
        Class<?> superClass = clazz.getSuperclass();
        System.out.println("Superclass: " + superClass.getName());


        //set field
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        System.out.println("Name: " + nameField.get(personInstance));

        // 修改字段
        nameField.set(personInstance, "Doe");
        System.out.println("Updated Name: " + nameField.get(personInstance));

    }
}
