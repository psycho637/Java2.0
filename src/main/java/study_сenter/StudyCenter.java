package study_сenter;

import study_сenter.persons.Student;
import study_сenter.reports.LongReport;
import study_сenter.reports.Report;
import study_сenter.reports.ShortReport;

public class StudyCenter {
    public static void main(String[] args) {
        Student ivan = new Student("Ivan", "Ivanod");
        Course java = new Course("Java", 16);
        Course js = new Course("JavaScript", 10);
        Program program1 = new Program("02/12/2020 10:00", "Programming");
        Course courses[] = new Course[] {java, js};
        program1.addCoursesToProgram(courses);
        ivan.setStudentProgram(program1);
        program1.calcProgramEndDate();
        System.out.println("--------------Short Report--------------");
        Report shortreport = new ShortReport();
        shortreport.showReportForStudent(ivan);
        System.out.println("--------------Long Report--------------");
        Report longreport = new LongReport();
        longreport.showReportForStudent(ivan);
    }
}
