package com.javatechie.aspect;

import java.time.Duration;
import java.time.Instant;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class CustomAspect {



    @Around("@annotation(com.javatechie.aspect.LogAspect)")
    public void logWithAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info(joinPoint.toString() + " method execution start");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        log.info("Time took to execute the method : "+timeElapsed);
        log.info(joinPoint.getSignature().toString() + " method execution end");
    }

    @Around("@annotation(com.javatechie.aspect.LogRequest)")
    public Object logRequest(ProceedingJoinPoint joinPoint) throws Throwable {
        ObjectMapper om=new ObjectMapper(); 
        log.info("In method"+joinPoint.getSignature()+" with request as "+om.writeValueAsString(joinPoint.getArgs()));
        return joinPoint.proceed();
    }

    @Around("@annotation(com.javatechie.aspect.LogAspect)")
    public Object logResponse(ProceedingJoinPoint joinPoint) throws Throwable {
        ObjectMapper om=new ObjectMapper(); 
        Object obj =joinPoint.proceed();

        log.info("In method"+joinPoint.getSignature()+" with response as "+om.writeValueAsString(joinPoint.getArgs()));
        return obj;
    }
    
}
