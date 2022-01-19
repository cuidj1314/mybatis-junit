package com.example.mybaisjunit.mapper;

import com.example.mybaisjunit.domain.VisitorDo;
import com.example.mybaisjunit.model.VisitorListQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@MapperScan("com.example.mybaisjunit.mapper")
@SpringBootTest
public class VisitorMapperTest {

    @Autowired
    private VisitorMapper mapper;

    @Test
    public void insertQueryTest(){

        VisitorListQuery query = new VisitorListQuery();
        query.setDeviceCode("abcd");
        List<VisitorDo> list = mapper.insertQuery(query);
        assertThat(list).hasSize(1);
    }
}
