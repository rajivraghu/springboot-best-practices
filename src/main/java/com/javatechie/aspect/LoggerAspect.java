package com.javatechie.aspect;

import java.time.Duration;
import java.time.Instant;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class LoggerAspect {



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
    
}
