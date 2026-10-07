

public class ScanController {

    public void handleCommand(String command) {
        if (command.equals("add")) {
            System.out.println("add: id, name, duration, pause");
        }

        if (command.equals("view")) {
            System.out.println("view");
        }
       else if (command.equals("start")) {
            System.out.println("start");
        }
         else if (command.equals("stop")) {
            System.out.println("stop");
        }
         else if(command.equals("remove <id>")){
            System.out.println("remove <id>");
          }
        else if (command.equals("exit")) {
            System.out.println("Exiting...");
            System.exit(0);
        } 
        else {
            System.out.println("Unknown command: " + command);
        }
    }

}
