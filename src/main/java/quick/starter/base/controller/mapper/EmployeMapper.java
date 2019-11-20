package quick.starter.base.controller.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import quick.starter.base.controller.resource.EmployeResource;
import quick.starter.base.jpa.Employe;

@Mapper(componentModel = "spring")
public interface EmployeMapper
{
    EmployeResource employeToEmployeResource(final Employe employe);

    List<EmployeResource> listEmployeToListEmployeResource(final List<Employe> lstEmploye);
}
