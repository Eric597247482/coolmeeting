package org.javalad.meeting.service;

import org.javalad.meeting.mapper.DepartmentMapper;
import org.javalad.meeting.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Eric
 * @date 2020/7/26 0026
 **/
@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    public Department getDepById(Integer id) {
        return departmentMapper.getDepById(id);
    }
}
