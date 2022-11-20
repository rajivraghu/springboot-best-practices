package com.javatechie.aspect;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.core.annotation.Order;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Order(value = 1)
public @interface LogRequest {
    
}
