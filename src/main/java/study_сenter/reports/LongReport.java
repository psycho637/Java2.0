package study_сenter.reports;

import study_сenter.Program;
import study_сenter.persons.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LongReport implements Report {
    SimpleDateFormat format = new SimpleDateFormat("dd.MMMM.yyyy HH:mm:ss");

    @Override
    public void showReportForStudent(Student currentStudent) {
        format.setLenient(false);
        Program program = currentStudent.getStudentProgram();
        Date programStartDate = program.getProgramStartDate();
        Date programStopDate = program.getProgramEndDate();
        StringBuilder fullInfo = new StringBuilder();
        fullInfo.append("Student: " + currentStudent.getName() + " " + currentStudent.getSurname() + "\n");
        fullInfo.append("Students program: " + program.getProgramName() + "\n");
        fullInfo.append("Start: " + format.format(programStartDate) + "\n");
        fullInfo.append("Program duration: " + program.countProgramDuration() + " hours" + "\n");
        if (program.getCourses() != null) {
            fullInfo.append(program.showProgramCourses());
        } else {
            fullInfo.append("No assigned for student \n");
        }
        System.out.println(fullInfo.toString());
    }
}
