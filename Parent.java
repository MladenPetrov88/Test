package Task6;

public class Parent {
    String parentName;
    String parentBirthday;

    public Parent(String parentName, String parentBirthday){
        this.parentName = parentName;
        this.parentBirthday = parentBirthday;
    }

    public String getParentName(){
        return parentName;
    }

    public String getParentBirthday(){
        return parentBirthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s", parentName, parentBirthday);
    }
}
