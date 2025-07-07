package com.flashcard.backend.service.impl;

import com.flashcard.backend.dto.EmployeeDto;
import com.flashcard.backend.entity.Employee;
import com.flashcard.backend.mapper.EmployeeMapper;
import com.flashcard.backend.repository.EmployeeRepository;
import com.flashcard.backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
