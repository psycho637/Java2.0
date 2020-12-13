package study_сenter.reports;

import study_сenter.Program;
import study_сenter.persons.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShortReport implements Report{
    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yy HH:mm");

    public void showReportForStudent(Student currentStudent) {
        format.setLenient(false);
        Program program = currentStudent.getStudentProgram();
        Date programStartDate = program.getProgramStartDate();
        Date programStopDate = program.getProgramEndDate();
        StringBuilder shortInfo = new StringBuilder();
        shortInfo.append("Student: " + currentStudent.getName() + " " + currentStudent.getSurname() + "\n");
        shortInfo.append("Students program: " + program.getProgramName() + "\n");
        if (program.getProgramStartDate() != null) {
            shortInfo.append("Start: " + format.format(programStartDate) + "\n");
            shortInfo.append("Program duration: " + program.countProgramDuration() + " hours" + "\n");
            shortInfo.append("Program progress: " + program.showProgramProgress(programStartDate,programStopDate));
        } else {
            shortInfo.append("No assigned for student \n");
        }
        System.out.println(shortInfo.toString());
    }
}
