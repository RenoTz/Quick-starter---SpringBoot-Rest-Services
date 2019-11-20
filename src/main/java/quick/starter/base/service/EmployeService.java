package quick.starter.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quick.starter.base.controller.mapper.EmployeMapper;
import quick.starter.base.controller.resource.EmployeResource;
import quick.starter.base.jpa.EmployeRepository;

@Service
public class EmployeService
{
    @Autowired
    private EmployeRepository repository;

    @Autowired
    private EmployeMapper mapper;

    public List<EmployeResource> getAllEmploye()
    {

        return this.mapper.listEmployeToListEmployeResource(this.repository.findAll());
    }

}
