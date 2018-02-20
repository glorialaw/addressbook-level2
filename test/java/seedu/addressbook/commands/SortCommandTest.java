package seedu.addressbook.commands;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.ReadOnlyPerson;
import seedu.addressbook.util.TypicalPersons;

import java.util.*;

public class SortCommandTest {
    private final AddressBook addressBook = new TypicalPersons().getTypicalAddressBook();
    private final TypicalPersons td = new TypicalPersons();
    private List<ReadOnlyPerson> sortedList = Arrays.asList(td.amy, td.candy, td.dan);
    private List<ReadOnlyPerson> caseOneList = Arrays.asList(td.amy, td.candy, td.dan);
    private List<ReadOnlyPerson> caseTwoList = Arrays.asList(td.dan, td.candy, td.amy);

    @Test
    public void execute() throws IllegalValueException {
        //Already sorted list: matched
        assertFindCommandBehavior(caseOneList, sortedList;

        //Reverse order: matched
        assertFindCommandBehavior(caseTwoList, sortedList);

    }

    /**
     * Executes the sort command for the given list and verifies
     * the result matches the sorted list exactly.
     */

    private void assertFindCommandBehavior(List<ReadOnlyPerson> testingList, List<ReadOnlyPerson> expectedPersonList) {
        SortCommand command = createSortCommand(testingList);
        CommandResult result = command.execute();

        assertEquals(Command.getMessageforPersonSortedListShownSummary(expectedPersonList), result.feedbackToUser);
    }

    private SortCommand createSortCommand(List<ReadOnlyPerson> testingList ) {
        SortCommand command = new SortCommand();
        command.setData(addressBook, testingList);
        return command;
    }

}
