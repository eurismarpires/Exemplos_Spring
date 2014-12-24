package springlicao01;


public class HelloWorldMessage implements Message{
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "Hello " + name;
    }
   
}
