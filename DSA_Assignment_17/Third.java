import java.util.*;

class Third {
    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();

        // Add all students to the queue
        for (int student : students) {
            queue.offer(student);
        }

        int notEaten = 0; // Count of students who are unable to eat
        int totalStudents = students.length; // Total number of students

        for (int i = 0; i < totalStudents; i++) {
            if (queue.isEmpty()) {
                break;
            }

            if (queue.peek() == sandwiches[i]) {
                queue.poll(); // The student takes the sandwich
                notEaten = 0; // Reset the count
            } else {
                queue.offer(queue.poll()); // The student goes to the queue's end
                notEaten++; // Increment the count of students unable to eat
            }
        }

        return queue.size(); // Remaining students in the queue are unable to eat
    }

    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        int notEaten = countStudents(students, sandwiches);
        System.out.println("Number of students unable to eat: " + notEaten);
    }
}
