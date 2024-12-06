package controller.impl;

import controller.IEmployeeController;
import dto.EmployeeDTO;
import entity.RootEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.impl.EmployeeService;

@RestController
@RequestMapping("/rest/api/employee")
public class EmployeeController extends RestBaseController implements IEmployeeController {
   @Autowired
   private EmployeeService employeeService;

@GetMapping(("list/{id}"))
    @Override
    public RootEntity<EmployeeDTO> findEmployeeById(@PathVariable(value = "id")  long id) {
        return ok(employeeService.findEmployeeById(id));
    }
}
