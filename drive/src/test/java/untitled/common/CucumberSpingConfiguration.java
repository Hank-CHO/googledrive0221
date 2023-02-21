package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.DriveApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { DriveApplication.class })
public class CucumberSpingConfiguration {}
