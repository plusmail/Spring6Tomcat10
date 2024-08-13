package com.yi.spring6tomcat10;


import com.yi.spring6tomcat10.mapper.TimeMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class SampleTests {


    @Autowired
    private DataSource dataSource;

    @Autowired
    private TimeMapper timeMapper;

    @Test
    public void testConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        log.info(connection);
        System.out.println("1111111111111111");
        Assertions.assertNotNull(connection);
        connection.close();
    }


    @Test
    public void testTimeMapper() throws SQLException {
        System.out.printf(timeMapper.getNow());
    }
}
