
package bar_2006676_p1;

public class Practitioner {
    
    
private String parctID;
private String Fname;
private String lName;
private String Status;
private int center;
private Practitioners next;



    public Practitioner() {
    }




    public String getParctID() {
        return parctID;
    }

    public void setParctID(String parctID) {
        this.parctID = parctID;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getCenter() {
        return center;
    }

    public void setCenter(int center) {
        this.center = center;
    }

    public Practitioners getNext() {
        return next;
    }

    public void setNext(Practitioners next) {
        this.next = next;
    }


}
