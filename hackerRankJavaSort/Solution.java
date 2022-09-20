package hackerRankJavaSort;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
//------------------------solution---------------------------
class SortStudents implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if (Double.compare(a.getCgpa(), b.getCgpa()) == 0) return a.getFname().compareTo(b.getFname());
        else if (a.getFname().equals(b.getFname())) return a.getId() - b.getId();
        else return (int)(1000*(b.getCgpa() - a.getCgpa()));
    }
}
//-----------------------------------------------------------
//Complete the code
public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        SortStudents sortSt = new SortStudents();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, sortSt);
        for(int i = 0; i < studentList.size(); i++){
            System.out.printf("%s\n", studentList.get(i).getFname());
        }

        in.close();
    }
}