package com.user.dao;

import com.user.domain.Account;

import java.sql.SQLException;
import java.util.List;

public interface AccountDAO {

    /**
     * 查询所有
     * @return
     */
    List<Account> findAllAccount() throws SQLException;

    /**
     * 根据id查询账户信息
     * @param id
     * @return
     */
    Account findAccountById(Integer id) throws SQLException;

    /**
     * 保存账户信息
     * @param account
     */
    void saveAccount(Account account) throws SQLException;


    /**
     * 更新账户信息
     * @param account
     */
    void updateAccount(Account account) throws SQLException;

    /**
     * 删除账户信息
     * @param id
     */
    void deleteAccount(Integer id) throws SQLException;
}
