// Program Name: PenDistribution.java
// Purpose: To find pens per student and remaining pens

class PenDistribution {
    public static void main(String[] args) {

        // Total pens and students
        int totalPens = 14;
        int totalStudents = 3;

        // Calculate pens per student
        int pensPerStudent = totalPens / totalStudents;

        // Calculate remaining pens
        int remainingPens = totalPens % totalStudents;

        // Display output
        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
