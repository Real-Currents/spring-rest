package hello;

/**
 * Created by jhall on 12/21/2016.
 */
public class Resource {
    
    private final int id;
    private final String content;
    
    public Resource(int id, String content) {
        this.id = id;
        this.content = content;
    }
    
    public int getId () {
        return this.id;
    }
    
    public String getContent () {
        return this.content;
    }
}
