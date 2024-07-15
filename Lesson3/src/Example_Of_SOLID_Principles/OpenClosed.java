package Example_Of_SOLID_Principles;

import java.util.ArrayList;

public class OpenClosed {

    private static ArrayList<PaperWork> paperWorkArrayList = new ArrayList<>();
    private static int idCounter = 17000;

    public static void main(String[] args) throws Exception{

        // Inscriptions
        newIncription(new FirstYearStudent("Personal Identity Document Data"));
        newIncription(new ReEntryStudent("14101010"));
        newIncription(new TransferedStudent("Previous Study on X Study"));

        System.out.println("\nProcedures:");

        for (PaperWork paperWork: paperWorkArrayList) {
            System.out.println(paperWork);
        }


    }

    // interface instance
    public static void newIncription(Inscription inscription) {
        paperWorkArrayList.add(inscription.procedure(idCounter));
        idCounter++;
    }
}

class PaperWork {

    private int ID;
    private boolean automated;
    private String state, typeOfProcedure, information;

    public PaperWork(int _ID, boolean _automated, String _state, String _typeOfProcedure, String _information) {

        this.ID = _ID;
        this.automated = _automated;
        this.state = _state; // "InProcess" "Approved" "Rejected"
        this.typeOfProcedure = _typeOfProcedure; // "Inscription" "AssignCourses" "UnAssignCourse" ...
        this.information = _information; // Some data to Store

    }

    public String toString() {

        return this.ID + " " + this.state + " " + this.typeOfProcedure + " " +
                ((automated) ? "Automated" : "Manual") + "\n\t" + this.information;

    }

}

interface Inscription {

    public PaperWork procedure(int ID);
}

class FirstYearStudent implements Inscription {

    private String personalIdentityDocument;

    public FirstYearStudent(String _personalIdentityDocument) {

        this.personalIdentityDocument = _personalIdentityDocument;
    }

    @Override
    public PaperWork procedure(int ID) {

        System.out.println("Inscription of New Student");

        return new PaperWork(ID, false, "InProcess", "Inscription", personalIdentityDocument);
    }
}

class ReEntryStudent implements Inscription {

    private String studentId;

    public ReEntryStudent(String _studentId) {

        this.studentId = _studentId;
    }

    @Override
    public PaperWork procedure(int ID) {

        System.out.println("Inscription of Re-Entry Student");

        return new PaperWork(ID, true, "InProcess", "Inscription", studentId);
    }
}

class TransferedStudent implements Inscription {

    private String previousStudies;

    public TransferedStudent(String _previousStudies) {

        this.previousStudies = _previousStudies;
    }

    @Override
    public PaperWork procedure(int ID) {

        System.out.println("Inscription of Transffered Student");

        return new PaperWork(ID, false, "InProcess", "Inscription", previousStudies);
    }
}

