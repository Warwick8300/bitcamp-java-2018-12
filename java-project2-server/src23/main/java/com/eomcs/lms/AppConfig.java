package com.eomcs.lms;

import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// 특정 패키지를 탐색하여 @Component
@ComponentScan(basePackages = "com.eomcs.lms")
// . properties 파일을 로딩 시키는 애노테이션
@PropertySource("classpath:/com/eomcs/lms/conf/jdbc.properties")

@EnableTransactionManagement
@MapperScan("com.eomcs.lms.dao") //DAO 인터페이스가 있는 패키지를 지정한다.
public class AppConfig {

  // @Autowired 자동으로
  // ==> 빈 컨테이너에서 지정한 타입의 값을 꺼내 필드에 넣으라는 명령이다.

  // ==> 예) 다음은 빈 컨테이너에서 Environment 타입의 객체를 찾아 env라는 필드에 주소를 주입하라는 뜻,

  // .properties 파일의 내용을
  @Autowired
  Environment env;
  //Environment? 객체
  // => @PropertySource 애노테이션에서 지정한 .properties 파일의 값을 꺼내는 일을 한다.

  //@Bean
  // =>객체를 생성해주는 메서드(펙토리 메서드) 를 표시할때 사용한다.
  // => Spring IoC컨테이너는 이 애노 테이션이 붙은 메서드를 호출하여 그 리턴 값을 보관한다.
  // => 객체를 보관할 떄 사용할 이름음 Bean 애노테이션에 지정한 이름이다.
  
  // DB 커넥션 풀 기능을 수행할 DataSource 객체를 생성하는 메서드 
  @Bean
  public DataSource dataSource() {
    BasicDataSource ds = new BasicDataSource();
    ds.setDriverClassName(env.getProperty("jdbc.driver"));//
    ds.setUrl(env.getProperty("jdbc.url"));
    ds.setUsername(env.getProperty("jdbc.userName"));
    ds.setPassword(env.getProperty("jdbc.password"));
    return ds;
  }
  
  // Connection의 commit/roollback을 처리하는 트랜젝션 관리자를 생성하는 메
  @Bean
  public PlatformTransactionManager transationManager(DataSource dataSource) {
    return new DataSourceTransactionManager(dataSource);
  }
  
  
  @Bean
  public SqlSessionFactory sqlSessionFactory(DataSource dataSource, ApplicationContext appCtx) throws Exception {
    SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
    
    factoryBean.setDataSource(dataSource);
    
    factoryBean.setTypeAliasesPackage("com.eomcs.lms.domain");
    factoryBean.setMapperLocations(appCtx.getResources("classpath:/com/eomcs/lms/mapper/*.xml"));
    return factoryBean.getObject();
  }
  
  
  
  
  
  // Dao 구현체 자동 생성하기 방법2:
  // =>MapperScannerConfigurer 객체를 통해 DAO 구현체 자동 생성
  

  
  
  
  /*
   * Dao 구현체 자동생성하기 방법 1: 
   *
  @Bean
  public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
  return new SqlSessionTemplate(sqlSessionFactory);
}
  
  
  // BoardDao 객체를 만들어 주는 메서드
  @Bean
  public BoardDao boardDao(SqlSessionTemplate sqlSessionTemplate) throws Exception {
    
    return sqlSessionTemplate.getMapper(BoardDao.class);
  }

  // MemberDao 객체를 만들어 주는 메서드
  @Bean
  public MemberDao memberDao(SqlSessionTemplate sqlSessionTemplate) throws Exception {
    
    return sqlSessionTemplate.getMapper(MemberDao.class);
  }

  // LessonDao 객체를 만들어 주는 메서드
  @Bean
  public LessonDao lessonDao(SqlSessionTemplate sqlSessionTemplate) throws Exception {
    
    return sqlSessionTemplate.getMapper(LessonDao.class);
  }

  // PhotoBoardDao 객체를 만들어 주는 메서드
  @Bean
  public PhotoBoardDao photoBoardDao(SqlSessionTemplate sqlSessionTemplate) throws Exception {
    
    return sqlSessionTemplate.getMapper(PhotoBoardDao.class);
  }

  // PhotoFileDao 객체를 만들어 주는 메서드
  @Bean
  public PhotoFileDao photoFileDao(SqlSessionTemplate sqlSessionTemplate) throws Exception {
    
    return sqlSessionTemplate.getMapper(PhotoFileDao.class);
  }
*/



  

}


