package seedu.addressbook.commands;

import seedu.addressbook.data.person.Person;

import java.util.Collections;
import java.util.List;

/**
 * Displays the list of contacts sorted by name.
 * Private contact details are shown.
 */

public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Displays all persons in the address book as a list sorted by first name.\n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute() {
        List<Person> allPersons = addressBook.getAllPersons().normalListView();
        Collections.sort(allPersons);
        return new CommandResult(getMessageforPersonSortedListShownSummary(allPersons), allPersons);
    }
}

