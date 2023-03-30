package JDBCTemplate;

import domain.Monster;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

public class TemplateTest {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("myjdbc.xml");
        JdbcTemplate jdbcTemplate = ioc.getBean(JdbcTemplate.class);
        //jdbcTemplate封装查询结果
        String sql = "select * from monster where id=?";

        BeanPropertyRowMapper<Monster> personRowMapper = new BeanPropertyRowMapper<>(Monster.class);
        //将查询到的结果封装
        String person = jdbcTemplate.queryForObject(sql,String.class,100);
        System.out.println(person);
    }
}
