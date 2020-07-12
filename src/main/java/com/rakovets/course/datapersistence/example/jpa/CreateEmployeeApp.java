package com.rakovets.course.datapersistence.example.jpa;

import com.rakovets.course.datapersistence.example.jpa.dal.dao.EmployeeDao;
import com.rakovets.course.datapersistence.example.jpa.dal.entity.EmployeeEntity;
import com.rakovets.course.datapersistence.example.jpa.util.DynamicEntityManagerFactoryUtil;

public class CreateEmployeeApp {
    public static void main(String[] args) {
        EmployeeEntity employeeEntity = new EmployeeEntity("Dmitry Rakovets", 120000, "Software Engineer");
        EmployeeDao employeeDao = new EmployeeDao();

        // Use Hibernate persistence unit
        DynamicEntityManagerFactoryUtil.init("Hibernate");
        employeeDao.save(employeeEntity);
        DynamicEntityManagerFactoryUtil.close();

        // Use EclipseLink persistence unit
        DynamicEntityManagerFactoryUtil.init("EclipseLink");
        employeeDao.save(employeeEntity);
        DynamicEntityManagerFactoryUtil.close();
    }
}
