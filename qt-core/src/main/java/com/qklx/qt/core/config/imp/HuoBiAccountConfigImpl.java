package com.qklx.qt.core.config.imp;

import com.qklx.qt.core.domain.Account;
import com.qklx.qt.core.config.AccountConfig;
import lombok.Data;

@Data
public class HuoBiAccountConfigImpl implements AccountConfig {

    private Account account;

    public HuoBiAccountConfigImpl(Account account) {
        this.account = account;
    }

    @Override
    public String accountId() {
        return account.getId();
    }

    @Override
    public String getAccessKey() {
        return account.getAccessKey();
    }

    @Override
    public String getSecretKey() {
        return account.getSecretKey();
    }

    @Override
    public String getUserId() {
        return account.getUserId();
    }
}
