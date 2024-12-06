package services;

import dto.EmployeeDTO;
import entity.Employee;

public interface IEmployeeService {

    public EmployeeDTO findEmployeeById(long id);
}
