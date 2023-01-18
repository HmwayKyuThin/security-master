package com.example.securitymaster.security.annotation.employees;
import org.springframework.security.access.annotation.Secured;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static com.example.securitymaster.security.SecurityRoles.*;
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Secured(ROLES_PREFIX+EMPLOYEES_PAG_VIEW)
public @interface EmployeesPagView {
}
