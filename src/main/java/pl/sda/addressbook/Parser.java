package pl.sda.addressbook;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.sda.addressbook.model.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * @author pmatusiak
 */
public class Parser {

    private Path file = Paths.get("addresses.csv");

    public List<Person> readFileWithList() throws IOException {
        List<String> data = Files.readAllLines(file);

        Person[] people = new Person[data.size()];
        int i = 0;

        for (String s : data) {
            String[] tab = s.split(",");
            Person realEstate = new Person(
                    tab[0].trim(),
                    tab[1].trim(),
                    tab[2].trim(),
                    tab[3].trim(),
                    tab[4].trim(),
                    tab[5].trim());
            people[i] = realEstate;
            i++;
        }
        return Arrays.asList(people);
    }
}
