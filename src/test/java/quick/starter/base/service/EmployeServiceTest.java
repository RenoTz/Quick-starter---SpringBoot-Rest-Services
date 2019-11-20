package quick.starter.base.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import quick.starter.base.controller.mapper.EmployeMapper;
import quick.starter.base.controller.resource.EmployeResource;
import quick.starter.base.jpa.Employe;
import quick.starter.base.jpa.EmployeRepository;

@RunWith(MockitoJUnitRunner.class)
public class EmployeServiceTest
{

    @InjectMocks
    private EmployeService service;

    @Mock
    private EmployeRepository repository;

    @Mock
    private EmployeMapper mapper;

    @Test
    public void testGetAllEmploye() throws Exception
    {
        // Arrange
        final List<Employe> lstEmploye = Lists.newArrayList();
        final List<EmployeResource> lstEmployeResource = Lists.newArrayList();
        when(this.repository.findAll()).thenReturn(lstEmploye);
        when(this.mapper.listEmployeToListEmployeResource(lstEmploye)).thenReturn(lstEmployeResource);
        // Act
        final List<EmployeResource> result = this.service.getAllEmploye();
        // Assert
        assertEquals(result, lstEmploye);
        verify(this.mapper, only()).listEmployeToListEmployeResource(lstEmploye);
        verify(this.repository, only()).findAll();

    }

}
