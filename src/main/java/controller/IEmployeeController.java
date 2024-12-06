package controller;

import dto.EmployeeDTO;
import entity.RootEntity;

public interface IEmployeeController {
    public RootEntity<EmployeeDTO> findEmployeeById(long id);
}
