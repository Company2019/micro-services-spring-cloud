package com.app1.student;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
 
@RestController
@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
@RequestMapping("/product")
public class SpringBootStudentServiceApplication
{
	
    @RequestMapping(value = "/echoStudentName/{name}")
    public String echoStudentName(@PathVariable(name = "name") String name)
    {
        return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " ;
    }
 
    @RequestMapping(value = "/getStudentDetails/{name}")
    public Student getStudentDetails(@PathVariable(name = "name") String name)
    {
    	System.out.println("test");
        return new Student(name, "Pune", "MCA");
    }
    @Autowired
    private EurekaClient discoveryClient;

    public List<InstanceInfo> serviceUrl() {
        Application instance = discoveryClient.getApplication("student1");
        return instance.getInstances();
    }
    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootStudentServiceApplication.class, args);
    }
}
 
class Student
{
    String name;
    String address;
    String cls;
 
    public Student(String name, String address, String cls) {
        super();
        this.name = name;
        this.address = address;
        this.cls = cls;
    }
 
    public String getName() {
        return name;
    }
 
    public String getAddress() {
        return address;
    }
 
    public String getCls() {
        return cls;
    }
}