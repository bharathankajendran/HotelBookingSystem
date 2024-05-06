package com.wipro.UserService;
import org.junit.Before;
import org.junit.Test;

import com.wipro.userservice.entity.User;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    private User user;

    @Before
    public void setUp() {
        user = new User();
        user.setUserId(1);
        user.setUserName("JohnDoe");
        user.setEmail("john@example.com");
        user.setPassword("password123");
        user.setRole("user");
        user.setMobile("1234567890");
        user.setAddress("123 Main St");
    }

    @Test
    public void testUserIdGetterAndSetter() {
        assertThat(user.getUserId()).isEqualTo(1);
    }

    @Test
    public void testUserNameGetterAndSetter() {
        assertThat(user.getUserName()).isEqualTo("JohnDoe");
    }

    @Test
    public void testEmailGetterAndSetter() {
        assertThat(user.getEmail()).isEqualTo("john@example.com");
    }

    @Test
    public void testPasswordGetterAndSetter() {
        assertThat(user.getPassword()).isEqualTo("password123");
    }

    @Test
    public void testRoleGetterAndSetter() {
        assertThat(user.getRole()).isEqualTo("user");
    }

    @Test
    public void testMobileGetterAndSetter() {
        assertThat(user.getMobile()).isEqualTo("1234567890");
    }

    @Test
    public void testAddressGetterAndSetter() {
        assertThat(user.getAddress()).isEqualTo("123 Main St");
    }

 
}
