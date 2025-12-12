// get and set Methods syntax
public class Encaps {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args){
        Encaps person = new Encaps();
        person.setName("Yac");
        System.out.println(person.getName());
    }
}
