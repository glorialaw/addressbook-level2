package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UtilsTest {


    @Test
    public void elementsAreUnique() throws Exception {
        // empty list
        assertAreUnique();

        // only one object
        assertAreUnique((Object) null);
        assertAreUnique(1);
        assertAreUnique("");
        assertAreUnique("abc");

        // all objects unique
        assertAreUnique("abc", "ab", "a");
        assertAreUnique(1, 2);

        // some identical objects
        assertNotUnique("abc", "abc");
        assertNotUnique("abc", "", "abc", "ABC");
        assertNotUnique("", "abc", "a", "abc");
        assertNotUnique(1, new Integer(1));
        assertNotUnique(null, 1, new Integer(1));
        assertNotUnique(null, null);
        assertNotUnique(null, "a", "b", null);
    }

    private void assertAreUnique(Object... objects) {
        assertTrue(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertNotUnique(Object... objects) {
        assertFalse(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    @test
    public void isAnyNull() throws Exception {
        //no nulls
        assertHasNoNull("abc", "ab", "a");
        assertHasNoNull("a", "b", "c");

        //has nulls
        assertHasNull(null);
        assertHasNull("", null, "abc");
        assertHasNull("abc", null, null);
        assertHasNull("a", "b", null);

    }
    private void assertHasNull(Object... objects) { assertTrue(Utils.isAnyNull(objects)); }

    private void assertHasNoNull(Object... objects) { assertFalse(Utils.isAnyNull(objects)); }
}
