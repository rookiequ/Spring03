package com.user.dao.impl;

import com.user.dao.AccountDAO;
import com.user.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @author zzq
 */
@Repository("accountDAO")
public class AccountDAOImpl implements AccountDAO {

    //自动注入QueryRunner对象，但是QueryRunner需要创建，jar包无法修改，因此这里还是要在配置文件中配置
    @Autowired
    private QueryRunner queryRunner;

    /*public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }*/

    public List<Account> findAllAccount() throws SQLException {
        return queryRunner.query("select * from account", new BeanListHandler<Account>(Account.class));
    }

    public Account findAccountById(Integer id) throws SQLException {
        return queryRunner.query("select * from account where id = ?", new BeanHandler<Account>(Account.class), id);
    }

    public void saveAccount(Account account) throws SQLException {
        queryRunner.update("insert into account(name, money) values(?,?)",
                account.getName(),
                account.getMoney());
    }

    public void updateAccount(Account account) throws SQLException {
        queryRunner.update("update account set name=?, money=? where id=?",
                account.getName(),
                account.getMoney(),
                account.getId());
    }

    public void deleteAccount(Integer id) throws SQLException {
        queryRunner.update("delete from account where id=?", id);
    }
}
