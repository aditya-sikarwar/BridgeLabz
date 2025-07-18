import java.util.*;

interface UserRequest {
    void process();
    String getName();
}
class ChatRequest implements UserRequest {
    String name;

    ChatRequest(String name) {
        this.name = name;
    }

    public void process() {
        System.out.println("Chat request from: " + name);
    }

    public String getName(){
        return name;
    }
}

class CallRequest implements UserRequest {
    String name;

    CallRequest(String name) {
        this.name = name;
    }

    public void process() {
        System.out.println("Call request from: " + name);
    }
    public String getName(){
        return name;
    }
}

class EmailRequest implements UserRequest {
    String name;

    EmailRequest(String name) {
        this.name = name;
    }

    public void process() {
        System.out.println("Email request from: " + name);
    }
    public String getName(){
        return name;
    }
}

public class CustomerSupport{
    public static void main(String[] args) {
        Queue<UserRequest> queue = new LinkedList<>();

        queue.add(new ChatRequest("Aditya"));
        queue.add(new CallRequest("Riya"));
        queue.add(new EmailRequest("John"));
        queue.add(new CallRequest("Vishwas"));
        queue.add(new ChatRequest("Arya"));
        queue.add(new EmailRequest("Ankit"));
        queue.add(new ChatRequest("Aditi"));
        queue.add(new CallRequest("Diya"));
        queue.add(new EmailRequest("Mohan"));
        queue.add(new CallRequest("Vikas"));
        queue.add(new ChatRequest("Aryan"));
        queue.add(new EmailRequest("Ankyy"));
        queue.add(new ChatRequest("VikramAditya"));
        queue.add(new CallRequest("Siya"));
        queue.add(new EmailRequest("Rohan"));
        queue.add(new CallRequest("Ram"));
        queue.add(new ChatRequest("Anya"));
        queue.add(new EmailRequest("Rahul"));
        queue.add(new ChatRequest("Vikki"));
        queue.add(new CallRequest("Divya"));
        queue.add(new EmailRequest("Shruti"));
        queue.add(new CallRequest("Muskan"));
        queue.add(new ChatRequest("Aanchal"));
        queue.add(new EmailRequest("Mridul"));
        List<UserRequest> requests = new ArrayList<>(queue);

        requests.sort(Comparator.comparing(UserRequest::getName));

        for(UserRequest request : requests){
            request.process();
        }
    }
}