package quick.starter.base.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import quick.starter.base.jpa.EmployeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeServiceTest
{

    @Autowired
    private EmployeService service;

    @Mock
    private EmployeRepository repository;

    @Test
    public void testGetAllEmploye() throws Exception
    {
        // when(this.repository)

        this.service.getAllEmploye();

    }

}
