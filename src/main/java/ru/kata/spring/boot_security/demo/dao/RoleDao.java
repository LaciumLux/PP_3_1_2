package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.Collection;

public interface RoleDao {
    Collection<Role> getAllRoles();
}