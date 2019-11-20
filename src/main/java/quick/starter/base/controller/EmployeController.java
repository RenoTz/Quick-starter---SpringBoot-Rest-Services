package quick.starter.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quick.starter.base.controller.resource.EmployeResource;
import quick.starter.base.service.EmployeService;

@RestController
@RequestMapping("/employe")
public class EmployeController
{

    @Autowired
    private EmployeService employeService;

    @GetMapping
    public ResponseEntity<List<EmployeResource>> retrieveAllEmploye()
    {
        return ResponseEntity.ok(this.employeService.getAllEmploye());
    }

}
