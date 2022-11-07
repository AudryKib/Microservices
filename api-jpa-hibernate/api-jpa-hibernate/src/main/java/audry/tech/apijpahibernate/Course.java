package audry.tech.apijpahibernate;


@Entity
public class Course {

    @col
    private long id,
    private String name;
   private String Author;


    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        Author = author;
    }
}
