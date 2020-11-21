package Algorithms.slidingWindow;

public class te {
    private StringBuilder contents = new StringBuilder();

    public void log(String message){
        contents.append(System.currentTimeMillis());
        contents.append(": ");
        contents.append(Thread.currentThread().getName());
        contents.append(message);
        contents.append("\n");
    }
    public String getContents(){
        return contents.toString();
    }

}
