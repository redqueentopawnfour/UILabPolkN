package edu.uw.tcss450.polkn.uilab.ui.home.dummy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    public static final List<Student> STUDENTS = new ArrayList<Student>();
    public static final Map<String, Student> STUDENT_MAP = new HashMap<String, Student>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createStudent(i));
        }
    }

    private static void addItem(Student item) {
        STUDENTS.add(item);
        STUDENT_MAP.put(item.id, item);
    }

    private static Student createStudent(int position) {
        return new Student(String.valueOf(position), "Student Name " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class Student implements Serializable {
        public final String id;
        public final String name;
        public final String details;

        public Student(String id, String name, String details) {
            this.id = id;
            this.name = name;
            this.details = details;
        }

        /**
         * Get the Id.
         * @return the id
         */
        public String getId() {
            return id;
        }

        /**
         * Get the Name.
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * Get the Details.
         * @return the details
         */
        public String getDetails() {
            return details;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
