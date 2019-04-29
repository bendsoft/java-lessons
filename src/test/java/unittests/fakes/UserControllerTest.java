package unittests.fakes;

import junit.framework.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.matchers.JUnitMatchers;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

// @RunWith wird gebraucht, damit mit inner classes gearbeitet werden kann
@RunWith(Enclosed.class)
public class UserControllerTest {

    // Pro getestete Methode gibt es eine inner class (Hier für UserController.create)
    public static class create {

        // --- Testing with Fakes ---

        @Rule
        public ExpectedException expected = ExpectedException.none();

        @Test
        public void NO_FAKE_withValidInexistingUsername_returnsOK() {
            UserController ctrl = new UserController();
            User user = new User("kalua");

            Message result = ctrl.create(user);

            Assert.assertEquals(result.status, Message.Status.OK);
        }


        // --- Testing Exceptions ---

        @Test
        public void MOCKITO_FAKE_withValidInexistingUsername_returnsOK() {
            // TODO
            // 1. Test schneller machen
            // 2. UserController.create so beinflussen,
            //      dass einmal der "if"- und einmal der "else"-Fall durchlaufen wird
        }

        @Test
        public void TRY_CATCH_withNullUser_throwsIllegalArgumentExc() {
            try {
                UserController ctrl = new UserController();
                ctrl.create(null);
                Assert.fail("No IllegalArgumentExc was thrown");
            } catch (IllegalArgumentException ex) {
                // Optional: Test message
                Assert.assertEquals("user required", ex.getMessage());
            }
        }

        @Test(expected = IllegalArgumentException.class)
        public void EXPECTED_withNullUser_throwsIllegalArgumentExc() {
            UserController ctrl = new UserController();
            ctrl.create(null);
        }

        @Test
        public void RULE_withNullUser_throwsIllegalArgumentExc() {
            expected.expect(IllegalArgumentException.class);
            // Optional: Test message
            expected.expectMessage(JUnitMatchers.containsString("required"));

            UserController ctrl = new UserController();
            ctrl.create(null);
        }
    }
}
