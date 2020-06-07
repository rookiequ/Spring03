package com.user.dao.impl;

import com.user.dao.AccountDAO;
import com.user.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author zzq
 */
public class AccountDAOImpl implements AccountDAO {

    QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    public List<Account> findAllAccount() throws SQLException {
        return queryRunner.query("select * from account", new BeanListHandler<Account>(Account.class));
    }

    public Account findAccountById(Integer id) throws SQLException {
        return queryRunner.query("select * from account where id = ?", new BeanHandler<Account>(Account.class), id);
    }

    public void saveAccount(Account account) throws SQLException {
        queryRunner.update("insert into account(name, money) values(?,?)",
                account.getName(),
                account.getMonty());
    }

    public void updateAccount(Account account) throws SQLException {
        queryRunner.update("update account set name=?, money=? where id=?",
                account.getName(),
                account.getMonty(),
                account.getId());
    }

    public void deleteAccount(Integer id) throws SQLException {
        queryRunner.update("delete from account where id=?", id);
    }
}
