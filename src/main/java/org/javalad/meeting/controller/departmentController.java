package org.javalad.meeting.controller;

import org.javalad.meeting.model.Department;
import org.javalad.meeting.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Eric
 * @date 2020/7/26 0026
 **/
@RestController
public class departmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/dep")
    public String getDepById(Integer id) {
        Department dep = departmentService.getDepById(id);
        System.out.println("dep =" + dep.toString());
        return dep.getDepartmentname();
    }
}
