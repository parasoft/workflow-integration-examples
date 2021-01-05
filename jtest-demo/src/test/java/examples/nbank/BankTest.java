package examples.nbank;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * Parasoft Jtest UTA: Test class for Bank
 *
 * @author dszyszlak
 * @see Bank
 */
public class BankTest
{
    /**
     * Parasoft Jtest UTA: Test for addAccount(Account)
     *
     * @author dszyszlak
     * @see Bank#addAccount(Account)
     */
    @Test(timeout = 1000)
    public void testAddAccount()
        throws Throwable
    {
        // Given
        Bank underTest = new Bank();

        // When
        Account account = mock(Account.class);
        String getIDResult = ""; // UTA: default value
        when(account.getID()).thenReturn(getIDResult);
        Boolean result = underTest.addAccount(account);

        // Then
        // assertFalse(result);
    }

    /**
     * Parasoft Jtest UTA: Test for closeAccounts(List)
     *
     * @author dszyszlak
     * @see Bank#closeAccounts(List)
     */
    @Test(timeout = 1000)
    public void testCloseAccounts()
        throws Throwable
    {
        // Given
        Bank underTest = new Bank();

        // When
        List<Account> list = new ArrayList<Account>(); // UTA: default value
        Account item = mock(Account.class);
        list.add(item);
        underTest.closeAccounts(list);

    }

    /**
     * Parasoft Jtest UTA: Test for endMaintenance()
     *
     * @author dszyszlak
     * @see Bank#endMaintenance()
     */
    @Test(timeout = 1000)
    public void testEndMaintenance()
        throws Throwable
    {
        // Given
        Bank underTest = new Bank();

        // When
        underTest.endMaintenance();

    }

    /**
     * Parasoft Jtest UTA: Test for getAccount(String, String)
     *
     * @author dszyszlak
     * @see Bank#getAccount(String, String)
     */
    @Test(timeout = 1000)
    public void testGetAccount()
        throws Throwable
    {
        // Given
        Bank underTest = new Bank();

        // When
        String id = ""; // UTA: default value
        String name = ""; // UTA: default value
        Account result = underTest.getAccount(id, name);

        // Then
         assertNull(result);
    }

    /**
     * Parasoft Jtest UTA: Test for isMaintenanceMode()
     *
     * @author dszyszlak
     * @see Bank#isMaintenanceMode()
     */
    @Test(timeout = 1000)
    public void testIsMaintenanceMode()
        throws Throwable
    {
        // Given
        Bank underTest = new Bank();

        // When
        Boolean result = underTest.isMaintenanceMode();

        // Then
         assertFalse(result);
    }

    /**
     * Parasoft Jtest UTA: Test for setAccountsLimit(Integer)
     *
     * @author dszyszlak
     * @see Bank#setAccountsLimit(Integer)
     */
    @Test(timeout = 1000)
    public void testSetAccountsLimit()
        throws Throwable
    {
        // When
        Integer limit = 0; // UTA: default value
        Bank.setAccountsLimit(limit);

    }

    /**
     * Parasoft Jtest UTA: Test for startMaintenance()
     *
     * @author dszyszlak
     * @see Bank#startMaintenance()
     */
    @Test(timeout = 1000)
    public void testStartMaintenance()
        throws Throwable
    {
        // Given
        Bank underTest = new Bank();

        // When
        underTest.startMaintenance();

    }
}