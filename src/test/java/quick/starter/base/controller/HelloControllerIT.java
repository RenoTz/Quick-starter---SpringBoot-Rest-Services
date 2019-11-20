package quick.starter.base.controller;

import static org.junit.Assert.assertEquals;

import java.net.URL;

import javax.servlet.ServletContext;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIT
{

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;

    @Autowired
    private ServletContext context;

    @Before
    public void setUp() throws Exception
    {
        this.base =
            new URL("http://localhost:".concat(String.valueOf(this.port).concat(this.context.getContextPath())));
    }

    @Test
    public void getHello() throws Exception
    {
        // Arrange
        final String url = this.base.toString().concat("/hello");
        // Act
        final ResponseEntity<String> response = this.template.getForEntity(url, String.class);
        // Assert
        assertEquals("Hello world!", response.getBody());
    }
}
