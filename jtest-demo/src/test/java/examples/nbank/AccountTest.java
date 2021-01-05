package examples.nbank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Account
 *
 * @author dszyszlak
 * @see Account
 */
public class AccountTest
{
    /**
     * Parasoft Jtest UTA: Test for apply(ITransaction)
     *
     * @author dszyszlak
     * @see Account#apply(ITransaction)
     */
    @Test(timeout = 1000)
    public void testApply()
        throws Throwable
    {
        // Given
        Customer customer = mock(Customer.class);
        int initial_balance = 0; // UTA: default value
        Account underTest = new Account(customer, initial_balance);

        // When
        ITransaction transaction = mock(ITransaction.class);
        boolean applyResult = false; // UTA: default value
        when(transaction.apply(nullable(Account.class))).thenReturn(applyResult);

        int feeResult = 0; // UTA: default value
        when(transaction.fee()).thenReturn(feeResult);
        underTest.apply(transaction);

    }

    /**
     * Parasoft Jtest UTA: Test for getBalance()
     *
     * @author dszyszlak
     * @see Account#getBalance()
     */
    @Test(timeout = 1000)
    public void testGetBalance()
        throws Throwable
    {
        // Given
        Customer customer = mock(Customer.class);
        int initial_balance = 0; // UTA: default value
        Account underTest = new Account(customer, initial_balance);

        // When
        int result = underTest.getBalance();

        // Then
         assertEquals(0, result);
    }

    /**
     * Parasoft Jtest UTA: Test for getCustomer()
     *
     * @author dszyszlak
     * @see Account#getCustomer()
     */
    @Test(timeout = 1000)
    public void testGetCustomer()
        throws Throwable
    {
        // Given
        Customer customer = mock(Customer.class);
        int initial_balance = 0; // UTA: default value
        Account underTest = new Account(customer, initial_balance);

        // When
        Customer result = underTest.getCustomer();

        // Then
         assertNotNull(result);
    }

    /**
     * Parasoft Jtest UTA: Test for getID()
     *
     * @author dszyszlak
     * @see Account#getID()
     */
    @Test(timeout = 1000)
    public void testGetID()
        throws Throwable
    {
        // Given
        Customer customer = mock(Customer.class);
        String getSSNResult = ""; // UTA: default value
        when(customer.getSSN()).thenReturn(getSSNResult);
        int initial_balance = 0; // UTA: default value
        Account underTest = new Account(customer, initial_balance);

        // When
        String result = underTest.getID();

        // Then
        // assertEquals("", result);
    }

    /**
     * Parasoft Jtest UTA: Test for getStatus()
     *
     * @author dszyszlak
     * @see Account#getStatus()
     */
    @Test(timeout = 1000)
    public void testGetStatus()
        throws Throwable
    {
        // Given
        Customer customer = mock(Customer.class);
        int initial_balance = 0; // UTA: default value
        Account underTest = new Account(customer, initial_balance);

        // When
        String result = underTest.getStatus();

        // Then
        // assertEquals("", result);
    }

    /**
     * Parasoft Jtest UTA: Test for isOverdrawn(int)
     *
     * @author dszyszlak
     * @see Account#isOverdrawn(int)
     */
    @Test(timeout = 1000)
    public void testIsOverdrawn()
        throws Throwable
    {
        // Given
        Customer customer = mock(Customer.class);
        String getNameResult = ""; // UTA: default value
        when(customer.getName()).thenReturn(getNameResult);

        String getSSNResult = ""; // UTA: default value
        when(customer.getSSN()).thenReturn(getSSNResult);
        int initial_balance = 0; // UTA: default value
        Account underTest = new Account(customer, initial_balance);

        // When
        int balance = 0; // UTA: default value
        boolean result = underTest.isOverdrawn(balance);

        // Then
         assertFalse(result);
    }

    /**
     * Parasoft Jtest UTA: Test for reportToCreditAgency(ICreditAgency)
     *
     * @author dszyszlak
     * @see Account#reportToCreditAgency(ICreditAgency)
     */
    @Test(timeout = 1000)
    public void testReportToCreditAgency()
        throws Throwable
    {
        // Given
        Customer customer = mock(Customer.class);
        int initial_balance = 0; // UTA: default value
        Account underTest = new Account(customer, initial_balance);

        // When
        ICreditAgency agency = mock(ICreditAgency.class);
        boolean reportResult = false; // UTA: default value
        when(agency.report(nullable(Account.class))).thenReturn(reportResult);
        boolean result = underTest.reportToCreditAgency(agency);

        // Then
        // assertFalse(result);
    }

    /**
     * Parasoft Jtest UTA: Test for setBalance(int)
     *
     * @author dszyszlak
     * @see Account#setBalance(int)
     */
    @Test(timeout = 1000)
    public void testSetBalance()
        throws Throwable
    {
        // Given
        Customer customer = mock(Customer.class);
        int initial_balance = 0; // UTA: default value
        Account underTest = new Account(customer, initial_balance);

        // When
        int balance = 0; // UTA: default value
        underTest.setBalance(balance);

    }
}