package com.org.account.services.impl;

import com.org.account.controller.SampleController;
import com.org.account.controller.UserController;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MockServletContext.class)
@WebAppConfiguration
public class UserServiceImplTest {

    private MockMvc mvc;
    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(
                new SampleController(),
                new UserController()).build();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello World")));
    }

    @Test
    public void findAll()  throws Exception {
//  	测试UserController
        RequestBuilder request = null;
        // 1、get查一下user列表，应该为空
        request = get("/users/list");
        System.out.print("............begin"+request.toString()+"end.............");
        mvc.perform(request).andExpect(status().isOk());
       /* mvc.perform(request)
                .andExpect(status().isOk());*/
    }

    @Test
    public void insertByUser() throws Exception  {
        RequestBuilder request = null;
        // 2、post提交一个user
        request = post("/users/create")
                .param("id", "1")
                .param("name", "测试大师")
                .param("age", "20");
        mvc.perform(request)
//				.andDo(MockMvcResultHandlers.print())
                .andExpect(content().string(equalTo("success")));
    }

    @Test
    public void update()  throws Exception {
    }

    @Test
    public void delete() throws Exception  {
    }
}