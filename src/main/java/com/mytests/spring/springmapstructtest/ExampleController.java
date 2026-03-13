package com.mytests.spring.springmapstructtest;

import com.mytests.spring.springmapstructtest.mappers.CarMapper;
import com.mytests.spring.springmapstructtest.mappers.IssueMapper;
import com.mytests.spring.springmapstructtest.mappers.UserMapper;
import com.mytests.spring.springmapstructtest.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class ExampleController
{
    private final CarMapper carMapper;
    private final UserMapper userMapper;
    private final IssueMapper issueMapper;

    public ExampleController(CarMapper mapper, UserMapper userMapper, IssueMapper issueMapper) {
        this.carMapper = mapper;
        this.userMapper = userMapper;
        this.issueMapper = issueMapper;
    }

    @GetMapping(path = "/car2view")
    public CarView car2view(@RequestParam String name) {
        final int id = ThreadLocalRandom.current().nextInt(0x100000);
        final Car car = new Car(id, name);
        return carMapper.carViewFromEntity(car);
    }
    @GetMapping(path = "/view2car")
    public Car view2car(@RequestParam String name) {
        final int id = ThreadLocalRandom.current().nextInt(0x100000);
        final CarView carView = new CarView(id, name);
        return carMapper.carFromView(carView);
    }
    @GetMapping(path = "/user2view")
    public UserView user2view(@RequestParam String name) {
        final int id = ThreadLocalRandom.current().nextInt(0x100000);
        final int age = ThreadLocalRandom.current().nextInt(100);
        final String email = name+"@gmail.com";
        final User user = new User(id, name, age, email);
        return userMapper.toDto(user);
    }
    @GetMapping(path = "/view2user")
    public User view2user(@RequestParam String name) {
        final int id = ThreadLocalRandom.current().nextInt(0x100000);
        final int age = ThreadLocalRandom.current().nextInt(100);
        final String email = name+"@gmail.com";
        final UserView userView = new UserView(id, name, age, email);
        return userMapper.toUser(userView);
    }
    @GetMapping(path = "/issue2view")
    public IssueView issue2view(@RequestParam String name) {
        final int id = ThreadLocalRandom.current().nextInt(0x100000);
        final Issue issue = new Issue(id, name);
        return issueMapper.issueViewFromEntity(issue);
    }
    @GetMapping(path = "/view2issue")
    public Issue view2issue(@RequestParam String name) {
        final int id = ThreadLocalRandom.current().nextInt(0x100000);
        final IssueView issueView = new IssueView(id, name);
        return issueMapper.issueFromView(issueView);
    }
}
