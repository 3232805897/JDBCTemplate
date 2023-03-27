package JDBCTemplate;

import domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TemplateTest {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("JDBCbean.xml");

        JdbcTemplate jdbcTemplate = ioc.getBean(JdbcTemplate.class);
//        String sql1 ="insert into monster values(?,?,?)";
//        String sql2 ="insert into monster values(?,?,?)";
//        //进行批处理
////        List<Object[]> batchList = new ArrayList<>();
////        batchList.add(new Object[]{500,"张三","aa"});
////        batchList.add(new Object[]{600,"张三","aa"});
////        batchList.add(new Object[]{700,"张三","aa"});
////        int[] ints = jdbcTemplate.batchUpdate(sql,batchList);
//        jdbcTemplate.batchUpdate(sql1,sql2);
        String sql = "select id as personId,name,skill from monster where id = ?";
        RowMapper<Person> personRowMapper = new BeanPropertyRowMapper<>(Person.class);
        Person person = jdbcTemplate.queryForObject(sql, personRowMapper, 100);
        System.out.println(person);
    }
}
