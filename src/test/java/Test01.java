import com.user.config.SpringConfiguration01;
import com.user.config.SpringConfiguration02;
import com.user.config.SpringConfiguration03;
import com.user.domain.Account;
import com.user.service.AccountService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

/**
 * @author zzq
 */
public class Test01 {

    ApplicationContext applicationContext;
    AccountService accountService;

    @Before
    public void init(){
        //1.配置文件的方式
//        applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //2.注解的方式
        applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration03.class);
        accountService = applicationContext.getBean("accountService",AccountService.class);
    }


    @Test
    public void testFindAll() throws SQLException {
        List<Account> accountList = accountService.findAllAccount();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindAccountById() throws SQLException {
        Account account = accountService.findAccoutById(4);
        System.out.println(account);
    }

    @Test
    public void testSaveAccount() throws SQLException {
        Account account = new Account();
        account.setMoney(1000);
        account.setName("周七");
        accountService.saveAccount(account);
    }


    @Test
    public void testUpdateAccount() throws SQLException {
        Account account = new Account();
        account.setId(4);
        account.setName("渠立庆");
        account.setMoney(800);
        accountService.updateAccunt(account);
    }

    @Test
    public void testDeleteAccount() throws SQLException {
        accountService.deleteAccount(5);
    }

}
