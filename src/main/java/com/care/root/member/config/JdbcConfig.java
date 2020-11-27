package com.care.root.member.config;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//public JdbcConfig() {
//System.out.println("JdbcConfig 생성자 실행 테스트 -----"); // bean을 생성해주는지 서버 구동하면서 확인하기 위해
//}

@Configuration
@MapperScan(basePackages = {"com.care.root.member.dao"})
public class JdbcConfig {
	
	/*.xml에서 빈을 생성하는 과정을 annotation으로 함
		객체를 만들어주는 annotation(@Configuration)안에서 @bean이라는 어노테이션이 있으면 객체를 생성해준다.
	
	*/
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("c##jsp");
		ds.setPassword("1234");
		return ds;
	}
	
	// SqlSessionFactory는 메소드 내부에서 만들때는 SqlSessionFactoryBean으로 생성해야 된다.
	// 반환할 때에도 객체의 오브젝트 메소드를 사용해서 반환해야한다.
	// 원래 내부에는 mapper와 config의 경로를 설정하는 부분이 있었다.
	// 그걸 클래스에 Annotation @MapperScan(basePackages = {"사용할 경로"})를 이용해서 mapper를 처리한다.
	// xml기반의 mapper를 사용의 장점도 있다 
	// mapper.xml안에 동적 sql를 사용할 수 있기 때문 - if for같은 연산을 사용할 수 있음.
	// Annotaion 기반으로 설정하는 것은 간단하게 사용할 수 있는 장점? - 아직 잘 모름
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean ssf = new SqlSessionFactoryBean();
		ssf.setDataSource(dataSource());
		return ssf.getObject();
	}
	
	// SqlSession 안의 객체는 SqlSessionTemplate이다.
	@Bean
	public SqlSession sqlSession() throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory());
	}
	
	
}
