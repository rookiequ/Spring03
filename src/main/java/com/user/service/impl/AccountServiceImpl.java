package com.user.service.impl;

import com.user.dao.AccountDAO;
import com.user.domain.Account;
import com.user.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @author zzq
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    //自动注入AccountDAO对象，这里回去Account是实现类中找，如果只有唯一的实现类就会用唯一实现类创建对象
    @Autowired
    private AccountDAO accountDAO;

   /* public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }*/

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
