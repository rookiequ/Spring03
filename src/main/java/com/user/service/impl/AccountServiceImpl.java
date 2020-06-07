package com.user.service.impl;

import com.user.dao.AccountDAO;
import com.user.domain.Account;
import com.user.service.AccountService;

import java.sql.SQLException;
import java.util.List;

/**
 * @author zzq
 */
public class AccountServiceImpl implements AccountService {

    private AccountDAO accountDAO;

    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public List<Account> findAllAccount() throws SQLException {
        return accountDAO.findAllAccount();
    }

    public Account findAccoutById(Integer id) throws SQLException {
        return accountDAO.findAccountById(id);
    }

    public void saveAccount(Account account) throws SQLException {
        accountDAO.saveAccount(account);
    }

    public void updateAccunt(Account account) throws SQLException {
        accountDAO.updateAccount(account);
    }

    public void deleteAccount(Integer id) throws SQLException {
        accountDAO.deleteAccount(id);
    }
}
