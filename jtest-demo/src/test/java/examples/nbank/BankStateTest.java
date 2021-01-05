package examples.nbank;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * Parasoft Jtest UTA: Test class for BankState
 *
 * @author dszyszlak
 * @see BankState
 */
public class BankStateTest
{
    /**
     * Parasoft Jtest UTA: Test for endMaintenance()
     *
     * @author dszyszlak
     * @see BankState#endMaintenance()
     */
    @Test(timeout = 1000)
    public void testEndMaintenance()
        throws Throwable
    {
        // When
        BankState.endMaintenance();

    }

    /**
     * Parasoft Jtest UTA: Test for isMaintenanceMode()
     *
     * @author dszyszlak
     * @see BankState#isMaintenanceMode()
     */
    @Test(timeout = 1000)
    public void testIsMaintenanceMode()
        throws Throwable
    {
        // When
        Boolean result = BankState.isMaintenanceMode();

        // Then
        // assertFalse(result);
    }

    /**
     * Parasoft Jtest UTA: Test for startMaintenance()
     *
     * @author dszyszlak
     * @see BankState#startMaintenance()
     */
    @Test(timeout = 1000)
    public void testStartMaintenance()
        throws Throwable
    {
        // When
        BankState.startMaintenance();

    }
}