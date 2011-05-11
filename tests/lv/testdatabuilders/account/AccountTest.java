package lv.testdatabuilders.account;

import lv.testdatabuilders.account.Account;
import lv.testdatabuilders.account.AccountBuilder;
import lv.testdatabuilders.account.AccountStatus;
import lv.testdatabuilders.account.CompanyBuilder;
import org.junit.Test;


public class AccountTest  {

    @Test
    public void accountTest_withCreateMethod() {
        Account account = createAccount("NAME", "ID", AccountStatus.ACTIVE);
    }

    @Test
    public void accountTest_withTestDataBuilder() {
        Account account = new AccountBuilder()
                .withId("ID").withName("NAME").with(AccountStatus.ACTIVE).build();
    }

    @Test
    public void accountTest_withTestDataBuilder_CompanyBuilder() {
        Account account = new AccountBuilder().with(new CompanyBuilder()).build();
    }


    @Test
    public void accountTest_withTestDataBuilder_DEFAULT_VALUES() {
        Account account = new AccountBuilder().build();
    }


    private Account createAccount(String name, String id, AccountStatus status) {
        Account account = new Account();
        account.setId(id);
        account.setName(name);
        account.setStatus(status);
        return account;
    }

}
