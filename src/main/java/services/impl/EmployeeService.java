package services.impl;

import dto.DepartmentDTO;
import dto.EmployeeDTO;
import entity.Department;
import entity.Employee;
import excaption.BaseExcaption;
import excaption.ErrorMessage;
import excaption.MessageTYPE;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;
import services.IEmployeeService;

import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {
   @Autowired
  private EmployeeRepository employeeRepository;


    @Override
    public EmployeeDTO findEmployeeById(long id) {
   EmployeeDTO employeeDTO = new EmployeeDTO();
        DepartmentDTO departmentDTO = new DepartmentDTO();
      Optional<Employee> optional =employeeRepository.findById(id);
if(optional.isEmpty()) {
       throw new BaseExcaption(new ErrorMessage(MessageTYPE.No_Record_Exist,null));


        }

    Employee employee = optional.get();
Department department = employee.getDepartment();
        BeanUtils.copyProperties(employee,employeeDTO);
        BeanUtils.copyProperties(department,departmentDTO);

employeeDTO.setDepartment(departmentDTO);

return employeeDTO;
}








}