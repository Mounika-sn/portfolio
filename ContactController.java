@RestController
@CrossOrigin
public class ContactController {

    @PostMapping("/contact")
    public String receiveMessage(@RequestBody Contact contact) {
        return "Message received from " + contact.getName();
    }
}
