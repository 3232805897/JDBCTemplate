package JDBCTemplate;

import domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.SQLException;
import java.util.List;

public class TemplateTest {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("myjdbc.xml");
        JdbcTemplate jdbcTemplate = ioc.getBean(JdbcTemplate.class);
        //jdbcTemplate封装查询结果
        String sql = "select name from monster where id=?";

        BeanPropertyRowMapper<Person> personRowMapper = new BeanPropertyRowMapper<>(Person.class);
        //将查询到的结果封装
        String person = jdbcTemplate.queryForObject(sql,String.class,100);
        System.out.println(person);
    }
}
